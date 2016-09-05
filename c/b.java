package c;

import Client.O;
import Client.y;
import java.awt.AWTException;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public final class b
  extends Thread
{
  private JLabel a;
  private BufferedImage b;
  private BufferedImage c;
  private int d;
  private int e;
  private ArrayList f;
  private JPanel g = new JPanel();
  private JFrame h;
  
  public final void run()
  {
    this.h = new JFrame();
    this.h.setIconImage(new ImageIcon("logo.png").getImage());
    this.h.setTitle("Calibrator");
    this.h.setSize(300, 200);
    this.h.setAlwaysOnTop(true);
    this.h.getContentPane().setLayout(null);
    this.h.getContentPane().add(this.g);
    this.h.getContentPane().setBackground(new Color(1710618));
    this.g.setBackground(new Color(1710618));
    JTextArea localJTextArea;
    (localJTextArea = new JTextArea()).setEditable(false);
    localJTextArea.setFocusable(false);
    localJTextArea.setBorder(BorderFactory.createEmptyBorder());
    localJTextArea.setText("Feedless is calibrating to the color of your monitor.  If this window does not disappear email eblur.ai@gmail.com with a screenshot!");
    localJTextArea.setLineWrap(true);
    localJTextArea.setWrapStyleWord(true);
    localJTextArea.setBounds(new Rectangle(10, 110, 260, 100));
    localJTextArea.setOpaque(false);
    localJTextArea.setForeground(Color.white);
    this.h.getContentPane().add(localJTextArea);
    this.h.setDefaultCloseOperation(2);
    this.h.setVisible(true);
    this.h.revalidate();
    boolean bool;
    for (int i = 0; !bool; bool = a()) {
      try
      {
        Thread.sleep(3000L);
      }
      catch (InterruptedException localInterruptedException2)
      {
        InterruptedException localInterruptedException1;
        (localInterruptedException1 = localInterruptedException2).printStackTrace();
      }
    }
    this.h.dispatchEvent(new WindowEvent(this.h, 201));
  }
  
  private void a(int paramInt, String paramString)
  {
    try
    {
      paramString = ImageIO.read(new File(paramString));
      this.f.add(new c(paramInt, new Rectangle(this.d, 0, paramString.getWidth(), paramString.getHeight()), paramString));
      this.d += paramString.getWidth();
      this.e = Math.max(this.e, paramString.getHeight());
      return;
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
  }
  
  public b()
  {
    this.g.setLayout(null);
    this.g.setLocation(50, 50);
    this.g.setSize(200, 50);
    this.f = new ArrayList();
    a(10, "OCR/ally_tower.png");
    a(11, "OCR/enemy_tower.png");
    a(14, "OCR/wards.png");
    for (int i = 0; i < 10; i++) {
      a(i + 0, "OCR/processed_p" + i + ".png");
    }
    this.b = null;
    try
    {
      this.b = ImageIO.read(new File("color_calibration_ident.png"));
    }
    catch (IOException localIOException)
    {
      (localObject = localIOException).printStackTrace();
    }
    Object localObject = new BufferedImage(this.b.getWidth() + this.d, Math.max(this.b.getHeight(), this.e), 2);
    for (int j = 0; j < this.b.getWidth(); j++) {
      for (int k = 0; k < this.b.getHeight(); k++) {
        ((BufferedImage)localObject).setRGB(j, k, this.b.getRGB(j, k));
      }
    }
    Graphics2D localGraphics2D;
    (localGraphics2D = (Graphics2D)((BufferedImage)localObject).getGraphics()).setComposite(AlphaComposite.SrcOver.derive(0.2F));
    Color localColor = new Color(((c)this.f.get(6)).b.getRGB(0, 0));
    int m = 0;
    for (int n = 0; n < this.f.size(); n++)
    {
      for (int i1 = 0; i1 < ((c)this.f.get(n)).b.getWidth(); i1++) {
        for (int i2 = 0; i2 < ((c)this.f.get(n)).b.getHeight(); i2++)
        {
          ((BufferedImage)localObject).setRGB(i1 + m + this.b.getWidth(), i2, ((c)this.f.get(n)).b.getRGB(i1, i2));
          localGraphics2D.setColor(localColor);
        }
      }
      m += ((c)this.f.get(n)).b.getWidth();
    }
    this.a = new JLabel(new ImageIcon((Image)localObject));
    this.a.setSize(((BufferedImage)localObject).getWidth(), ((BufferedImage)localObject).getHeight());
    this.g.add(this.a);
  }
  
  private boolean a()
  {
    Object localObject1 = null;
    try
    {
      localObject1 = new Robot();
    }
    catch (AWTException localAWTException)
    {
      (localObject2 = localAWTException).printStackTrace();
    }
    Object localObject2 = Toolkit.getDefaultToolkit().getScreenSize();
    this.c = ((Robot)localObject1).createScreenCapture(new Rectangle(0, 0, ((Dimension)localObject2).width, ((Dimension)localObject2).height));
    (localObject2 = (localObject1 = new BufferedImage(this.c.getWidth(), this.c.getHeight(), 12)).createGraphics()).drawImage(this.c, 0, 0, this.g);
    ((Graphics2D)localObject2).dispose();
    try
    {
      ImageIO.write((RenderedImage)localObject1, "png", new File("black_white_ss.png"));
    }
    catch (IOException localIOException)
    {
      (localObject2 = localIOException).printStackTrace();
    }
    System.out.println("screen " + ((BufferedImage)localObject1).getWidth() + " " + ((BufferedImage)localObject1).getHeight());
    System.out.println("match " + this.b.getWidth() + " " + this.b.getWidth());
    localObject2 = null;
    int k;
    int m;
    int n;
    for (int i = 0; i < ((BufferedImage)localObject1).getWidth() - this.b.getWidth(); i++)
    {
      for (j = 0; j < ((BufferedImage)localObject1).getHeight() - this.b.getHeight(); j++)
      {
        k = 1;
        for (m = 0; m < this.b.getWidth(); m++)
        {
          for (n = 0; n < this.b.getHeight(); n++) {
            if (((BufferedImage)localObject1).getRGB(i + m, j + n) != this.b.getRGB(m, n))
            {
              k = 0;
              break;
            }
          }
          if (k == 0) {
            break;
          }
        }
        if (k != 0)
        {
          localObject2 = new Point(i, j);
          break;
        }
      }
      if (localObject2 != null) {
        break;
      }
    }
    if (localObject2 == null)
    {
      System.out.println("MArker not found!");
      return false;
    }
    i = 0;
    for (int j = 0; j < this.f.size(); j++)
    {
      for (k = 0; k < ((c)this.f.get(j)).b.getWidth(); k++) {
        for (m = 0; m < ((c)this.f.get(j)).b.getHeight(); m++) {
          if (((n = this.c.getRGB(((Point)localObject2).x + this.b.getWidth() + i + k, ((Point)localObject2).y + m)) != -1) && (n != -16777216) && (n != 16777215) && (n != 0))
          {
            n = n;
            localObject1 = (c)this.f.get(j);
            float[] arrayOfFloat = new float[3];
            int i1 = n & 0xFF;
            int i2 = (n & 0xFF00) / 256;
            arrayOfFloat = Color.RGBtoHSB(n = (n & 0xFF0000) / 65536, i2, i1, arrayOfFloat);
            ((c)localObject1).c.a = Math.max(((c)localObject1).c.a, arrayOfFloat[0] * 360.0F);
            ((c)localObject1).c.b = Math.min(((c)localObject1).c.b, arrayOfFloat[0] * 360.0F);
            ((c)localObject1).c.c = Math.max(((c)localObject1).c.c, arrayOfFloat[1] * 100.0F);
            ((c)localObject1).c.d = Math.min(((c)localObject1).c.d, arrayOfFloat[1] * 100.0F);
            ((c)localObject1).c.e = Math.max(((c)localObject1).c.e, arrayOfFloat[2] * 100.0F);
            ((c)localObject1).c.f = Math.min(((c)localObject1).c.f, arrayOfFloat[2] * 100.0F);
          }
        }
      }
      (localObject1 = (c)this.f.get(j)).c.a = ((float)Math.ceil(((c)localObject1).c.a + 1.0F));
      ((c)localObject1).c.b = ((float)Math.floor(((c)localObject1).c.b - 1.0F));
      ((c)localObject1).c.c = ((float)Math.ceil(((c)localObject1).c.c + 1.0F));
      ((c)localObject1).c.d = ((float)Math.floor(((c)localObject1).c.d - 1.0F));
      ((c)localObject1).c.e = ((float)Math.ceil(((c)localObject1).c.e + 1.0F));
      ((c)localObject1).c.f = ((float)Math.floor(((c)localObject1).c.f - 1.0F));
      i += ((c)this.f.get(j)).b.getWidth();
      System.out.println(((c)this.f.get(j)).c.toString());
      O.k.put(((c)this.f.get(j)).a + "_perfect", ((c)this.f.get(j)).c);
      O localO;
      if ((localO = new O(((c)this.f.get(j)).a)).b != null) {
        System.out.println(localO.b.toString());
      } else {
        System.out.println("null");
      }
    }
    return true;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\c\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */