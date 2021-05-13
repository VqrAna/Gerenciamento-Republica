/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import state.Republica.RepublicaState;

/**
 *
 * @author Valquíria Anacleto
 */
public class Republica {
      private String nome;
    private String vantagensRepublica;
   
    private LocalDate dataFundacaoRepublica;
    private LocalDate dataExtincaoRepublic;
    private Endereco endereco;
    private double despesaMediaMorador;
    private int numeroVagasOcupadas;
        private int numeroVagasDisponiveis;
         private RepublicaState estado;

    public RepublicaState getEstado() {
        return estado;
    }

    public void setEstado(RepublicaState estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVantagensRepublica() {
        return vantagensRepublica;
    }

    public void setVantagensRepublica(String vantagensRepublica) {
        this.vantagensRepublica = vantagensRepublica;
    }

    public LocalDate getDataFundacaoRepublica() {
        return dataFundacaoRepublica;
    }

    public void setDataFundacaoRepublica(LocalDate dataFundacaoRepublica) {
        this.dataFundacaoRepublica = dataFundacaoRepublica;
    }

    public LocalDate getDataExtincaoRepublic() {
        return dataExtincaoRepublic;
    }

    public void setDataExtincaoRepublic(LocalDate dataExtincaoRepublic) {
        this.dataExtincaoRepublic = dataExtincaoRepublic;
    }

   

    public double getDespesaMediaMorador() {
        return despesaMediaMorador;
    }

    public void setDespesaMediaMorador(double despesaMediaMorador) {
        this.despesaMediaMorador = despesaMediaMorador;
    }

    public int getNumeroVagasOcupadas() {
        return numeroVagasOcupadas;
    }

    public void setNumeroVagasOcupadas(int numeroVagasOcupadas) {
        this.numeroVagasOcupadas = numeroVagasOcupadas;
    }

    public int getNumeroVagasDisponiveis() {
        return numeroVagasDisponiveis;
    }

    public void setNumeroVagasDisponiveis(int numeroVagasDisponiveis) {
        this.numeroVagasDisponiveis = numeroVagasDisponiveis;
    }
        
        
 

}
