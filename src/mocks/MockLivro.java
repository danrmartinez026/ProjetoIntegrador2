/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocks;


import java.util.ArrayList;
import java.util.List;
import models.Livro;

/**
 *
 * @author Danilo
 */
public class MockLivro {
    
    private static int totalLivro = 0;
    
    public static ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    
    public static void falsoLivro(){
        Livro livroUp = new Livro();
        
        livroUp.setTitulo("Harry Potter");
        livroUp.setValor(200.75f);
        livroUp.setEstoque(20);
        livroUp.setAutor("J.K. Rowlling");
        livroUp.setEditora("Abril");
        livroUp.setGenero("Drama");
        livroUp.setIdioma("Portugues");
        livroUp.setIsbn("100000");
        livroUp.setEdicao("10");
        livroUp.setNumeroPaginas(200);
        
        try{
        inserirLivro(livroUp);
        } catch(Exception e){
            
        }
       
        Livro livroUp1 = new Livro();
        
        livroUp1.setTitulo("senhor dos Aneis");
        livroUp1.setValor(250.50f);
        livroUp1.setEstoque(20);
        livroUp1.setAutor("Lord");
        livroUp1.setEditora("veja");
        livroUp1.setGenero("Aventura");
        livroUp1.setIdioma("Portugues");
        livroUp1.setIsbn("1004250");
        livroUp1.setEdicao("2");
        livroUp1.setNumeroPaginas(400);
        
        try{
        inserirLivro(livroUp1);
        } catch(Exception e){
            
        }
        
        Livro livroUp12 = new Livro();
        
        livroUp12.setTitulo("Game Of Thrones");
        livroUp12.setValor(850.25f);
        livroUp12.setEstoque(20);
        livroUp12.setAutor("George");
        livroUp12.setEditora("got");
        livroUp12.setGenero("Aventura");
        livroUp12.setIdioma("Portugues");
        livroUp12.setIsbn("2550");
        livroUp12.setEdicao("8");
        livroUp12.setNumeroPaginas(800);
        
        try{
        inserirLivro(livroUp12);
        } catch(Exception e){
            
        }
    }
    
    
    public static void inserirLivro(Livro livro)throws Exception{
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public static void atualizarLivro(Livro livro)throws Exception{
        if(livro != null && livro.getId() != null && !listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId()){
                    System.out.println("2");
                    livroUp.setId(livro.getId());
                    livroUp.setTitulo(livro.getTitulo());
                    livroUp.setValor(livro.getValor());
                    livroUp.setEstoque(livro.getEstoque());
                    livroUp.setAutor(livro.getAutor());
                    livroUp.setEditora(livro.getEditora());
                    livroUp.setGenero(livro.getGenero());
                    livroUp.setIdioma(livro.getIdioma());
                    livroUp.setIsbn(livro.getIsbn());
                    livroUp.setEdicao(livro.getEdicao());
                    livroUp.setNumeroPaginas(livro.getNumeroPaginas());
                    livroUp.setAltura(livro.getAltura());
                    livroUp.setLargura(livro.getLargura());
                    livroUp.setPeso(livro.getPeso());
                }
            }
        }
    }
    
    public static void excluirLivro(Integer id)throws Exception{
        for(Livro livro: listaLivro){
            if(id == livro.getId()&& !listaLivro.isEmpty()){
                listaLivro.remove(livro);
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
            if(livro.getTitulo().toUpperCase().contains(titulo.toUpperCase()) && !titulo.equals("")){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
            if(livro.getAutor().toUpperCase().contains(autor.toUpperCase()) && !autor.equals("")){
                if (!resultadoPesquisa.contains(livro)){
                    resultadoPesquisa.add(livro);     
                }
            }
            if(livro.getEditora().toUpperCase().contains(editora.toUpperCase()) && !editora.equals("")){
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
