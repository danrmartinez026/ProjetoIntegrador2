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
import models.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danilo.martinez
 */
public class DaoCliente {
    
    //insere um cliente no banco de dados
    public static void inserirCliente(Cliente cliente) throws Exception{
        
        //Prepara uma string com os dados de preenchimento de cliente
        String sql = "INSERT INTO Cliente (nome,sobrenome,sexo,cpf,rg,rua,"
                + "cidade,estado,numero_casa,complemento,cep,bairro,celular,telefone,email,enabled)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSobrenome());
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getRg());
            preparedStatement.setString(6, cliente.getRua());
            preparedStatement.setString(7, cliente.getCidade());
            preparedStatement.setString(8, cliente.getEstado());
            preparedStatement.setString(9, cliente.getNumeroCasa());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getCep());
            preparedStatement.setString(12, cliente.getBairro());
            preparedStatement.setString(13, cliente.getCelular());
            preparedStatement.setString(14, cliente.getTelefone());
            preparedStatement.setString(15, cliente.getEmail());
            preparedStatement.setBoolean(16, true);
            
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
    
    
    //recebe um cliente e o atualiza
    public static void atualizarCliente(Cliente cliente) throws Exception {
        if(cliente == null && cliente.getId() == null || listar().isEmpty()){
            return;
        }
        //Prepara uma string com os dados de preenchimento de cliente para atualizar o mesmo
        String sql = "UPDATE cliente SET nome=?, sobrenome=?, sexo=?, cpf=?, rg=?, rua=?,"
                + "cidade=?, estado=?, numero_casa=?, complemento=?, cep=?,bairro=?, celular=?, telefone=?, email=?"
                + "WHERE (cliente_id=?)";
        
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
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSobrenome());
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getRg());
            preparedStatement.setString(6, cliente.getRua());
            preparedStatement.setString(7, cliente.getCidade());
            preparedStatement.setString(8, cliente.getEstado());
            preparedStatement.setString(9, cliente.getNumeroCasa());
            preparedStatement.setString(10, cliente.getComplemento());
            preparedStatement.setString(11, cliente.getCep());
            preparedStatement.setString(12, cliente.getBairro());
            preparedStatement.setString(13, cliente.getCelular());
            preparedStatement.setString(14, cliente.getTelefone());
            preparedStatement.setString(15, cliente.getEmail());
            preparedStatement.setInt(16, cliente.getId());
            
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
//            
//            CODIGO MOCK
//            
//            for(Cliente clienteLista: listaCliente){
//                if(cliente.getId() == clienteLista.getId() && clienteLista != null){
//                    clienteLista.setNome(cliente.getNome());
//                    clienteLista.setSobrenome(cliente.getSobrenome());
//                    clienteLista.setSexo(cliente.getSexo());
//                    clienteLista.setCpf(cliente.getCpf());
//                    clienteLista.setRg(cliente.getRg());
//                    clienteLista.setCelular(cliente.getCelular());
//                    clienteLista.setEmail(cliente.getEmail());
//                    clienteLista.setTelefone(cliente.getTelefone());
//                    clienteLista.setCidade(cliente.getCidade());
//                    clienteLista.setRua(cliente.getRua());
//                    clienteLista.setBairro(cliente.getBairro());
//                    clienteLista.setEstado(cliente.getEstado());
//                    clienteLista.setTelefone(cliente.getTelefone());
//                    clienteLista.setComplemento(cliente.getComplemento());
//                    clienteLista.setNumeroCasa(cliente.getNumeroCasa());
//                }
//            }
        
    }
    
    //recebe um cliente e procura na lista um cliente de mesmo id para exclui-lo logicamente
    public static void excluirCliente(Cliente cliente)throws Exception{
        
        //Prepara uma string para fazer UPDATE no banco de dados
        String sql = "UPDATE cliente SET enabled=? WHERE (cliente_id=?)";
        
        //conexao para abertura e fechamento
        Connection connection = null;
        
        //atraves da conexao ira, executar comandos sql
        PreparedStatement preparedStatement = null;
        
        try{
            //abre uma conxao com o banco de dados
            connection = ConnectionUtils.getConnection();
            
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            //exclui logicamente o cliente
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, cliente.getId());
            
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
        
        //listar().remove(cliente);
    }
    
    public static Cliente obterCliente(Integer id)throws SQLException, Exception{
        // faz uma analise previa visando aumentar a performance em caso de pesquisa nula
        if(id == null){
            return null;
        }
         
        //apartir de um id de um cliente,procura o mesmo no banco de dados
        String sql = "SELECT * FROM cliente WHERE cliente_id=?";
        //lista de cliente contendo o resultado da pesquisa
        Cliente cliente = new Cliente();
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            
            
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                
                cliente.setId(result.getInt("cliente_id"));
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setRg(result.getString("rg"));
                cliente.setRua(result.getString("rua"));
                cliente.setNumeroCasa(result.getString("numero_casa"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCep(result.getString("cep"));
                cliente.setCelular(result.getString("celular"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEmail(result.getString("email"));
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna o cliente encontrado no banco de dados
        return cliente;
    }
    
    public static List<Cliente> listar()
            throws SQLException,Exception {       
        //Retorna a lista de clientes
        
        //prepara script de consulta no banco de dados
        //procurara por todos os clientes ativos
        String sql = "SELECT * FROM cliente WHERE (cliente.enabled)";
        
        //prepara uma lista para retornar os cliente encontrados
        ArrayList<Cliente> listaCliente = null;
        
        //prepara conexao com o banco de dados
        PreparedStatement preparedStatement = null;
        
        //Conexão para abertura e fechamento
        Connection connection = null;
        
        //prepara recebimento dos itens achados na consulta
        ResultSet result = null;
        
        try{
            connection = ConnectionUtils.getConnection();
            
            //cria um statement para consulta SQL
            preparedStatement = connection.prepareStatement(sql);
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //itera por cada item do resultado
            while(result.next()){
                
                //Contornando nullPointer Exception
                if (listaCliente == null) {
                    listaCliente = new ArrayList<Cliente>();
                }
                
                //prepara cliente para ser inserido na lista de clientes que sera
                //usado fora do banco de dados
                Cliente cliente = new Cliente();
                
                //popula o cliente com os dados de cada resultado correspondente
                cliente.setId(result.getInt("cliente_id"));
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setRua(result.getString("rua"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                cliente.setNumeroCasa(result.getString("numero_casa"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCep(result.getString("cep"));
                cliente.setCelular(result.getString("celular"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEmail(result.getString("email"));
                
                //Adiciona a instância na lista
                listaCliente.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaCliente;
    }
    
    //faz uma lista de cliente com base numa cadeida de caracteres como parâmetro
    public static List<Cliente> procurarCliente(String nome, String sobrenome, String cpf)
            throws SQLException,Exception{
        
        // faz uma analise previa visando aumentar a performance em caso de pesquisa nula
        if(nome.equals("") && sobrenome.equals("") && cpf.equals("")){
            return null;
        }
        
        //anula resultados nao imputados pelo usuario
        if(nome.equals("")) nome = null;
        if(sobrenome.equals(""))sobrenome = null;
        if(cpf.equals("   .   .   -  "))cpf = null;
         
        
        //Monta a string de consulta de clientes no banco, utilizando
        //o valor passado como parâmetro para busca nas colunas de
        //nome ou sobrenome (através do "LIKE" e ignorando minúsculas
        //ou maiúsculas, através do "UPPER" aplicado à coluna e ao
        //parâmetro). Além disso, também considera apenas os elementos
        //que possuem a coluna de ativação de clientes configurada com
        //o valor correto ("enabled" com "true")
        String sql = "SELECT * FROM cliente WHERE ((UPPER(cliente.nome) LIKE UPPER(?) "
            + "OR UPPER(cliente.sobrenome) LIKE UPPER(?) OR (cliente.cpf) LIKE(?)) AND enabled=?)";
        //lista de cliente contendo o resultado da pesquisa
        List<Cliente> listaResultado = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + nome + "%");
            preparedStatement.setString(2, "%" + sobrenome + "%");
            preparedStatement.setString(3, "%" + cpf + "%");
            preparedStatement.setBoolean(4, true);
            
            
            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();
            
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaResultado == null) {
                    listaResultado = new ArrayList<Cliente>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                
                cliente.setId(result.getInt("cliente_id"));
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setRua(result.getString("rua"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setEstado(result.getString("estado"));
                cliente.setNumeroCasa(result.getString("numero_casa"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCep(result.getString("cep"));
                cliente.setCelular(result.getString("celular"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setEmail(result.getString("email"));
                
                //Adiciona a instância na lista
                listaResultado.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaResultado;
    
        
        //          CODIGO MOCK
//        
//        if(nome.equals("") && sobrenome.equals("") && cpf.equals("")){
//            return null;
//        }
//        
//        for(Cliente cliente: listaCliente){
//            if(cliente.getNome().toUpperCase().contains(nome.toUpperCase()) && !nome.equals("")){
//                if(!listaResultado.contains(cliente)){
//                    listaResultado.add(cliente);
//                }
//            }
//            
//            if(cliente.getSobrenome().toUpperCase().contains(sobrenome.toUpperCase()) && !sobrenome.equals("")){
//                if(!listaResultado.contains(cliente)){
//                    listaResultado.add(cliente);
//                }
//            }
//            
//            if(cliente.getCpf().equals(cpf) && !cpf.equals("")){
//                if(!listaResultado.contains(cliente)){
//                    listaResultado.add(cliente);
//                }
//            }
//        }
//        
//        return listaResultado;
    }
    
            
}
