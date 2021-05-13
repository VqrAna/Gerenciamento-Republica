/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.Grafico;

import org.jfree.chart.JFreeChart;

/**
 *
 * @author Valquíria Anacleto
 */
public class TituloX extends GraficoDecorator {

    private String nome;
 

    public TituloX(Grafico elementoDecorado, String nome) {
        super(elementoDecorado);
        this.nome = nome;
    }
    
    

    @Override
    public JFreeChart plotar() {
         JFreeChart grafico = elementoDecorado.plotar();
        grafico.getCategoryPlot().getDomainAxis().setLabel(nome);
        
        return grafico;
    }
    
}
