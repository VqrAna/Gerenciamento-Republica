/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import model.Pessoa;
import Excecao.Excecao;

import view.TelaInicial.TelaInicial;

/**
 *
 * @author Valquíria Anacleto
 */
public class TelaInicialPresenter {
    private TelaInicial view;

    public TelaInicialPresenter(Pessoa usuarioLogado) throws Excecao{
        var telaInicial = this;
        this.view = new TelaInicial();
        if(usuarioLogado == null || usuarioLogado.getNome() == null) {
            this.view.setVisible(false);
            this.view.dispose();
            throw new Excecao("Inválido");
        }
        System.setProperty("nome Usuario Logado", usuarioLogado.getNome().toString());
        
        this.view.setState(JFrame.ICONIFIED);
        this.view.setLocationRelativeTo(this.view.getParent());
        this.view.setExtendedState(MAXIMIZED_BOTH);
        
        
        this.view.setVisible(true);
    }
    
    
    public void addContainer(JInternalFrame janela){
        view.getDesktop().add(janela);
    }
    
    public void sair() {
        view.setVisible(false);
        view.dispose();
    }
   
}
