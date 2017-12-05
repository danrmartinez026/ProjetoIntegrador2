/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Statement;
import connection.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public static List<Venda> listaVenda = new ArrayList( );
    public static int totalVenda = 0;
    
    
    public static int inserirVenda(Venda venda)throws SQLException, Exception{
       //Prepara uma string com os dados de preenchimento do livro
        String sql = "INSERT INTO venda (cliente_id,data_compra)"
                + " VALUES (?,?)";
        int id=0;
        //conexao para abertura e fechamento
        Connection connection = null;
        
        //atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
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
        return id;
    }
    
    public static List<Venda> listar(Date inicio, Date fim) throws SQLException, Exception{
        // faz uma analise previa dos parametros recebidos afim
        // de melhorar a performance em caso de parametros nulos 
        // ou invalidos
        if(inicio == null || fim == null || inicio.after(fim)){
            return null;
        }
        
        String sql = "SELECT * FROM venda WHERE venda.data_compra BETWEEN ? AND ? ";

        // inicializa lista de retorno de venda
        List<Venda> listaRelatorio = null;
        
        // abre uma conxao com o banco de dados
        Connection connection = null;
        
        //atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            java.sql.Date dataInicio = new java.sql.Date(inicio.getTime());
            java.sql.Date dataFim = new java.sql.Date(fim.getTime());
            
            preparedStatement.setDate(1, dataInicio);
            preparedStatement.setDate(2, dataFim);
            
//            // execulta a query no banco de dados
//            preparedStatement.execute();
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // itera pelos resultados encontrados
            while(result.next()){
                // verifica se a lista esta nula, se estiver a instancia
                if(listaRelatorio == null) listaRelatorio = new ArrayList();
                    
                Venda venda = new Venda();
                
                venda.setIdCliente(result.getInt("cliente_id"));
                java.util.Date dataVenda = result.getDate("data_compra");
                venda.setData(dataVenda);
                venda.setIdVenda(result.getInt("venda_id"));
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
        
        if(listaRelatorio != null){
            for(Venda venda: listaRelatorio){
                venda.setCliente(DaoCliente.obterCliente(venda.getIdCliente()));
            }
        }
        return listaRelatorio;
    }
}
