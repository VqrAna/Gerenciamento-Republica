/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import servico.ServicoUsuario;
import view.Login.TelaLogin;

/**
 *
 * @author Valquíria Anacleto
 */
public class LoginPresenter {
private TelaLogin view;
 

   
    private ServicoUsuario servicoUsuario;
 
    CadastroPerfilPresenter cadastro;

    public LoginPresenter() {
        this.view = new TelaLogin();
        this.servicoUsuario = new ServicoUsuario();
        this.view.getBtnLogin().addActionListener( new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
            logar();
            }
        });

        this.view.getBtnCadastrar().addActionListener( new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {
           
            cadastro = new CadastroPerfilPresenter();
            }
        });

        this.view.setVisible(true);
    }

    private void logar() {
        var login = view.getTxtLogin().getText();
        var senha = new String(view.getTxtSenha().getPassword());

        try {
            var usuario = servicoUsuario.getLogin(login, senha);
            if (usuario != null && usuario.getPessoa().getNome() != null) {
                new TelaInicialPresenter(usuario.getPessoa());
                view.setVisible(false);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro no loguin", "Erro!!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!!", JOptionPane.ERROR_MESSAGE);
        }

    }
}
