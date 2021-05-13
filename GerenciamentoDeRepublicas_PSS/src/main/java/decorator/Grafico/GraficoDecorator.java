/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.Grafico;



/**
 *
 * @author Valquíria Anacleto
 */
public abstract class GraficoDecorator extends Componente {

    protected Grafico elementoDecorado;

    public GraficoDecorator(Grafico elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

   
    
}
