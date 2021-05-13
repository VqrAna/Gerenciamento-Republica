/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Subject;

import model.Usuario;

/**
 *
 * @author Valquíria Anacleto
 */
public interface IUsuarioDAO {

    public Usuario getNomePessoa(Long nomePessoa) throws Exception;

    public void delete(String nome) throws Exception;

    public void insert(Usuario usuario, String nomePessoa) throws Exception;

    public void update(Usuario usuario) throws Exception;

    public Usuario getNome(String nome) throws Exception;

    public Usuario getLogin(String login, String senha) throws Exception;

    public boolean loginExistente(String login) throws Exception;

}
