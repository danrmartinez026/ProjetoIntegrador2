/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.ClienteException;
import exceptions.DataSourceException;
import mocks.MockCliente;
import models.Cliente;
import modelvalidador.ValidadorCliente;

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
    
    public static void excluirCliente(Cliente cliente) throws DataSourceException{
        try{
            MockCliente.excluirCliente(cliente);
        } catch(Exception e){
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
