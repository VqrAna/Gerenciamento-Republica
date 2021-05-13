/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.Republica;

import model.Republica;

/**
 *
 * @author Valquíria Anacleto
 */
public abstract class RepublicaState {
     
    protected Republica republica;

    public RepublicaState(Republica republica) {
        this.republica = republica;
    }
    
    public void republicaDisponivel() {
        throw new RuntimeException("Não é possivel executar essa operação");
    }
    
    public void republicaOcupada() {
        throw new RuntimeException("Não é possivel executar essa operação");
    }
}
