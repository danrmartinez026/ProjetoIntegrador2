/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockLivro;


import java.util.ArrayList;
import java.util.List;
import modelLivro.Livro;

/**
 *
 * @author Danilo
 */
public class MockLivro {
    
    private static int totalLivro =0;
    
    public static ArrayList<Livro> listaLivro = new ArrayList();
    public static List<Livro> resultadoPesquisa = new ArrayList();
    

   
    
    public static void inserirLivro(Livro livro)throws Exception{
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public static void atualizarLivro(Livro livro){
        if(livro != null && listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId() && listaLivro != null){
                    
                }
            }
        }
    }
    
    public static List<Livro> procurarLivro(String nome){
        
        if(nome != null){
            for(Livro livro : listaLivro){
                if(livro.getTitulo().toUpperCase().contains(nome.toUpperCase()))
                    resultadoPesquisa.add(livro);
            }
        }
        return resultadoPesquisa;
    }
    
    public static List<Livro> filtrarPesquisa(List<Livro> livro){
        for(Livro liv : livro){
            if(!resultadoPesquisa.contains(livro.contains(liv))){
                resultadoPesquisa.add(liv);
            }
        }
        return resultadoPesquisa;
    }
    
    
    
    
}
