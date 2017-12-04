/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Validador;

import exceptions.ClienteException;
import dao.DaoCliente;
import java.sql.SQLException;
import models.Cliente;

/**
 *
 * @author Danilo
 */
public class ValidadorCliente {
    
    
    public static void validarCliente(Cliente cliente) throws ClienteException, Exception {
        
        if(cliente != null){
            if(cliente.getNome().equals("")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(cliente.getSobrenome().equals("")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            }
            
            try{
                if(cliente.getRg().equals("  .   .   - ")){
                    throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
                } else {
                    for(Cliente cli: DaoCliente.listar()){
                        if(cli.getRg().equals(cliente.getRg()) && cli.getId() != cliente.getId()){
                            throw new ClienteException ("RG ja cadastrado em outro cliente");
                        }
                    }
                }
            } catch (SQLException e){
                
            }
            
            if(cliente.getCpf().equals("   .   .   -  ")){
                throw new ClienteException ("Preencha todos os campos marcados com: ( * )");
            } else {
                String cpf = "";
                for(int i = 0 ; i <cliente.getCpf().length(); i++){
                    if(cliente.getCpf().charAt(i) != '.' && cliente.getCpf().charAt(i) != '-'){
                        cpf = cpf + cliente.getCpf().charAt(i);
                    }
                }
                if(!validarCpf(cpf)){
                    throw new ClienteException ("CPF invalido");
                }
                
                try{
                    for(Cliente cli: DaoCliente.listar()){
                        if(cli.getCpf().equals(cliente.getCpf()) && cli.getId() != cliente.getId()){
                            throw new ClienteException ("CPF ja cadastrado em outro cliente");
                        }
                    }
                } catch(SQLException e){
                    
                }
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
    
    
    
    public static boolean validarCpf (String cpf ){
        int     d1 = 0, d2 = 0;
        int     digito1 = 0, digito2 = 0, restoDig1 = 0;
        int     restoDig2 = 0 ,digitoCPF = 0;
        String  nDigResult;
        
        if (cpf.equals("00000000000") ||cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999")){
             return(false);
        }
        
        for (int nCount = 1; nCount < cpf.length(); nCount++){
            digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue();
            if(nCount < 10){
                d1 = d1 + ( 11 - nCount ) * digitoCPF;
            }
            d2 = d2 + ( 12 - nCount ) * digitoCPF;
        }
        
        restoDig1 = (d1 * 10) % 11;
        restoDig2 = (d2 * 10) % 11;
        
        if(restoDig1 == 10){
            restoDig1 = 0;
        }
        
        if(restoDig2 == 10){
            restoDig2 = 0;
        }
        
        int n1 = Integer.valueOf(cpf.substring(9, 10));
        int n2 = Integer.valueOf(cpf.substring(10,11));
        
        
        if(n1 == restoDig1 && n2 == restoDig2){
            return true;
        }
        
        return false;
       
    }
}
