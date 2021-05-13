/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.Grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Valquíria Anacleto
 */
public class GraficoBarraVertical extends Grafico {

    public GraficoBarraVertical(DefaultCategoryDataset dataset) {
        super(dataset);
    }

    

    @Override
    public JFreeChart plotar() {
          JFreeChart grafico = ChartFactory.createBarChart("", "", "", dataset, PlotOrientation.VERTICAL, true, false, false);
        return grafico;
    }
    
}
