/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.ItemVenda;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class DaoItemVenda {
    
    public static void inserirItemVenda(ItemVenda item, Venda venda){
        if(item != null){
            for(ItemVenda itemVenda:venda.getListaItemVenda()){
                if(item.getLivro().getId() == itemVenda.getLivro().getId()){
                    itemVenda.setQuantidade(item.getQuantidade());
                    return;
                }
            }
            venda.getListaItemVenda().add(item);
        }
    }
}
