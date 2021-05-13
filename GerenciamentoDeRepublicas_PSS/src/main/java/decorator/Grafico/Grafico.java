/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.Grafico;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Valquíria Anacleto
 */
public abstract class Grafico extends Componente {
    protected DefaultCategoryDataset dataset;

    public Grafico(DefaultCategoryDataset dataset) {
        this.dataset = dataset;
    }

    @Override
    public abstract JFreeChart plotar();
}
