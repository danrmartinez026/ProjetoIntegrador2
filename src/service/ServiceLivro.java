/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.LivroException;
import dao.DaoLivro;
import models.Livro;
import model_Validador.ValidadorLivro;

/**
 *
 * @author Danilo
 */
public class ServiceLivro {
    
    // valida o livro e insere o mesmo no banco de dados
    public static void cadastrarLivro(Livro livro)throws LivroException, DataSourceException{
        ValidadorLivro.validarLivro(livro);
        try{
            
            DaoLivro.inserirLivro(livro);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    // chama o metodo de exclusao de livro
    public static void excluirlivro(Livro livro) throws DataSourceException{
        try{
            DaoLivro.excluirLivro(livro);
        } catch(Exception e){
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    // atualiza o estoque do livro no BD de acordo com os parametros fornecidos
    public static void atualizarEstoque(Livro livro, int quantidade) throws DataSourceException{
        try{
            DaoLivro.atualizarEstoque(livro, quantidade);
        } catch(Exception e){
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    // valida o livro e atualiza o mesmo no BD
    public static void atualizarCadastro(Livro livro)throws LivroException, DataSourceException{
        ValidadorLivro.validarLivro(livro);
        
        try{
            
            DaoLivro.atualizarLivro(livro);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
}