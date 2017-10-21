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
    
    public static List<Livro> procurarLivro(String nome){
        List<Livro> resultadoPesquisa = new ArrayList();
        try{
            if(nome != null && nome != ""){
                for(int i = 0; i < listaLivro.size(); i++){
                    if(listaLivro.get(i).getTitulo().toUpperCase().contains(nome.toUpperCase())){
                        resultadoPesquisa.add(listaLivro.get(i));
                        
                    }
                }   
            }
        
        }catch(Exception e){
            System.out.println("Deu ruim");
        }
        return resultadoPesquisa;
    }
    
    public static List<Livro> filtrarPesquisa(List<Livro> livro , List<Livro> livro1){
        
        try{
            if(livro1.isEmpty()){
                livro1 = livro;
            }
            for(int i = 0; i < livro.size(); i++){
            
                if(!livro1.contains(livro.get(i))){
                    livro1.add(livro.get(i));
                
            
            }
        }
        //return resultadoPesquisa;
        } catch (Exception e){
            System.out.println("deu erro");
        }
        return livro1;
    }
    
    
    
    
}
