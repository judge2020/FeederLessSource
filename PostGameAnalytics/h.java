package PostGameAnalytics;

import Client.R;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public final class h
  extends JPanel
{
  private Color[] f;
  int[][] a;
  int[][] b;
  int c;
  private BufferedImage g;
  BufferedImage d;
  private BufferedImage h;
  int e;
  
  public h(int paramInt1, int paramInt2, int paramInt3)
  {
    setLayout(null);
    this.f = new Color[50];
    for (int i = 0; i < this.f.length; i++)
    {
      System.out.println(i * 6 + " 100" + " 50");
      double d2 = i / this.f.length;
      this.f[i] = Color.getHSBColor((float)(1.0D - d2), 1.0F, (float)d2 * 0.5F);
      this.f[i] = new Color(this.f[i].getRed(), this.f[i].getGreen(), this.f[i].getBlue(), (int)(d2 * 255.0D));
      System.out.println("Color i = " + this.f[i].getRed() + " " + this.f[i].getGreen() + " " + this.f[i].getBlue());
    }
    this.a = new int[100][100];
    try
    {
      this.g = ImageIO.read(new File("dota_map.png"));
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
    double d1 = paramInt2 / this.g.getWidth();
    setSize(paramInt2, (int)(d1 * this.g.getHeight()));
    if ((this.g.getWidth() != getWidth()) || (this.g.getHeight() != getHeight()))
    {
      paramInt3 = getHeight();
      paramInt2 = getWidth();
      paramInt1 = (paramInt1 = this.g).getScaledInstance(paramInt2, paramInt3, 4);
      (paramInt3 = (paramInt2 = new BufferedImage(paramInt2, paramInt3, 2)).createGraphics()).drawImage(paramInt1, 0, 0, null);
      paramInt3.dispose();
      this.d = paramInt2;
    }
    a(11);
  }
  
  public final void a(int paramInt)
  {
    this.e = 0;
    for (int i = 0; i < this.a.length; i++) {
      for (j = 0; j < this.a[0].length; j++) {
        this.a[i][j] = 0;
      }
    }
    paramInt += 2;
    if (paramInt % 2 == 0) {
      paramInt++;
    }
    R localR = new R(Math.floor(paramInt / 2), Math.floor(paramInt / 2));
    this.b = new int[paramInt - 2][paramInt - 2];
    for (int j = 1; j < this.b.length + 1; j++) {
      for (int k = 1; k < this.b[0].length + 1; k++)
      {
        double d1;
        if ((d1 = localR.a(new R(j, k))) <= paramInt / 2)
        {
          int tmp148_147 = (k - 1);
          int[] tmp148_143 = this.b[(j - 1)];
          tmp148_143[tmp148_147] = ((int)(tmp148_143[tmp148_147] + (paramInt / 2 - d1)));
        }
      }
    }
    this.c = 0;
  }
  
  public final void a()
  {
    System.out.println("Building map with " + this.e);
    double d1 = getWidth();
    double d2 = getHeight();
    this.h = new BufferedImage(getWidth(), getHeight(), 5);
    Graphics localGraphics;
    (localGraphics = this.h.getGraphics()).drawImage(this.d, 0, 0, null);
    System.out.println("highest " + this.c);
    double d3 = Math.log(this.c + 1);
    for (int i = 0; i < this.a.length; i++) {
      for (int j = 0; j < this.a.length; j++)
      {
        double d4;
        int k;
        if ((k = (int)((d4 = Math.log(this.a[i][j] + 1)) / d3 * (this.f.length - 1))) != 0)
        {
          localGraphics.setColor(this.f[k]);
          k = (int)(d1 * (i / this.a.length));
          int m = (int)(d2 * (j / this.a[0].length));
          int n = (int)(d1 * ((i + 1.0D) / this.a.length)) - k;
          int i1 = (int)(d2 * ((j + 1.0D) / this.a[0].length)) - m;
          localGraphics.fillRect(k, m, n, i1);
        }
      }
    }
  }
  
  public final void paint(Graphics paramGraphics)
  {
    System.out.println("Drawing heatmap " + this.h);
    if (this.h != null) {
      paramGraphics.drawImage(this.h, 0, 0, null);
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\h.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */