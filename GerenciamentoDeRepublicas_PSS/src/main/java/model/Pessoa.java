/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import state.pessoa.PessoaState;

/**
 *
 * @author Valquíria Anacleto
 */
public class Pessoa {
      private String nome;
    private String apelido;
    private String telefone;
    private String CPF;
    private String linkRedeSocial;
    private String telefoneResponsavel1;
    private String telefoneResponsavel2;
    private List<Historico> historicoRepublicas;
    private PessoaState estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLinkRedeSocial() {
        return linkRedeSocial;
    }

    public void setLinkRedeSocial(String linkRedeSocial) {
        this.linkRedeSocial = linkRedeSocial;
    }

    public String getTelefoneResponsavel1() {
        return telefoneResponsavel1;
    }

    public void setTelefoneResponsavel1(String telefoneResponsavel1) {
        this.telefoneResponsavel1 = telefoneResponsavel1;
    }

    public String getTelefoneResponsavel2() {
        return telefoneResponsavel2;
    }

    public void setTelefoneResponsavel2(String telefoneResponsavel2) {
        this.telefoneResponsavel2 = telefoneResponsavel2;
    }

    public List<Historico> getHistoricoRepublicas() {
        return historicoRepublicas;
    }

    public void setHistoricoRepublicas(List<Historico> historicoRepublicas) {
        this.historicoRepublicas = historicoRepublicas;
    }

    public PessoaState getEstado() {
        return estado;
    }

    public void setEstado(PessoaState estado) {
        this.estado = estado;
    }
    
    
    
    
}
