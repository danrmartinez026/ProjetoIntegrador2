/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.ItemVendaException;
import dao.DaoItemVenda;
import models.ItemVenda;
import model_Validador.ValidadorItemVenda;

/**
 *
 * @author Danilo
 */
public class ServiceItemVenda {
    // valida a venda e o id e insere o item de venda no BD relacionado a venda fornecida como parametro
    public static void inserirItemVenda(int venda_id, ItemVenda item)throws ItemVendaException,DataSourceException{
        ValidadorItemVenda.validarItemVenda(venda_id , item);
        
        try{
            DaoItemVenda.inserirItemVenda(venda_id, item);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
