/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelvalidador;

import exceptions.ItemVendaException;
import models.ItemVenda;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class ValidadorItemVenda {
    public static void validarItemVenda(ItemVenda item, Venda venda) throws ItemVendaException{
        if(item.getLivro() == null){
            throw new ItemVendaException("Selecione um livro");
        }
        if(item.getQuantidade() <= 0){
            throw new ItemVendaException("Selecione uma quantidade maior que 0");
        }
        
        for(ItemVenda itemVenda : venda.getListaItemVenda()){
            if(itemVenda.getLivro().getId() == item.getLivro().getId() 
                    && itemVenda.getQuantidade() == item.getQuantidade() ){
                throw new ItemVendaException("Selecione um livro diferente ou uma quantidade diferente");
            } 
        }
    }
}
