package PostGameAnalytics;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public final class i
  extends JPanel
{
  XYSeriesCollection a;
  ChartPanel b;
  JFreeChart c;
  
  public i(int paramInt1, int paramInt2)
  {
    setSize(paramInt1, paramInt2);
    this.c = ChartFactory.createXYLineChart("", "", "", this.a);
    this.b = new ChartPanel(this.c);
    this.b.setPreferredSize(new Dimension(getWidth(), getHeight() - 20));
    add(this.b);
  }
  
  public final void a(ArrayList paramArrayList)
  {
    this.a = new XYSeriesCollection();
    for (int i = 0; i < paramArrayList.size(); i++) {
      this.a.addSeries(new XYSeries((Comparable)paramArrayList.get(i), false, true));
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.c.getXYPlot().setDataset(this.a);
    this.c.getXYPlot().getDomainAxis().setLabel(paramString2);
    this.c.getXYPlot().getRangeAxis().setLabel(paramString1);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\i.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */