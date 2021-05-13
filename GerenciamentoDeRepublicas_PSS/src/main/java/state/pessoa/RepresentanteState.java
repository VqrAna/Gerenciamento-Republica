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
public class RepresentanteState extends PessoaState  {

    public RepresentanteState(Pessoa morador) {
        super(morador);
    }
    
    
   
      @Override
    public void removerMorador() {
        this.morador.setEstado(new SemTetoState(morador));
    }
    
}
