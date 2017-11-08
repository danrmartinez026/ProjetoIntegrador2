/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.VendaException;
import models.Venda;
import modelvalidador.ValidadorVenda;
import mocks.MockVenda;
/**
 *
 * @author Danilo
 */
public class ServiceVenda {
    public static void inserirVenda(Venda venda) throws VendaException,DataSourceException{
        
        try{
            ValidadorVenda.validaVenda(venda);
            MockVenda.inserirVenda(venda);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}