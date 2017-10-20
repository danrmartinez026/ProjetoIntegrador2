/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mock;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author Danilo
 */
public class MockLivro {
    
    private int totalLivro =0;
//    public static List<Livro> resultadoLivro = new ArrayList<Livro>();
    public static List<Livro> pesquisaFiltrada = new ArrayList();
    public static ArrayList<Livro> listaLivro = new ArrayList();
    
    public void inserirLivro(Livro livro){
        livro.setId(totalLivro++);
        listaLivro.add(livro);
    }
    
    public void atualizarLivro(Livro livro){
        if(livro != null && listaLivro.isEmpty()){
            for(Livro livroUp : listaLivro){
                if(livroUp.getId() == livro.getId() && listaLivro != null){
                    livroUp.setTitulo(livro.getTitulo());
                    livroUp.setAutor(livro.getAutor());
                    livroUp.setEditora(livro.getEditora());
                    livroUp.setGenero(livro.getGenero());
                    livroUp.setEdicao(livro.getEdicao());
                    livroUp.setPeso(livro.getPeso());
                    livroUp.setNumeroPaginas(livro.getNumeroPaginas());
                    livroUp.setAltura(livro.getAltura());
                    livroUp.setLargura(livro.getLargura());
                    break;
                }
            }
        }
    }
    
    public static List<Livro> procurarLivro(String texto){
         List<Livro> resultadoLivro = new ArrayList<Livro>();
        
        if(!listaLivro.isEmpty() && texto != null){
            for(Livro livro: listaLivro){
                if(livro != null && livro.getAutor() != null && livro.getTitulo() != null &&
                        livro.getGenero() != null && livro.getEditora() != null){
                    if(livro.getAutor().toUpperCase().contains(texto.toUpperCase())
                            || livro.getEditora().toUpperCase().contains(texto.toUpperCase())
                            || livro.getTitulo().toUpperCase().contains(texto.toUpperCase())
                            || livro.getGenero().toUpperCase().contains(texto.toUpperCase())){
                        resultadoLivro.add(livro);
                    }
                }
            }
        }
        return resultadoLivro;
    }
    
    //elimina resultados iguais da pesquisa
    public static List<Livro> filtrarPesquisaLivro(List<Livro> livro){
        if(!livro.isEmpty() && livro != null){
            for(Livro livroPesquisa :livro){
                if(!pesquisaFiltrada.contains(livroPesquisa));
                    pesquisaFiltrada.add(livroPesquisa);
            }
        }
        return pesquisaFiltrada;
    }
    
    
    
}
