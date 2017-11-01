/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockCliente;


import modelCliente.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danilo.martinez
 */
public class MockCliente {
    
    //gerador de id
    private static int totalCliente = 0;
    
    //lista de clientes 
    public static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
    //insere um cliente mock(falso)
    public static void inserirCliente(Cliente cliente) throws Exception{
        cliente.setId(totalCliente++);
        listaCliente.add(cliente);
    }
    
    
    //recebe um cliente e o atualiza
    public static void atualizarCliente(Cliente cliente) throws Exception {
        if(cliente != null && cliente.getId() != null && !listaCliente.isEmpty()){
            for(Cliente clienteLista: listaCliente){
                if(cliente.getId() == clienteLista.getId() && clienteLista != null){
                    clienteLista.setNome(cliente.getNome());
                    clienteLista.setSobrenome(cliente.getSobrenome());
                    clienteLista.setSexo(cliente.getSexo());
                    clienteLista.setCpf(cliente.getCpf());
                    clienteLista.setRg(cliente.getRg());
                    clienteLista.setCelular(cliente.getCelular());
                    clienteLista.setEmail(cliente.getEmail());
                    clienteLista.setTelefone(cliente.getTelefone());
                    clienteLista.setCidade(cliente.getCidade());
                    clienteLista.setRua(cliente.getRua());
                    clienteLista.setBairro(cliente.getBairro());
                    clienteLista.setEstado(cliente.getEstado());
                    clienteLista.setTelefone(cliente.getTelefone());
                    clienteLista.setComplemento(cliente.getComplemento());
                    clienteLista.setNumeroCasa(cliente.getNumeroCasa());
                }
            }
        }
    }
    
    //recebe um id e procura na lista um cliente de mesmo id para exclui-lo
    public static void excluirCliente(Integer id)throws Exception{
        for(Cliente cliente: listaCliente){
            if(id == cliente.getId() && !listaCliente.isEmpty()){
                listaCliente.remove(cliente);
            }
        }
    }
    
    public static List<Cliente> listar()
            throws Exception {       
        //Retorna a lista de clientes
        return listaCliente;
    }
    
    //faz uma lista de cliente com base numa cadeida de caracteres como parâmetro
    public static List<Cliente> procurarCliente(String nome, String sobrenome, String cpf){
        List<Cliente> listaResultado = new ArrayList();
        
        if(nome.equals("") && sobrenome.equals("") && cpf.equals("")){
            return null;
        }
        
        for(Cliente cliente: listaCliente){
            if(cliente.getNome().toUpperCase().contains(nome.toUpperCase()) && !nome.equals("")){
                if(!listaResultado.contains(cliente)){
                    listaResultado.add(cliente);
                }
            }
            
            if(cliente.getSobrenome().toUpperCase().contains(sobrenome.toUpperCase()) && !sobrenome.equals("")){
                if(!listaResultado.contains(cliente)){
                    listaResultado.add(cliente);
                }
            }
            
            if(cliente.getCpf().equals(cpf) && !cpf.equals("")){
                if(!listaResultado.contains(cliente)){
                    listaResultado.add(cliente);
                }
            }
        }
        
        return listaResultado;
    }
            
}
