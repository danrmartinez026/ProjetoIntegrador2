/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockLivro;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        if(livro != null && listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId() && listaLivro != null){
                    
                }
            }
        }
    }
    
    public static List<Livro> procurarLivro(String titulo,String autor, String editora){
        List<Livro> resultadoPesquisa = new ArrayList();
        try{
            if(titulo != null && titulo != "" || autor != null && autor != ""
                    || editora != null && editora != ""){
                for(int i = 0; i < listaLivro.size(); i++){
                    if(listaLivro.get(i).getTitulo().toUpperCase().contains(titulo.toUpperCase())
                            || listaLivro.get(i).getAutor().toUpperCase().contains(autor.toUpperCase())
                            || listaLivro.get(i).getEditora().toUpperCase().contains(editora.toUpperCase())){
                        resultadoPesquisa.add(listaLivro.get(i));
                        
                    }
                }   
            }
        
        }catch(Exception e){
            System.out.println("Deu ruim");
        }
        return resultadoPesquisa;
    }
    
    public static void filtrarPesquisa(List<Livro> pesquisa ){
        List<Livro> resultado = new ArrayList();
       try{
           if(pesquisa == null || pesquisa.isEmpty()){
               return;
           } else if(resultado == null || resultado.isEmpty()){
               for(Livro livro : pesquisa){
                   if(!resultado.contains(livro)){
                       resultado.add(livro);
                   }
                }
            pesquisa = resultado;
           } 
       } catch(Exception e){
           
       }
       
    }
    
    
    
    
}
