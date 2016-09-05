package PostGameAnalytics;

import Client.R;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public final class e
  extends JPanel
{
  private h c;
  private i d;
  public JToggleButton a;
  private JToggleButton e;
  private JToggleButton f;
  private JToggleButton g;
  private ArrayList h;
  private JToggleButton i;
  private JToggleButton j;
  private j k;
  public a b;
  private JToggleButton l;
  private JToggleButton m;
  private boolean n;
  
  public e(int paramInt1, int paramInt2)
  {
    setLayout(null);
    setBackground(new Color(26, 26, 26));
    paramInt1 = new g(this);
    this.a = new JToggleButton("Ward");
    a(this.a, 80, 50, 10, paramInt1);
    this.e = new JToggleButton("Deaths");
    a(this.e, 80, 140, 10, paramInt1);
    this.f = new JToggleButton("Kills");
    a(this.f, 80, 230, 10, paramInt1);
    this.g = new JToggleButton("Movement");
    a(this.g, 80, 320, 10, paramInt1);
    this.i = new JToggleButton("Dire");
    a(this.i, 100, 100, 55, paramInt1);
    this.j = new JToggleButton("Radiant");
    a(this.j, 100, 250, 55, paramInt1);
    this.h = new ArrayList();
    for (paramInt2 = 0; paramInt2 < 10; paramInt2++)
    {
      this.h.add(new JToggleButton("P " + (paramInt2 + 1)));
      a((JToggleButton)this.h.get(paramInt2), 70, (paramInt2 % 5 + 1) * 75 - 35, (int)(100.0D + 40.0D * Math.floor(paramInt2 / 5)), paramInt1);
    }
    this.n = false;
    this.l = new JToggleButton("HeatMap");
    a(this.l, 100, 100, 180, paramInt1);
    this.m = new JToggleButton("Line Graph");
    a(this.m, 100, 250, 180, paramInt1);
    this.l.setSelected(true);
    this.k = new j();
    this.k.setSize(250, 30);
    this.k.setLocation((450 - this.k.getWidth()) / 2, 210);
    this.k.setMinimum(0);
    this.k.setMaximum(1000);
    this.k.setValue(1000);
    this.k.setValue(0);
    this.k.a(1000);
    this.k.setBackground(new Color(26, 26, 26));
    this.k.addChangeListener(new f(this));
    add(this.k);
    this.c = new h(100, 450, 11);
    this.c.setLocation(0, 650 - this.c.getHeight());
    this.c.a();
    add(this.c);
    this.d = new i(this.c.getWidth(), this.c.getHeight());
    this.d.setLocation(0, 650 - this.d.getHeight());
    this.d.a("Y Axis", "X Axis");
    add(this.d);
    a(this.a);
    setSize(450, 650);
    repaint();
  }
  
  private void a(JToggleButton paramJToggleButton, int paramInt1, int paramInt2, int paramInt3, ActionListener paramActionListener)
  {
    paramJToggleButton.setSize(paramInt1, 30);
    paramJToggleButton.setLocation(paramInt2, paramInt3);
    paramJToggleButton.addActionListener(paramActionListener);
    add(paramJToggleButton);
  }
  
  private void a(int paramInt, R paramR)
  {
    if (this.l.isSelected())
    {
      paramR = paramR;
      paramInt = this.c;
      int i1 = (int)(paramR.a / 1000.0D * paramInt.a.length);
      paramR = (int)(paramR.b / 1000.0D * paramInt.a[0].length);
      int i2 = (int)Math.floor(paramInt.b.length / 2.0F);
      for (int i3 = 0; i3 < paramInt.b.length; i3++) {
        for (R localR2 = 0; localR2 < paramInt.b[0].length; localR2++)
        {
          int i4 = i1 + i3 - i2;
          int i5 = paramR + localR2 - i2;
          if ((i4 >= 0) && (i4 < paramInt.a.length) && (i5 >= 0) && (i5 < paramInt.a[0].length))
          {
            paramInt.e += 1;
            int i6 = paramInt.a[i4][i5] + paramInt.b[i3][localR2];
            paramInt.a[i4][i5] = i6;
            if (i6 > paramInt.c) {
              paramInt.c = i6;
            }
          }
          else
          {
            paramInt.e += 1;
          }
        }
      }
      return;
    }
    R localR1 = paramR;
    paramR = paramInt;
    (paramInt = this.d).a.getSeries(paramR).add(localR1.a, localR1.b);
  }
  
  public final void a(JToggleButton paramJToggleButton)
  {
    System.out.println("Reevaluating map");
    if ((paramJToggleButton.equals(this.m)) && (this.m.isSelected()))
    {
      this.l.setSelected(false);
      this.d.setVisible(true);
      this.c.setVisible(false);
    }
    else if (((paramJToggleButton.equals(this.l)) && (this.l.isSelected())) || ((!this.l.isSelected()) && (!this.m.isSelected())))
    {
      this.m.setSelected(false);
      this.l.setSelected(true);
      this.d.setVisible(false);
      this.c.setVisible(true);
    }
    ArrayList localArrayList1 = new ArrayList();
    String str1 = "";
    String str2 = "";
    ArrayList localArrayList2 = new ArrayList();
    for (int i2 = 0; i2 < 10; i2++) {
      localArrayList2.add(Integer.valueOf(-1));
    }
    if (paramJToggleButton.isSelected()) {
      if (paramJToggleButton.equals(this.a))
      {
        this.f.setSelected(false);
        this.e.setSelected(false);
        this.g.setSelected(false);
        for (i2 = 0; i2 < this.h.size(); i2++) {
          ((JToggleButton)this.h.get(i2)).setVisible(false);
        }
        this.i.setVisible(false);
        this.j.setVisible(false);
      }
      else if (this.f.equals(paramJToggleButton))
      {
        this.a.setSelected(false);
        this.e.setSelected(false);
        this.g.setSelected(false);
        for (i2 = 0; i2 < this.h.size(); i2++) {
          ((JToggleButton)this.h.get(i2)).setVisible(true);
        }
        this.i.setVisible(true);
        this.j.setVisible(true);
      }
      else if (this.e.equals(paramJToggleButton))
      {
        this.a.setSelected(false);
        this.f.setSelected(false);
        this.g.setSelected(false);
        for (i2 = 0; i2 < this.h.size(); i2++) {
          ((JToggleButton)this.h.get(i2)).setVisible(true);
        }
        this.i.setVisible(true);
        this.j.setVisible(true);
      }
      else if (this.g.equals(paramJToggleButton))
      {
        this.a.setSelected(false);
        this.f.setSelected(false);
        this.e.setSelected(false);
        for (i2 = 0; i2 < this.h.size(); i2++) {
          ((JToggleButton)this.h.get(i2)).setVisible(true);
        }
        this.i.setVisible(true);
        this.j.setVisible(true);
      }
    }
    int i3;
    int i4;
    if (this.h.contains(paramJToggleButton))
    {
      i2 = 1;
      for (paramJToggleButton = 0; paramJToggleButton < 5; paramJToggleButton++) {
        if (!((JToggleButton)this.h.get(paramJToggleButton)).isSelected()) {
          i2 = 0;
        }
      }
      this.j.setSelected(i2);
      paramJToggleButton = 1;
      for (i3 = 5; i3 < 10; i3++) {
        if (!((JToggleButton)this.h.get(i3)).isSelected()) {
          paramJToggleButton = 0;
        }
      }
      this.i.setSelected(paramJToggleButton);
    }
    else if (this.j.equals(paramJToggleButton))
    {
      i3 = 0;
      if (this.j.isSelected()) {
        i3 = 1;
      }
      for (paramJToggleButton = 0; paramJToggleButton < 5; paramJToggleButton++) {
        ((JToggleButton)this.h.get(paramJToggleButton)).setSelected(i3);
      }
    }
    else if (this.i.equals(paramJToggleButton))
    {
      i4 = 0;
      if (this.i.isSelected()) {
        i4 = 1;
      }
      for (paramJToggleButton = 5; paramJToggleButton < 10; paramJToggleButton++) {
        ((JToggleButton)this.h.get(paramJToggleButton)).setSelected(i4);
      }
    }
    if ((!this.a.isSelected()) && (!this.f.isSelected()) && (!this.e.isSelected()) && (!this.g.isSelected()))
    {
      for (i4 = 0; i4 < this.h.size(); i4++) {
        ((JToggleButton)this.h.get(i4)).setVisible(false);
      }
      this.i.setVisible(false);
      this.j.setVisible(false);
    }
    int i5;
    if (this.a.isSelected())
    {
      localArrayList1.add("Number of Wards");
      str1 = "Time";
      str2 = "Number of Wards";
    }
    else if (this.f.isSelected())
    {
      for (i5 = 0; i5 < this.h.size(); i5++) {
        if (((JToggleButton)this.h.get(i5)).isSelected())
        {
          if (this.b.f == null) {
            localArrayList1.add("Player " + (i5 + 1));
          } else {
            localArrayList1.add(this.b.f[i5]);
          }
          localArrayList2.set(i5, Integer.valueOf(localArrayList1.size() - 1));
        }
      }
      str1 = "Time";
      str2 = "Cumulative Kill";
    }
    else if (this.e.isSelected())
    {
      for (i5 = 0; i5 < this.h.size(); i5++) {
        if (((JToggleButton)this.h.get(i5)).isSelected())
        {
          if (this.b.f == null) {
            localArrayList1.add("Player " + (i5 + 1));
          } else {
            localArrayList1.add(this.b.f[i5]);
          }
          localArrayList2.set(i5, Integer.valueOf(localArrayList1.size() - 1));
        }
      }
      str1 = "Time";
      str2 = "Cumulative Deaths";
    }
    else if (this.g.isSelected())
    {
      for (i5 = 0; i5 < this.h.size(); i5++) {
        if (((JToggleButton)this.h.get(i5)).isSelected())
        {
          if (this.b.f == null) {
            localArrayList1.add("Player " + (i5 + 1));
          } else {
            localArrayList1.add(this.b.f[i5]);
          }
          localArrayList2.set(i5, Integer.valueOf(localArrayList1.size() - 1));
        }
      }
      str1 = "";
      str2 = "";
    }
    if (this.b != null)
    {
      new a.a(this.b.g.width, this.b.g.height);
      paramJToggleButton = this.b.h + (int)(this.k.getValue() / 1000.0D * (this.b.i - this.b.h));
      i5 = this.b.h + (int)(this.k.a() / 1000.0D * (this.b.i - this.b.h));
      System.out.println(this.k.a());
      System.out.println("timeline shown: " + paramJToggleButton + "~" + i5);
      int i6;
      if (this.m.isSelected())
      {
        this.d.a(localArrayList1);
        for (i6 = 0; i6 < localArrayList1.size(); i6++) {
          System.out.println("Series " + i6 + "'s name is " + (String)localArrayList1.get(i6));
        }
      }
      int i8;
      int i7;
      if (this.a.isSelected())
      {
        if (this.l.isSelected()) {
          this.c.a(10);
        }
        if (this.l.isSelected())
        {
          for (i6 = 0; i6 < this.b.d.size(); i6++) {
            if ((((m)this.b.d.get(i6)).b >= paramJToggleButton) && (((m)this.b.d.get(i6)).b <= i5))
            {
              R localR1 = ((m)this.b.d.get(i6)).a;
              a(0, localR1);
            }
          }
        }
        else
        {
          a(0, new R(paramJToggleButton, 0.0D));
          i6 = 0;
          for (i8 = 0; i8 < this.b.e.size(); i8++) {
            if ((((Integer)this.b.a.get(i8)).intValue() >= paramJToggleButton) && (((Integer)this.b.a.get(i8)).intValue() <= i5))
            {
              a(0, new R(((Integer)this.b.a.get(i8)).intValue(), ((Integer)this.b.e.get(i8)).intValue()));
              i6 = i8;
            }
          }
          a(0, new R(i5, ((Integer)this.b.e.get(i6)).intValue()));
        }
      }
      else
      {
        ArrayList localArrayList3;
        int i1;
        int i9;
        if (this.e.isSelected())
        {
          if (this.l.isSelected()) {
            this.c.a(7);
          }
          System.out.println("Running adding points again!");
          localArrayList3 = new ArrayList();
          for (i8 = 0; i8 < 10; i8++) {
            localArrayList3.add(Integer.valueOf(0));
          }
          if (this.m.isSelected()) {
            for (i8 = 0; i8 < localArrayList1.size(); i8++) {
              a(i8, new R(paramJToggleButton, 0.0D));
            }
          }
          for (i8 = 0; i8 < this.b.c.size(); i8++) {
            if ((((b)this.b.c.get(i8)).e >= paramJToggleButton) && (((b)this.b.c.get(i8)).e <= i5))
            {
              i1 = ((b)this.b.c.get(i8)).a;
              i9 = 0;
              if (i1 < 5)
              {
                if (this.j.isSelected()) {
                  i9 = 1;
                }
              }
              else if (this.i.isSelected()) {
                i9 = 1;
              }
              if ((i9 != 0) || (((JToggleButton)this.h.get(i1)).isSelected()))
              {
                localArrayList3.set(i1, Integer.valueOf(((Integer)localArrayList3.get(i1)).intValue() + 1));
                if (this.l.isSelected())
                {
                  R localR3;
                  if ((localR3 = ((b)this.b.c.get(i8)).b) != null) {
                    a(i1, localR3);
                  }
                }
                else
                {
                  a(((Integer)localArrayList2.get(i1)).intValue(), new R(((b)this.b.c.get(i8)).e - 1, ((Integer)localArrayList3.get(i1)).intValue() - 1));
                  a(((Integer)localArrayList2.get(i1)).intValue(), new R(((b)this.b.c.get(i8)).e, ((Integer)localArrayList3.get(i1)).intValue()));
                }
              }
            }
          }
          if (this.m.isSelected()) {
            for (i8 = 0; i8 < localArrayList3.size(); i8++) {
              if (((Integer)localArrayList2.get(i8)).intValue() != -1) {
                a(((Integer)localArrayList2.get(i8)).intValue(), new R(i5, ((Integer)localArrayList3.get(i8)).intValue()));
              }
            }
          }
        }
        else
        {
          R localR4;
          if (this.f.isSelected())
          {
            if (this.l.isSelected()) {
              this.c.a(7);
            }
            localArrayList3 = new ArrayList();
            for (i8 = 0; i8 < 10; i8++) {
              localArrayList3.add(Integer.valueOf(0));
            }
            if (this.m.isSelected()) {
              for (i8 = 0; i8 < i1.size(); i8++) {
                a(i8, new R(paramJToggleButton, 0.0D));
              }
            }
            System.out.println("Running adding points again!");
            for (i8 = 0; i8 < this.b.c.size(); i8++) {
              if ((((b)this.b.c.get(i8)).e >= paramJToggleButton) && (((b)this.b.c.get(i8)).e <= i5)) {
                for (i1 = 0; i1 < ((b)this.b.c.get(i8)).c.size(); i1++)
                {
                  i9 = ((Integer)((b)this.b.c.get(i8)).c.get(i1)).intValue();
                  int i10 = 0;
                  if (i9 < 5)
                  {
                    if (this.j.isSelected()) {
                      i10 = 1;
                    }
                  }
                  else if (this.i.isSelected()) {
                    i10 = 1;
                  }
                  if ((i10 != 0) || (((JToggleButton)this.h.get(i9)).isSelected()))
                  {
                    localArrayList3.set(i9, Integer.valueOf(((Integer)localArrayList3.get(i9)).intValue() + 1));
                    if (this.l.isSelected())
                    {
                      if ((localR4 = (R)((b)this.b.c.get(i8)).d.get(i1)) != null) {
                        a(i9, localR4);
                      }
                    }
                    else
                    {
                      a(((Integer)localArrayList2.get(i9)).intValue(), new R(((b)this.b.c.get(i8)).e - 1, ((Integer)localArrayList3.get(i9)).intValue() - 1));
                      a(((Integer)localArrayList2.get(i9)).intValue(), new R(((b)this.b.c.get(i8)).e, ((Integer)localArrayList3.get(i9)).intValue()));
                    }
                  }
                }
              }
            }
            if (this.m.isSelected()) {
              for (i8 = 0; i8 < localArrayList3.size(); i8++) {
                if (((Integer)localArrayList2.get(i8)).intValue() != -1) {
                  a(((Integer)localArrayList2.get(i8)).intValue(), new R(i5, ((Integer)localArrayList3.get(i8)).intValue()));
                }
              }
            }
          }
          else if (this.g.isSelected())
          {
            if (this.l.isSelected()) {
              this.c.a(7);
            }
            System.out.println("Running adding points again!");
            for (i7 = 0; i7 < this.b.b.size(); i7++)
            {
              i8 = 0;
              if (i7 < 5)
              {
                if (this.j.isSelected()) {
                  i8 = 1;
                }
              }
              else if (this.i.isSelected()) {
                i8 = 1;
              }
              if ((i8 != 0) || (((JToggleButton)this.h.get(i7)).isSelected()))
              {
                for (i1 = 0; i1 < ((ArrayList)this.b.b.get(i7)).size(); i1++)
                {
                  R localR2;
                  if ((((Integer)this.b.a.get(i1)).intValue() >= paramJToggleButton) && (((Integer)this.b.a.get(i1)).intValue() <= i5) && ((localR2 = (R)((ArrayList)this.b.b.get(i7)).get(i1)) != null)) {
                    if (this.l.isSelected())
                    {
                      a(i7, localR2);
                    }
                    else
                    {
                      (localR4 = localR2.a()).b = (1000.0D - localR2.b);
                      a(((Integer)localArrayList2.get(i7)).intValue(), localR4);
                    }
                  }
                }
                System.out.println("Player " + i7 + " analysed");
              }
            }
          }
          else
          {
            this.c.a(1);
          }
        }
      }
      if ((this.b.f != null) && (!this.n))
      {
        this.n = true;
        for (i7 = 0; i7 < 10; i7++) {
          ((JToggleButton)this.h.get(i7)).setText(this.b.f[i7]);
        }
      }
      if (this.l.isSelected())
      {
        this.c.a();
      }
      else
      {
        this.d.a(str2, str1);
        if (this.g.isSelected())
        {
          this.d.c.getXYPlot().setBackgroundImage(this.c.d);
          this.d.c.getXYPlot().getDomainAxis().setRange(new Range(0.0D, 1000.0D));
          this.d.c.getXYPlot().getRangeAxis().setRange(new Range(0.0D, 1000.0D));
          this.d.c.getXYPlot().getRangeAxis().setVisible(false);
          this.d.c.getXYPlot().getDomainAxis().setVisible(false);
        }
        else
        {
          this.d.b.restoreAutoBounds();
          this.d.c.getXYPlot().setBackgroundImage(null);
          this.d.c.getXYPlot().getRangeAxis().setVisible(true);
          this.d.c.getXYPlot().getDomainAxis().setVisible(true);
        }
      }
      repaint();
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */