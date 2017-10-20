/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockCliente;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author Danilo
 */
public class MockLivro {
    
    private int totalLivro =0;
    
    ArrayList<Livro> listaLivro = new ArrayList();
    
    public void inserirLivro(Livro livro){
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public void atualizarLivro(Livro livro){
        if(livro != null && listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId() && listaLivro != null){
                    
                }
            }
        }
    }
    
}
