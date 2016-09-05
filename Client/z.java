package Client;

import a.a;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.PrintStream;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public final class z
  extends JFrame
{
  private JLabel a;
  private ArrayList b;
  private ArrayList c;
  private JTextArea d;
  private ClientAlphaRelease e;
  
  public z(ClientAlphaRelease paramClientAlphaRelease)
  {
    this.e = paramClientAlphaRelease;
    setDefaultCloseOperation(2);
    getContentPane().setBackground(new Color(1710618));
    if (paramClientAlphaRelease != null)
    {
      localObject1 = new a(paramClientAlphaRelease.e.width, paramClientAlphaRelease.e.height);
      new Dimension(((a)localObject1).g.width + 50 + ((Rectangle)((a)localObject1).e.get(0)).width, ((a)localObject1).g.height + 80);
    }
    else
    {
      localObject2 = Toolkit.getDefaultToolkit().getScreenSize();
      localObject1 = new a(((Dimension)localObject2).width, ((Dimension)localObject2).height);
      new Dimension(((a)localObject1).g.width + 50 + ((Rectangle)((a)localObject1).e.get(0)).width, ((a)localObject1).g.height + 80);
    }
    paramClientAlphaRelease = ((a)localObject1).g.getSize();
    Object localObject1 = ((Rectangle)((a)localObject1).e.get(0)).getSize();
    this.a = new JLabel();
    Object localObject2 = new BufferedImage(paramClientAlphaRelease.width, paramClientAlphaRelease.height, 5);
    this.a.setIcon(new ImageIcon((Image)localObject2));
    this.a.setBounds(20, 20, paramClientAlphaRelease.width, paramClientAlphaRelease.height);
    this.a.setBackground(Color.black);
    getContentPane().setLayout(null);
    getContentPane().add(this.a);
    paramClientAlphaRelease = new BufferedImage(((Dimension)localObject1).width, ((Dimension)localObject1).height, 5);
    this.c = new ArrayList();
    this.b = new ArrayList();
    for (int i = 0; i < 10; i++)
    {
      JLabel localJLabel;
      (localJLabel = new JLabel()).setBounds(new Rectangle(this.a.location().x + this.a.getWidth() + 10, this.a.location().y + i * (((Dimension)localObject1).height + 2), ((Dimension)localObject1).width, ((Dimension)localObject1).height));
      localJLabel.setIcon(new ImageIcon(paramClientAlphaRelease));
      JTextField localJTextField;
      (localJTextField = new JTextField()).setOpaque(false);
      localJTextField.setBorder(BorderFactory.createEmptyBorder());
      localJTextField.setBounds(new Rectangle(localJLabel.location().x + localJLabel.getWidth() + 10, localJLabel.location().y, 100, ((Dimension)localObject1).height));
      localJTextField.setText("Player " + i);
      localJTextField.setEditable(false);
      localJTextField.setFocusable(false);
      localJTextField.setForeground(Color.white);
      getContentPane().add(localJTextField);
      getContentPane().add(localJLabel);
      this.b.add(localJLabel);
      this.c.add(localJTextField);
      System.out.println(localJLabel.getLocation().y + localJLabel.getHeight());
    }
    this.d = new JTextArea();
    setBounds(100, 100, ((JTextField)this.c.get(0)).getLocation().x + ((JTextField)this.c.get(0)).getWidth(), ((JLabel)this.b.get(9)).getLocation().y + 2 * ((JTextField)this.c.get(9)).getHeight() + 20);
    this.d.setBounds(new Rectangle(this.a.getBounds().x, this.a.getBounds().y + this.a.getBounds().height + 10, this.a.getBounds().width, getBounds().height - (this.a.getBounds().y + this.a.getBounds().height + 60)));
    this.d.setOpaque(false);
    this.d.setBorder(BorderFactory.createEmptyBorder());
    this.d.setText("INFO: ");
    this.d.setEditable(false);
    this.d.setFocusable(false);
    this.d.setForeground(Color.white);
    add(this.d);
    System.out.println(((JLabel)this.b.get(9)).getLocation().y + 2 * ((JTextField)this.c.get(9)).getHeight());
    setVisible(true);
    setAlwaysOnTop(true);
  }
  
  public final void a(M paramM)
  {
    long l = System.currentTimeMillis();
    if ((paramM.c != null) && (paramM.c.i != null) && (paramM.c.i.f != null)) {
      this.a.setIcon(new ImageIcon(paramM.c.i.f));
    }
    if (paramM.f != null) {
      for (int i = 0; i < paramM.f.length; i++)
      {
        ((JLabel)this.b.get(i)).setIcon(new ImageIcon(paramM.f[i]));
        ((JTextField)this.c.get(i)).setText(paramM.d[i]);
      }
    }
    this.d.setText("my_id:" + paramM.g + "\nis_radiant:" + paramM.h + "\ncan't match my hero to gsi:" + paramM.i + "\ndebug time:" + (System.currentTimeMillis() - l) + " main:" + this.e.h);
    repaint();
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\z.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */