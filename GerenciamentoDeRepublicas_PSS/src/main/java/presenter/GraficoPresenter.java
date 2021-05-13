/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import view.VisualizarGrafico.GraficoView;
import decorator.Grafico.Componente;
import decorator.Grafico.Grafico;
import decorator.Grafico.GraficoBarraHorizontal;
import decorator.Grafico.GraficoBarraVertical;
import decorator.Grafico.TituloX;
import decorator.Grafico.TituloY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valquíria Anacleto
 */
public class GraficoPresenter {

    private GraficoView view;
    private Componente grafico;
    private DefaultCategoryDataset dataset;

    public GraficoPresenter(DefaultCategoryDataset dataset) throws Exception {
        this.view = new GraficoView();
        this.dataset = dataset;
        this.grafico = new GraficoBarraHorizontal(dataset);

        initListeners();

        plotar();

        this.view.setVisible(true);
    }

    private void initListeners() {
        this.view.getCbTipoGrafico().addActionListener((e) -> {
            if (this.view.getCbTipoGrafico().getSelectedItem().toString().equals("Barra Horizontal")) {
                this.grafico = new GraficoBarraHorizontal(dataset);
            } else if (this.view.getCbTipoGrafico().getSelectedItem().toString().equals("Barra Vertical")) {
                this.grafico = new GraficoBarraVertical(dataset);
            }

            this.view.updateUI();
            this.view.getTituloEixo().setSelected(false);

            try {
                plotar();
            } catch (Exception ex) {
                Logger.getLogger(GraficoPresenter.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        this.view.getTituloEixo().addActionListener((e) -> {
            boolean selected = this.view.getTituloEixo().isSelected();

            if (selected) {
                String tituloX = JOptionPane.showInputDialog(view, "Titulo eixo X");
                String tituloY = JOptionPane.showInputDialog(view, "Titulo eixo Y");

                grafico = new TituloX((Grafico) grafico, tituloX);
                grafico = new TituloY((Grafico) grafico, tituloY);
            } else {
                grafico = new TituloX((Grafico) grafico, "");
                grafico = new TituloY((Grafico) grafico, "");
            }

            this.view.updateUI();

            try {
                plotar();
            } catch (Exception ex) {
                Logger.getLogger(GraficoPresenter.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void plotar() throws Exception {
        ChartPanel painelGrafico = new ChartPanel(grafico.plotar());
        this.view.getPnlGrafico().setLayout(new BorderLayout());
        this.view.getPnlGrafico().removeAll();
        this.view.getPnlGrafico().add(painelGrafico);
    }

    public GraficoView getView() {
        return view;

    }

}
