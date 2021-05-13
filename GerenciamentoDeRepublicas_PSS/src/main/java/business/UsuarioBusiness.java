/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Excecao.Excecao;

import dao.Subject.IUsuarioDAO;
import model.Usuario;

/**
 *
 * @author Valquíria Anacleto
 */
public class UsuarioBusiness {
    private IUsuarioDAO usuarioDAO;
    
    public UsuarioBusiness() {
    }
    
    public Usuario getNome(String nome) throws Exception {
        if(nome == null) {
            throw new Excecao("Usuário não informado");
        }
        var usuario = usuarioDAO.getNome(nome);
        if(usuario == null || usuario.getSenha() == null) {
            throw new Excecao("Usuário não encontrado");
        }
        return usuario;
    }
    
    public void insert(Usuario usuario, String nomePessoa) throws Exception {
        if (usuario == null) {
            throw new Excecao("Usuário inválido");
        } else {
            if (usuario.getPessoa().getNome() != null) {
                throw new Excecao("Usuário não tem nome preenchido");
            }
            
            if (usuario.getLogin() == null || usuario.getLogin().isBlank()) {
                throw new Excecao("Login inválido");
            }
            
          
            if (usuario.getSenha() == null || usuario.getSenha().isBlank()) {
                throw new Excecao("Senha inválida");
            }
        }
        
        if (nomePessoa == null) {
            throw new Excecao("ID da pessoa fornecida é inválido");
        }
        
        if(usuarioDAO.loginExistente(usuario.getLogin())) {
            throw new Excecao("Já existe um usuário com este login");
        }
        
        usuarioDAO.insert(usuario, nomePessoa);
    }
    
    public void update(Usuario usuario) throws Exception {
        if (usuario == null) {
            throw new Excecao("Usuário inválido");
        } else {
            if (usuario.getLogin() == null) {
                throw new Excecao("Usuário precisa ter o Login preenchido");
            }
            
            if (usuario.getSenha() == null || usuario.getSenha().isBlank()) {
                throw new Excecao("Senha Incorreta");
            }
        }
        
        usuarioDAO.update(usuario);
    }
    
    public Usuario getLogin(String login, String senha) throws Exception {
        if (login == null || login.isEmpty()) {
            throw new Excecao("Login não informado");
        }
        if (senha == null || senha.isEmpty()) {
            throw new Excecao("Senha não informada");
        }
        return usuarioDAO.getLogin(login, senha);
    }
    
    public Usuario getNomePessoa(Long nomePessoa) throws Exception {
        if (nomePessoa == null) {
            throw new Excecao("ID da pessoa fornecida é inválido");
        }
        
        return usuarioDAO.getNomePessoa(nomePessoa);
    }
    
    public void delete(String nome) throws Exception {
        if (nome == null) {
            throw new Excecao("ID fornecido é inválido");
        }
        
        usuarioDAO.delete(nome);
    }
    
    public boolean loginExists(String login) throws Exception {
        if (login == null || login.isBlank()) {
            throw new Excecao("Login fornecido é inválido");
        }
        
        return usuarioDAO.loginExistente(login);
    }  
}
