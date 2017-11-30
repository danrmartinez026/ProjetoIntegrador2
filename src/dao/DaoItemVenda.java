/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ItemVenda;
import models.Livro;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class DaoItemVenda {
    
    
    
    public static void inserirItemVenda(int venda_id,ItemVenda item)throws SQLException, Exception{
        //Prepara uma string com os dados de preenchimento do livro
        String sql = "INSERT INTO item_venda (venda_id,livro_id,valor_unitario,quantidade)"
                + " VALUES (?,?,?,?)";
        
        //conexao para abertura e fechamento
        Connection connection = null;
        
        //atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            //abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            //Configura os parametros a serem excutados conforme a String  sql foi gerada
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


//        if(item != null){
//            for(ItemVenda itemVenda:venda.getListaItemVenda()){
//                if(item.getLivro().getId() == itemVenda.getLivro().getId()){
//                    itemVenda.setQuantidade(item.getQuantidade());
//                    return;
//                }
//            }
//            venda.getListaItemVenda().add(item);
//        }
    }
}
