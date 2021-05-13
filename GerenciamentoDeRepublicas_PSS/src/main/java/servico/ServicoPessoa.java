/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import business.PessoaBusiness;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author Valquíria Anacleto
 */
public class ServicoPessoa {
     private PessoaBusiness pessoaBusiness;
    
    public ServicoPessoa() {
        this.pessoaBusiness = new PessoaBusiness();
    }
    
     public void insert(Pessoa pessoa) throws Exception{ 
        pessoaBusiness.insert(pessoa);
    }
    
    public void update(Pessoa pessoa) throws Exception{        
        pessoaBusiness.update(pessoa);
    }
    
    public void updateRepublica(Pessoa pessoa) throws Exception{        
        pessoaBusiness.updateRepublica(pessoa);
    }
    
    public Pessoa getNome(String nome) throws Exception{        
        return pessoaBusiness.getNome(nome);
    }
    
    public List<Pessoa> getByIdRepublica(String nomeRepublica) throws Exception{        
        return pessoaBusiness.getNomeRepublica(nomeRepublica);
    }
    
    public void delete(String nome) throws Exception {
        pessoaBusiness.delete(nome);
    }
}
