/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.ItemVendaException;
import mocks.MockItemVenda;
import models.ItemVenda;
import models.Venda;
import modelvalidador.ValidadorItemVenda;

/**
 *
 * @author Danilo
 */
public class ServiceItemVenda {
    public static void inserirItemVenda(ItemVenda item, Venda venda)throws ItemVendaException,DataSourceException{
        ValidadorItemVenda.validarItemVenda(item , venda);
        
        try{
            MockItemVenda.inserirItemVenda(item, venda);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
