/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelValidadorLivro;

import modelLivro.Livro;
import exceptions.LivroException;

/**
 *
 * @author Danilo
 */
public class ValidadorLivro {
    public static boolean validarLivro(Livro livro) throws LivroException{
        if(livro == null){
            throw new LivroException ("Nao foi informado um livro");
        }
        
        if(livro.getTitulo() == null || livro.getTitulo().equals("")){
            throw new LivroException ("Informe um titulo");
        }
        
        if(livro.getEdicao() == null || livro.getEdicao().equals("")){
            throw new LivroException ("Informe a edicao");
        }
        
        if(livro.getEditora() == null || livro.getEditora().equals("")){
            throw new LivroException ("Informe uma editora");
        }
        
        if(livro.getIsbn() == null || livro.getIsbn().equals("")){
            throw new LivroException ("Informe um codigo ISBN");
        }
        
        if(livro.getGenero() == null || livro.getGenero().equals("")){
            throw new LivroException ("Informe um genero");
        }
        return true;
    }
}
