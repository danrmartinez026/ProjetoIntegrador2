/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Validador;

import exceptions.ItemVendaException;
import models.ItemVenda;

/**
 *
 * @author Danilo
 */
public class ValidadorItemVenda {
    // valida o item de venda antes de usa-lo em oiutras partes do sistema
    public static void validarItemVenda(int venda_id, ItemVenda item) throws ItemVendaException{
        // verifica se o item nao esta nulo
        if(item.getLivro() == null){
            throw new ItemVendaException("Selecione um livro");
        }
        // verifica se ha uma quantidade de livros inserida no item
        if(item.getQuantidade() <= 0){
            throw new ItemVendaException("Selecione uma quantidade maior que 0");
        }
    }
}
