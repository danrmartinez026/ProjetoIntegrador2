/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceCliente;

import exceptions.ClienteException;
import exceptions.DataSourceException;
import mockCliente.MockCliente;
import modelCliente.Cliente;
import modelValidadorCliente.ValidadorCliente;

/**
 *
 * @author Danilo
 */
public class ServiceCliente {
    public static void cadastrarCliente(Cliente cliente)throws ClienteException, DataSourceException{
        ValidadorCliente.validarCliente(cliente);
        try{
            MockCliente.inserirCliente(cliente);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void atualizarCliente(Cliente cliente)throws ClienteException, DataSourceException{
        ValidadorCliente.validarCliente(cliente);
        try{
            
            MockCliente.atualizarCliente(cliente);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
