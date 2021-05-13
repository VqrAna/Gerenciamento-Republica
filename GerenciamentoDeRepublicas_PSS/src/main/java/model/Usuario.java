/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Valquíria Anacleto
 */
public class Usuario {
    private String login;
    private String senha;
      private boolean usuarioExcluido;
    private Pessoa pessoa;

    public Usuario(String login, String senha, boolean usuarioExcluido, Pessoa pessoa) {
        this.login = login;
        this.senha = senha;
        this.usuarioExcluido = false;
        this.pessoa = pessoa;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isUsuarioExcluido() {
        return usuarioExcluido;
    }

    public void setUsuarioExcluido(boolean usuarioExcluido) {
        this.usuarioExcluido = usuarioExcluido;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
  
}
