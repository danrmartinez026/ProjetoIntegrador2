/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelvalidador;

import exceptions.ClienteException;
import mocks.MockCliente;
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
                
                for(Cliente cli: MockCliente.listaCliente){
                    if(cli.getCpf().equals(cliente.getCpf())){
                        throw new ClienteException ("CPF ja cadastrado em outro cliente");
                    }
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
        int     d1, d2;
        int     digito1, digito2, resto;
        int     digitoCPF;
        String  nDigResult;
        
        if (cpf.equals("00000000000") ||cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999")){
             return(false);
        }
        
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        
        for (int nCount = 1; nCount < cpf.length() -1; nCount++){
            digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue();
            d1 = d1 + ( 11 - nCount ) * digitoCPF;
            d2 = d2 + ( 12 - nCount ) * digitoCPF;
        }
        
        resto = (d1 % 11);
        
        if (resto < 2){
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
            d2 += 2 * digito1;
            resto = (d2 % 11);
        }
        
        if (resto < 2){
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
            String nDigVerific = cpf.substring (cpf.length()-2, cpf.length());
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
            return nDigVerific.equals(nDigResult);
        }
        return false;
    }
}
