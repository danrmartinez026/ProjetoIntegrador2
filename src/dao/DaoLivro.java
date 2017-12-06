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
import models.Livro;

/**
 *
 * @author Danilo
 */
public class DaoLivro {
    
    // insere um livro no banco de dados com o livro fornecido como parametro
    public static void inserirLivro(Livro livro)throws Exception{
        // Prepara uma string com os dados de preenchimento do livro
        String sql = "INSERT INTO livro (titulo,autor,editora,edicao,estoque,valor,"
                + "genero,idioma,isbn,altura,largura,peso,numero_paginas,enabled)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        //conexao para abertura e fechamento
        Connection connection = null;
        
        //atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // Configura os parametros a serem excutados conforme a String  sql foi gerada
            preparedStatement.setString(1, livro.getTitulo());
            preparedStatement.setString(2, livro.getAutor());
            preparedStatement.setString(3, livro.getEditora());
            preparedStatement.setString(4, livro.getEdicao());
            preparedStatement.setInt(5, livro.getEstoque());
            preparedStatement.setString(6, livro.getValor());
            preparedStatement.setString(7, livro.getGenero());
            preparedStatement.setString(8, livro.getIdioma());
            preparedStatement.setString(9, livro.getIsbn());
            preparedStatement.setString(10, livro.getAltura());
            preparedStatement.setString(11, livro.getLargura());
            preparedStatement.setString(12, livro.getPeso());
            preparedStatement.setString(13, livro.getNumeroPaginas());
            preparedStatement.setBoolean(14, true);
            
            // executa o comando no banco de dados
            preparedStatement.execute();
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
    }
    
