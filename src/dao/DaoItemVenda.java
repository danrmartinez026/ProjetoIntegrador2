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
import java.util.ArrayList;
import java.util.List;
import models.ItemVenda;

/**
 *
 * @author Danilo
 */
public class DaoItemVenda {
    
    
    // com base no id da venda fornecido, insere os itens de venda no banco  de dados
    public static void inserirItemVenda(int venda_id,ItemVenda item)throws SQLException, Exception{
        //Prepara uma string com os dados de insercao dos itens
        String sql = "INSERT INTO item_venda (venda_id,livro_id,valor_unitario,quantidade)"
                + " VALUES (?,?,?,?)";
        
        // conexao para abertura e fechamento
        Connection connection = null;
        
        // atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // Configura os parametros a serem excutados conforme a String  sql foi gerada
            preparedStatement.setInt(1, venda_id);
            preparedStatement.setInt(2, item.getLivro().getId());
            preparedStatement.setFloat(3, Float.parseFloat(item.getLivro().getValor()));
            preparedStatement.setInt(4, item.getQuantidade());
            
            //executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    
    // recebe um id de venda e faz uma lista de itens de venda relacionado ao id fornecido
    public static List<ItemVenda> itensVenda(int id)throws SQLException, Exception{
        
        // faz uma busca no banco de dados com base no id de venda encontrado como chave 
        // estrangeira nos itens venda correspondentes
        String sql = "SELECT * FROM item_venda WHERE item_venda.venda_id =? ";

        // inicializa lista de retorno de venda
        List<ItemVenda> listaItens = null;
        
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
            
            // prepara o comando com o id fornecido
            preparedStatement.setInt(1, id);
            
            // execulta a query no banco de dados
            preparedStatement.execute();
            
            // Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // itera pelos resultados encontrados
            while(result.next()){
                // verifica se a lista esta nula, se estiver a instancia
                if(listaItens == null) listaItens = new ArrayList();
                    
                // instancia o item de venda para inserir o mesmo numa lista de itens
                ItemVenda item = new ItemVenda();
                
                // preenche o item com os valores correspondes
                item.setIdLivro(result.getInt("livro_id"));
                item.setQuantidade(result.getInt("quantidade"));
                item.setValorUnitario(result.getFloat("valor_unitario"));
                
                // adiciona o item preenchido por essa iteracao nos resultados encontrados
                listaItens.add(item);
                
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
        // faz uma condicional em caso de lista vazia
        if(listaItens != null){
            // itera pelo itens encontrados adicionando os livros aos itens
            // atraves do id dos livros
            for(ItemVenda item: listaItens){
                 item.setLivro(DaoLivro.obter(item.getIdLivro()));
            }
        }
        // retorna os itens encontrados
        return listaItens;
    }
}
