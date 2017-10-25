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
    
    
    public static void inserirLivro(Livro livro)throws Exception{
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public static void atualizarLivro(Livro livro){
        if(livro != null && !listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId() && listaLivro != null){
                    
                }
            }
        }
    }
    
    public static List<Livro> procurarLivro(String titulo,String autor, String editora,String genero){
        
        List<Livro> resultadoPesquisa = new ArrayList();
        
        if(titulo.equals("") && autor.equals("") && editora.equals("")
                && genero.equalsIgnoreCase("selecionar") ){
            return null;
        }
        
        for(Livro livro: listaLivro){
            if(livro.getTitulo().toUpperCase().contains(titulo.toUpperCase())){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
            if(livro.getEditora().toUpperCase().contains(editora.toUpperCase())){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
            if(livro.getEditora().toUpperCase().contains(editora.toUpperCase())){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
            if(livro.getGenero().toUpperCase().contains(genero.toUpperCase())){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
        }
        return resultadoPesquisa;
    }          
}
