/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import Excecao.Excecao;
import dao.Observer.PessoaCollectionDAO;
import dao.Subject.IPessoaDAO;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author Valquíria Anacleto
 */
public class PessoaBusiness {

    private IPessoaDAO pessoaDAO;

    public PessoaBusiness() {
     
    }

    public Pessoa insert(Pessoa p) throws Exception {
        validate(p);
        return pessoaDAO.insert(p);
    }

    public void update(Pessoa p) throws Exception {
        validate(p);
        if (p.getNome() == null) {
            throw new Excecao("Nome inexistente!");
        }
        pessoaDAO.update(p);
    }

    public void updateRepublica(Pessoa p) throws Exception {
        if (p == null) {
            throw new Excecao("Inválido!");
        } else if (p.getNome() == null) {
            throw new Excecao("O nome da pessoa informada não é válido!");
        }

        pessoaDAO.updateRepublica(p);
    }

    public Pessoa getNome(String nome) throws Exception {
        if (nome == null) {
            throw new Excecao("Nome da Pessoa informada é inválida!");
        }

        return pessoaDAO.getNome(nome);
    }

    public List<Pessoa> getNomeRepublica(String nomeRepublica) throws Exception {
        if (nomeRepublica == null) {
            throw new Excecao("Nome inválida!");
        }

        return pessoaDAO.getNomeRepublica(nomeRepublica);
    }

    public void delete(String nome) throws Exception {
        if (nome == null) {
            throw new Excecao("Nome inválido!");
        }
        pessoaDAO.delete(nome);
    }

    private void validate(Pessoa pessoa) throws Exception {
        if (pessoa == null) {
            throw new Excecao("Atençao, pessoa inválida!");
        }
        if (pessoa.getNome() == null || pessoa.getNome().isBlank()) {
            throw new Excecao("Nome não informado!");
        }
        if (pessoa.getApelido() == null || pessoa.getApelido().isBlank()) {
            throw new Excecao("Apelido não informado!");
        }
        if (pessoa.getTelefone() == null || pessoa.getTelefone().isBlank() || pessoa.getTelefone().equals("(  )      -    ")) {
            throw new Excecao("Telefone não informado!");
        }
        if (pessoa.getCPF() == null || pessoa.getCPF().isBlank() || pessoa.getCPF().equals("   .   .   -  ")) {
            throw new Excecao("CPF não informado!");
        }
        if (pessoa.getEstado() == null) {
            throw new Excecao("Estado não informado!");
        }
    }
}
