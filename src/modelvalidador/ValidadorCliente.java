/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelValidadorCliente;

import exceptions.ClienteException;
import modelCliente.Cliente;

/**
 *
 * @author Danilo
 */
public class ValidadorCliente {
    public static void validarCliente(Cliente cliente) throws ClienteException{
        if(cliente != null){
            if(cliente.getNome().equals("")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(cliente.getSobrenome().equals("")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(cliente.getRg().equals("  .   .   - ")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(cliente.getCpf().equals("   .   .   -  ")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(cliente.getSexo().equals("")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
//            
//            if(cliente.getRua().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getBairro().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getCidade().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getNumeroCasa().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getComplemento().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getEstado().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getCep().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getCelular().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
//            if(cliente.getTelefone().equals("")){
//                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
//            }
//            
            if(!cliente.getEmail().equals("")){
                if(cliente.getEmail().lastIndexOf(".com") == -1 && !cliente.getEmail().contains("@")){
                    throw new ClienteException ("Preencha o campo email corretamente");
                }
            
                
                
            }
        } else {
            throw new ClienteException ("Nao foi informado um cliente");
        }
    }
}
