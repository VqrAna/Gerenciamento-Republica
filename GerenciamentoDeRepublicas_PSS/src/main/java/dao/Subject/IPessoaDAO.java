/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Subject;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author Valquíria Anacleto
 */
public interface IPessoaDAO {

    

    public void update(Pessoa pessoa) throws Exception;
       public void delete(String nome) throws Exception;

    public void updateRepublica(Pessoa pessoa) throws Exception;

    public Pessoa getNome(String nome) throws Exception;
    public Pessoa insert(Pessoa pessoa) throws Exception;

    public List<Pessoa> getNomeRepublica(String nomeRepublica) throws Exception;

 

}
