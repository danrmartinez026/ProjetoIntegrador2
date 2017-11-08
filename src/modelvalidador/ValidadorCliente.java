/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelvalidador;

import exceptions.ClienteException;
import models.Cliente;

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
            
            if(!cliente.getRua().equals("")){
            }
            
            if(!cliente.getBairro().equals("")){
            }
            
            if(!cliente.getCidade().equals("")){
            }
            
            if(!cliente.getNumeroCasa().equals("")){
            }
            
            if(!cliente.getComplemento().equals("")){
            }
            
            if(!cliente.getEstado().equals("")){
            }
            
            if(!cliente.getCep().equals("")){
            }
            
            if(!cliente.getCelular().equals("")){
            }
            
            if(!cliente.getTelefone().equals("")){
            }
            
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
