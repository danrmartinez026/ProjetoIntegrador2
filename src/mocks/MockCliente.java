/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;


import models.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danilo.martinez
 */
public class MockCliente {
    
    public static void falsoCliente(){
        Cliente clienteLista = new Cliente();
        clienteLista.setNome("Danilo");
        clienteLista.setSobrenome("Martinez");
        clienteLista.setSexo("Masculino");
        clienteLista.setCpf("395.194.488-96");
        clienteLista.setRg("49.313.683-6");
        
        try{
        inserirCliente(clienteLista);
        } catch (Exception e){
            
        }
        
        Cliente clienteLista1 = new Cliente();
        clienteLista1.setNome("Ronaldo");
        clienteLista1.setSobrenome("Fenomeno");
        clienteLista1.setSexo("Masculino");
        clienteLista1.setCpf("394.194.488-96");
        clienteLista1.setRg("49.313.683-6");
        
        try{
        inserirCliente(clienteLista1);
        } catch (Exception e){
            
        }
        
        Cliente clienteLista2 = new Cliente();
        clienteLista2.setNome("Juliana");
        clienteLista2.setSobrenome("Juliete");
        clienteLista2.setSexo("Feminino");
        clienteLista2.setCpf("395.194.488-95");
        clienteLista2.setRg("49.313.683-6");
        
        try{
        inserirCliente(clienteLista2);
        } catch (Exception e){
            
        }
        
        
    }
    
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
    public static void excluirCliente(Cliente cliente)throws Exception{
        listaCliente.remove(cliente);
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
