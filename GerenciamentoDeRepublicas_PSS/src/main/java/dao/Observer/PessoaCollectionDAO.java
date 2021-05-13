/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Observer;

import dao.Subject.IPessoaDAO;


/**
 *
 * @author Valquíria Anacleto
 */
public class PessoaCollectionDAO {

    private static PessoaCollectionDAO instancia;

    private PessoaCollectionDAO() {

    }

    public static PessoaCollectionDAO getInstancia() {
        if (instancia == null) {
            instancia = new PessoaCollectionDAO();
        }

        return instancia;
    }

    public IPessoaDAO cria(String banco) {
        if (banco == null || banco.isBlank()) {
            throw new RuntimeException("Inválido");
        }

        return null;
    }
}
