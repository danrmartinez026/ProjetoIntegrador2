/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Validador;

import exceptions.VendaException;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class ValidadorVenda {
    // valida uma venda, para que outras areas do sistema possam usa-la corretamente
    public static void validaVenda(Venda venda) throws VendaException{
        // verifica se o cliente desta venda, foi devidamente alocado
        if(venda.getCliente() == null){
            throw new VendaException("Nao foi informado um cliente");
        }
    }
}
