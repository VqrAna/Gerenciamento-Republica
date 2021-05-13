/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.pessoa;


import model.Pessoa;
import model.Republica;

/**
 *
 * @author Valquíria Anacleto
 */
public class SemTetoState extends PessoaState {

    public SemTetoState(Pessoa morador) {
        super(morador);
    }
    @Override
     public void adicionarMorador() {
        this.morador.setEstado(new MoradorState(morador));
      
        
    }
    
   
    
   
}
