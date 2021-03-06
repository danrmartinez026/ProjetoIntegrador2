/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_Validador;

import models.Livro;
import exceptions.LivroException;

/**
 *
 * @author Danilo
 */
public class ValidadorLivro {
    // faz a validacao do livro antes que outras areas do sistema usem o mesmo afim de evitar erros
    public static void validarLivro(Livro livro) throws LivroException{
        if(livro != null){
            if(livro.getTitulo().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(livro.getAutor().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }

            if(livro.getEdicao().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(livro.getIdioma() == null && livro.getIdioma().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }

            if(livro.getEditora().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }

            if(livro.getIsbn() == null){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(!livro.getNumeroPaginas().equals("")){
                if(Integer.parseInt(livro.getNumeroPaginas()) < 5){
                    throw new LivroException ("Preencha uma quantidade de paginas maior que 5");
                }
            }

            if(livro.getGenero().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(!livro.getPeso().equals("")){
                if(Integer.valueOf(livro.getPeso()) <= 10){
                    throw new LivroException ("Informe um Peso maior que 10");
                }
            }
            
            if(!livro.getAltura().equals("")){
                if(Integer.valueOf(livro.getAltura()) <= 5){
                    throw new LivroException ("Informe uma altura maior que 5");
                }
            }
            
            if(!livro.getLargura().equals("")){
                if(Integer.valueOf(livro.getLargura()) <= 5){
                    throw new LivroException ("Informe uma largura maior que 5");
                }
            }
            
            if(livro.getValor() == null || livro.getValor().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            } 
            
            if(livro.getEstoque() == null || livro.getEstoque() == 0){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
        } else {
            throw new LivroException ("Nao foi informado um livro");
            }
    }
}
