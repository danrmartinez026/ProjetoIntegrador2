/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.VendaException;
import models.Venda;
import model_Validador.ValidadorVenda;
import dao.DaoVenda;
/**
 *
 * @author Danilo
 */
public class ServiceVenda {
    // valida a venda e a insere no banco de dados e retorna a chave gerada
    public static int inserirVenda(Venda venda) throws VendaException,DataSourceException{
        int id = 0;
        try{
            ValidadorVenda.validaVenda(venda);
            id = DaoVenda.inserirVenda(venda);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
        return id;
    }
}
