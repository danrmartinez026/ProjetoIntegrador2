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
import modelvalidador.ValidadorLivro;

/**
 *
 * @author Danilo
 */
public class ServiceLivro {
    public static void cadastrarLivro(Livro livro)throws LivroException, DataSourceException{
        ValidadorLivro.validarLivro(livro);
        try{
            
            DaoLivro.inserirLivro(livro);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void excluirlivro(Livro livro) throws DataSourceException{
        try{
            DaoLivro.excluirLivro(livro);
        } catch(Exception e){
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void atualizarEstoque(Livro livro, int quantidade) throws DataSourceException{
        try{
            DaoLivro.atualizarEstoque(livro, quantidade);
        } catch(Exception e){
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
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