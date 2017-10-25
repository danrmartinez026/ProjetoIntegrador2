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
    public static void validarLivro(Livro livro) throws LivroException{
        if(livro != null){
            if(livro.getTitulo().equals("")){
                throw new LivroException ("Preencha todos os campos marcados com: ( * )");
            }
            
            if(livro.getAutor().equals("")){
                throw new LivroException ("Informe um autor");
            }

//            if(livro.getEdicao() == null  ){
//                throw new LivroException ("Informe a edicao");
//            }
            
            if(livro.getIdioma() == null && livro.getIdioma().equals("")){
                throw new LivroException ("Informe um titulo");
            }

            if(livro.getEditora().equals("") && livro.getEditora() == null){
                throw new LivroException ("Informe uma editora");
            }

            if(livro.getIsbn() == null){
                throw new LivroException ("Informe um codigo ISBN");
            }

            if(livro.getGenero().equals("")){
                throw new LivroException ("Informe um genero");
            }
            
//            if(livro.getPeso() == null){
//                throw new LivroException ("Informe um Peso");
//            }
            
//            if(livro.getAltura() == null){
//                throw new LivroException ("Informe uma altura");
//            }
            
//            if(livro.getLargura() == null){
//                throw new LivroException ("Informe uma largura");
//            }
            
            if(livro.getValor() == null){
                throw new LivroException ("Informe o valor do produto");
            }
            
        } else {
            throw new LivroException ("Nao foi informado um livro");
            }
    }
}
