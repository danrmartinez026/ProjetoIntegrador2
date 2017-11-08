/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelvalidador;

import models.Livro;
import exceptions.LivroException;

/**
 *
 * @author Danilo
 */
public class ValidadorLivro {
    public static void validarLivro(Livro livro) throws LivroException{
        if(livro != null){
            if(livro.getTitulo().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(livro.getId() == null){
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

            if(livro.getGenero().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
           if(livro.getPeso() == null){
               throw new LivroException ("Informe um Peso");
           }
            
            if(livro.getAltura() == null){
                throw new LivroException ("Informe uma altura");
            }
            
            if(livro.getLargura() == null){
                throw new LivroException ("Informe uma largura");
            }
            
            if(livro.getValor() == null){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(livro.getEstoque() == null){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
        } else {
            throw new LivroException ("Nao foi informado um livro");
            }
    }
}