    // atualiza o livro no banco de dados de acordo com o novo livro editado 
    // pelo usuario porem como o mesmo id
    public static void atualizarLivro(Livro livro)throws Exception, SQLException{
        if(livro != null && livro.getId() != null && !listar().isEmpty()){

                // Prepara uma string com os dados de preenchimento do livro para atualizar o mesmo
            String sql = "UPDATE livro SET titulo=?, autor=?, editora=?, edicao=?, estoque=?, valor=?,"
                    + "genero=?, idioma=?, isbn=?, altura=?, largura=?, peso=?, numero_paginas=?"
                    + "WHERE (livro_id=?)";

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
                preparedStatement.setString(1, livro.getTitulo());
                preparedStatement.setString(2, livro.getAutor());
                preparedStatement.setString(3, livro.getEditora());
                preparedStatement.setString(4, livro.getEdicao());
                preparedStatement.setInt(5, livro.getEstoque());
                preparedStatement.setString(6, livro.getValor());
                preparedStatement.setString(7, livro.getGenero());
                preparedStatement.setString(8, livro.getIdioma());
                preparedStatement.setString(9, livro.getIsbn());
                preparedStatement.setString(10, livro.getAltura());
                preparedStatement.setString(11, livro.getLargura());
                preparedStatement.setString(12, livro.getPeso());
                preparedStatement.setString(13, livro.getNumeroPaginas());
                preparedStatement.setInt(14, livro.getId());

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
    }
    
    public static List<Livro> listar() throws SQLException, Exception{
        // prepara script de consulta no banco de dados
        // procurara por todos os livros ativos
        String sql = "SELECT * FROM livro WHERE (livro.enabled)";
        
        // prepara uma lista para retornar os livros encontrados
        ArrayList<Livro> listaLivro = null;
        
        // prepara conexao com o banco de dados
        PreparedStatement preparedStatement = null;
        
        // Conexão para abertura e fechamento
        Connection connection = null;
        
        // prepara recebimento dos itens achados na consulta
        ResultSet result = null;
        
        try{
            connection = ConnectionUtils.getConnection();
            
            // cria um statement para consulta SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // itera por cada item do resultado
            while(result.next()){
                
                // Contornando nullPointer Exception
                if (listaLivro == null) {
                    listaLivro= new ArrayList<Livro>();
                }
                
                // prepara livro para ser inserido na lista de livros que sera
                // usado fora do banco de dados
                Livro livro = new Livro();
                
                // popula o livro com os dados de cada resultado correspondente
                livro.setId(result.getInt("livro_id"));
                livro.setTitulo(result.getString("titulo"));
                livro.setAutor(result.getString("autor"));
                livro.setEditora(result.getString("editora"));
                livro.setEdicao(result.getString("edicao"));
                livro.setGenero(result.getString("genero"));
                livro.setIdioma(result.getString("idioma"));
                livro.setIsbn(result.getString("isbn"));
                livro.setEstoque(result.getInt("Estoque"));
                livro.setValor(result.getString("valor"));
                livro.setAltura(result.getString("altura"));
                livro.setLargura(result.getString("largura"));
                livro.setPeso(result.getString("peso"));
                livro.setNumeroPaginas(result.getString("numero_paginas"));
                
                // Adiciona a instância na lista
                listaLivro.add(livro);
            }
        } finally {
            // Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            // Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            // Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        // retorna a lista de livros encontrados
        return listaLivro;
    }
    
    
    // exclui logicamente um livro do banco de dados
    public static void excluirLivro(Livro livro)throws Exception{
        
        // Prepara uma string para fazer UPDATE no banco de dados
        String sql = "UPDATE livro SET enabled=? WHERE (livro_id=?)";
        
        // conexao para abertura e fechamento
        Connection connection = null;
        
        // atraves da conexao, ira executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            // abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // exclui logicamente o livro
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, livro.getId());
            
            // executa o comando sql
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
    
    // recebe um livro e uma quantidade e atualiza o estoque deste livro no banco de dados
    public static void atualizarEstoque(Livro livro, int quantidade)throws SQLException, Exception{
        if(livro != null && livro.getId() != null && !listar().isEmpty()){

            // Prepara uma string com os dados de preenchimento do livro para atualizar o mesmo
            String sql = "UPDATE livro SET estoque=? WHERE (livro_id=?)";

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
                preparedStatement.setInt(1, livro.getEstoque() - quantidade);
                preparedStatement.setInt(2, livro.getId());

                // executa o comando no banco de dados
                preparedStatement.execute();
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
        }    
    }
    
    // retorna um livro encotnrado no banco de dados, que tiver o mesmo id 
    // fornecido como parametro
    public static Livro obter(Integer id)throws SQLException,Exception{
        // faz uma analise previa visando aumentar a performance em caso de pesquisa nula
        if(id == null){
            return null;
        }
         
        // apartir de um id de um livro,procura o mesmo no banco de dados
        String sql = "SELECT * FROM livro WHERE livro_id=?";
        // prepara um instancia para receber o lviro encontrado
        Livro livro = new Livro();
        // Conexão para abertura e fechamento
        Connection connection = null;
        // Statement para obtenção através da conexão, execução de
        // comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        // Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try {
            // Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            // Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            
            
            
            // Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // Itera por cada item do resultado
            while (result.next()) {
                
                // popula a instancia do livro encontrado mo BD
                livro.setId(result.getInt("livro_id"));
                livro.setTitulo(result.getString("titulo"));
                livro.setAutor(result.getString("autor"));
                livro.setEditora(result.getString("editora"));
                livro.setEdicao(result.getString("edicao"));
                livro.setGenero(result.getString("genero"));
                livro.setIdioma(result.getString("idioma"));
                livro.setIsbn(result.getString("isbn"));
                livro.setEstoque(result.getInt("Estoque"));
                livro.setValor(result.getString("valor"));
                livro.setAltura(result.getString("altura"));
                livro.setLargura(result.getString("largura"));
                livro.setPeso(result.getString("peso"));
                livro.setNumeroPaginas(result.getString("numero_paginas"));
            }
        } finally {
            // Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            // Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            // Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna o livro encontrado no banco de dados
        return livro;
    }
    
    // faz uma pesquisa no banco de dados usando os parametros fornecidos
    public static List<Livro> procurarLivro(String titulo,String autor, String editora,String genero)
            throws SQLException,Exception{
        
        // faz uma analise previa visando aumentar a performance em caso de pesquisa nula
        if(titulo.equals("") && autor.equals("") && editora.equals("") && genero.equals("")){
            return null;
        }
        
        //anula resultados nao imputados pelo usuario
        if(titulo.equals("")) titulo = null;
        if(autor.equals(""))autor = null;
        if(editora.equals(""))editora = null;
        if(genero.equals(""))genero = null;
         
        
        // prepara o comando de pesquisa no banco de dados com os parametros informados
        String sql = "SELECT * FROM livro WHERE ((UPPER(livro.titulo) LIKE UPPER(?) "
            + "OR UPPER(livro.autor) LIKE UPPER(?) OR (livro.editora) LIKE(?))"
                + "OR (UPPER(livro.genero) LIKE UPPER (?))  AND enabled=?)";
        // lista de livros contendo o resultado da pesquisa
        List<Livro> listaResultado = null;
        // Conexão para abertura e fechamento
        Connection connection = null;
        // Statement para obtenção através da conexão, execução de
        // comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        // Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try {
            // Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            // Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            // Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + titulo + "%");
            preparedStatement.setString(2, "%" + autor + "%");
            preparedStatement.setString(3, "%" + editora + "%");
            preparedStatement.setString(4, "%" + genero + "%");
            preparedStatement.setBoolean(5, true);
            
            
            // Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            // Itera por cada item do resultado
            while (result.next()) {
                // Se a lista não foi inicializada, a inicializa
                if (listaResultado == null) {
                    listaResultado = new ArrayList<Livro>();
                }
                // Cria uma instância de Livro e popula com os valores do BD
                Livro livro = new Livro();
                
                livro.setId(result.getInt("livro_id"));
                livro.setTitulo(result.getString("titulo"));
                livro.setAutor(result.getString("autor"));
                livro.setEditora(result.getString("editora"));
                livro.setEdicao(result.getString("edicao"));
                livro.setGenero(result.getString("genero"));
                livro.setIdioma(result.getString("idioma"));
                livro.setIsbn(result.getString("isbn"));
                livro.setEstoque(result.getInt("Estoque"));
                livro.setValor(result.getString("valor"));
                livro.setAltura(result.getString("altura"));
                livro.setLargura(result.getString("largura"));
                livro.setPeso(result.getString("peso"));
                livro.setNumeroPaginas(result.getString("numero_paginas"));
                
                // Adiciona a instância na lista
                listaResultado.add(livro);
            }
        } finally {
            // Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            // Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            // Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        // Retorna a lista de clientes do banco de dados
        return listaResultado;  
    }     
}
