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
public class DisponivelState extends RepublicaState {

    public DisponivelState(Republica republica) {
        super(republica);
    }
    @Override
    public void republicaOcupada() {
        this.republica.setEstado(new OcupadoState(republica));
    }
}
