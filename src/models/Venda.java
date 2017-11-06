/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import modelItemVenda.ItemVenda;
import java.util.ArrayList;
import java.util.Date;
import models.Cliente;

/**
 *
 * @author danilo.martinez
 */
public class Venda {
    private Cliente cliente;
    public ArrayList<ItemVenda> listaItemVenda = new ArrayList();
    private Date data;
    private double valor;
    private int idVenda;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getListaItemVenda() {
        return listaItemVenda;
    }

    public void setListaItemVenda(ArrayList<ItemVenda> listaItemVenda) {
        this.listaItemVenda = listaItemVenda;
    }
    
    boolean faturada = true;

    public boolean isFaturada() {
        return faturada;
    }

    public void setFaturada(boolean faturada) {
        this.faturada = faturada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    
    
}
