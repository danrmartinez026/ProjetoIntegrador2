/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import exceptions.VendaException;

/**
 *
 * @author Danilo
 */
public class ValidadorVenda {
    public static void validaVenda(Venda venda) throws VendaException{
        if(venda.getCliente() == null){
            throw new VendaException("Nao foi informado um cliente");
        }
        
        if(venda.getListaItemVenda() == null){
            throw new VendaException("Nao foi informado um produto");
        }
        
        if(venda.getData() == null){
            throw new VendaException("Data da Venda invalida");
        }
        
        
    }
}
