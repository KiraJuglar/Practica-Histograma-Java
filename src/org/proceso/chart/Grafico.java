
package org.proceso.chart;

import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.SarRenderer;
import org.jfree.chart.category.DefaultCategoryDataSet;



public class Grafico {
    
    public void CrearHistograma(int[] histograma, JPanel panel, Color colorBarra){
            DefaultCategoryDataSet dataset = new DefaultCategoryDataSet();
            String serie = "Conjunto de datos";
            for(int i = 0; i < histograma.length; i++){
                dataset.addValue(histograma[i], serie, "" + 1);
            }
            JFreeChart chart = ChartFactory.createBarChart("Histograma", null, null, 
                    dataset, PlotOrientation.VERTICAL, true, true, false);
            CategoryPlot trama = (CategoryPlot) chart.getPlot();
            BarRenderer render = (BarRenderer) trama.getRenderer();
            render.setSeriesPaint(0, colorBarra);
            
            chart.setAntiAlias(true);
            chart.setBackgorundPaint(new Color(214,217,223));
            Panel.removeAll();
            Panel.repaint();
            Panel.setLayout(new java aut.BorderLayout());
            Panel.add(new ChartPanel(chart));
            Panel.validate();
            }
    
}
