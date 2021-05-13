/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import business.PessoaBusiness;
import business.UsuarioBusiness;
import model.Pessoa;
import model.Usuario;
import state.pessoa.SemTetoState;

/**
 *
 * @author Valquíria Anacleto
 */
public class ServicoUsuario {
      private PessoaBusiness pessoaBusiness;
    private UsuarioBusiness usuarioBusiness;
  
    
    public ServicoUsuario() {
        this.pessoaBusiness = new PessoaBusiness();
        this.usuarioBusiness = new UsuarioBusiness();
        
    }
    
    public Usuario getNome(String nome) throws Exception {
        return usuarioBusiness.getNome(nome);
    }
    
    public void update(Usuario usuario) throws Exception {
        usuarioBusiness.update(usuario);
    }
    
    public Usuario getLogin(String login, String senha) throws Exception {
        return usuarioBusiness.getLogin(login, senha);
    }
    
    public void inserirPessoa(Usuario usuario) throws Exception {
        usuario.getPessoa().setEstado(new SemTetoState(usuario.getPessoa()));
        Pessoa pessoa = pessoaBusiness.insert(usuario.getPessoa());
        usuarioBusiness.insert(usuario, pessoa.getNome());
    }
    
    public void delete(String nome) throws Exception {
        usuarioBusiness.delete(nome);
    }
}
