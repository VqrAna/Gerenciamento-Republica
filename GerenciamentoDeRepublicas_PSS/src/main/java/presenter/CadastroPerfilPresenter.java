/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import view.ManterPerfil.CadastroPessoaView;

import servico.ServicoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Valquíria Anacleto
 */
public class CadastroPerfilPresenter {

    private CadastroPessoaView view;
    private ServicoUsuario servicoUsuario;

    public CadastroPerfilPresenter() {
        this.view = new CadastroPessoaView();
        this.servicoUsuario = new ServicoUsuario();

        initListeners();
    }

    private void initListeners() {
        view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
