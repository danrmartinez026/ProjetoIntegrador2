/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class DaoVenda {

    // insere uma venda no banco de dados, a partir de uma instancia de venda 
    // fornecida como parametro
    public static int inserirVenda(Venda venda)throws SQLException, Exception{
       //Prepara uma string com os dados da venda fornecida
        String sql = "INSERT INTO venda (cliente_id,data_compra)"
                + " VALUES (?,?)";
        int id=0;
        // conexao para abertura e fechamento
        Connection connection = null;
        
        // atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL,
            // e retorno da chave gerada
            preparedStatement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            
            // Configura os parametros a serem excutados conforme a String  sql foi gerada
            preparedStatement.setInt(1, venda.getCliente().getId());
            Timestamp t = new Timestamp(venda.getData().getTime());
            preparedStatement.setTimestamp(2, t);
            
            // executa o comando no banco de dados
            preparedStatement.execute();
            
            // faz uma consulta acerca da chave primaria da venda gerada
            // no insert anterior
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                id =(generatedKeys.getInt(1));
            }
        } finally {
            // Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            // Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        // retorna o id de venda gerado para ser inserido nos itens de venda
        // pertencentes a esta venda
        return id;
    }
    
    // procura por todas as vendas com data corresponde ao periodo fornecido
    public static List<Venda> listar(Date inicio, Date fim) throws SQLException, Exception{
        // faz uma analise previa em caso de parametros nulos 
        // ou invalidos
        if(inicio == null || fim == null || inicio.after(fim)){
            return null;
        }
        
        String sql = "SELECT * FROM venda WHERE venda.data_compra BETWEEN ? AND ? ";

        // inicializa lista de retorno de venda
        List<Venda> listaRelatorio = null;
        
        // abre uma conxao com o banco de dados
        Connection connection = null;
        
        // atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        // Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // faz a conversao de datas para o formato aceitavel pelo BD
            java.sql.Date dataInicio = new java.sql.Date(inicio.getTime());
            java.sql.Date dataFim = new java.sql.Date(fim.getTime());
            
            // prepara o comando de pesquisa,com as datas fornecidas
            preparedStatement.setDate(1, dataInicio);
            preparedStatement.setDate(2, dataFim);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // itera pelos resultados encontrados
            while(result.next()){
                // verifica se a lista esta nula, se estiver a instancia
                if(listaRelatorio == null) listaRelatorio = new ArrayList();
                
                // instancia uma venda para inserir a mesma na lista
                Venda venda = new Venda();
                
                // popula cada instancia de venda encontrada
                venda.setIdCliente(result.getInt("cliente_id"));
                java.util.Date dataVenda = result.getDate("data_compra");
                venda.setData(dataVenda);
                venda.setIdVenda(result.getInt("venda_id"));
                // insere a instancia na lista de vendas usada posteriormente no relatorio
                listaRelatorio.add(venda);
            }
            
        } finally {
            // Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            // Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        
        // insere cliente na lista de venda com base no id de cliente gerado na pesquisa
        if(listaRelatorio != null){
            for(Venda venda: listaRelatorio){
                venda.setCliente(DaoCliente.obterCliente(venda.getIdCliente()));
            }
        }
        // retorna a lista de vendas que sera usada no relatorio
        return listaRelatorio;
    }
}
