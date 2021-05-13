/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.pessoa;

import model.Pessoa;



/**
 *
 * @author Valquíria Anacleto
 */
public abstract class PessoaState {
   
     protected Pessoa morador;

    public PessoaState(Pessoa morador) {
        this.morador = morador;
    }
    public void adicionarMorador() {
        throw new RuntimeException("Não é possivel executar essa operação");
    }
    
   
    
    public void removerMorador() {
        throw new RuntimeException("Não é possivel executar essa operação");
    }
}
