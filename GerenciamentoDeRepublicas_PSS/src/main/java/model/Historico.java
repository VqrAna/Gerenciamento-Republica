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
public class Historico {
    private String nomeRepublica;
    private String nomeRepresentante;
    private double mediaReputacao;
    private Pessoa pessoa;
    private Republica republica;

    public Historico( double mediaReputacao, Pessoa pessoa, Republica republica) {
        this.nomeRepublica = nomeRepublica;
        this.nomeRepresentante = nomeRepresentante;
        this.mediaReputacao = mediaReputacao;
        this.pessoa = pessoa;
        this.republica = republica;
    }
    
    
}
