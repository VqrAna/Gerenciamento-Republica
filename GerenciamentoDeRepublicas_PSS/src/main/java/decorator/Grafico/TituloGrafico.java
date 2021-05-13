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
public class TituloGrafico extends GraficoDecorator {
private  String titulo;
    public TituloGrafico(String titulo,Grafico elementoDecorado) {
        super(elementoDecorado);
         this.titulo = titulo;
    }

    @Override
    public JFreeChart plotar() throws Exception {
        JFreeChart grafico = elementoDecorado.plotar();
        grafico.setTitle(titulo);
        
        return grafico;
    }
    
}
