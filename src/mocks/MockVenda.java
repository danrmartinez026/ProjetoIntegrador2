/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;

import java.util.ArrayList;
import java.util.List;
import models.Venda;

/**
 *
 * @author Danilo
 */
public class MockVenda {
    public static List<Venda> listaVenda = new ArrayList( );
    public static int totalVenda = 0;
    
    
    public static void inserirVenda(Venda venda){
        venda.setIdVenda(totalVenda++);
        listaVenda.add(venda);
    }
    
    public static List<Venda> listar(){
        return listaVenda;
    }
    
    
    
    
}
