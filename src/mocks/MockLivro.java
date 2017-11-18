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
    
    public static void inserirLivro(Livro livro)throws Exception{
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public static void atualizarLivro(Livro livro)throws Exception{
        if(livro != null && livro.getId() != null && !listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId()){
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
    
    public static List<Livro> listar(){
        return listaLivro;
    }
    
    public static void excluirLivro(Livro livro)throws Exception{
        listaLivro.remove(livro);
    }
    
    public static void atualizarEstoque(Livro livro, int quantidade){
        if(livro != null){
            for(Livro livroUp: listaLivro){
                if(livro == livroUp){
                    livroUp.setEstoque(livroUp.getEstoque() - quantidade);
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
