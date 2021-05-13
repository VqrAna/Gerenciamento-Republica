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
public class TituloY extends GraficoDecorator {
 private String nome;
 

    public TituloY(Grafico elementoDecorado, String nome) {
        super(elementoDecorado);
        this.nome = nome;
    }

    @Override
    public JFreeChart plotar() {
         JFreeChart grafico = elementoDecorado.plotar();
        grafico.getCategoryPlot().getRangeAxis().setLabel(nome);
        
        return grafico;
    }
    
}
