package PostGameAnalytics;

import Client.ClientAlphaRelease;
import Client.w;
import d.u;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;

public final class c
  extends JFrame
{
  private e c;
  public boolean a;
  Client.a b;
  
  public c(Client.a parama)
  {
    this.b = parama;
    Object localObject;
    if ((parama != null) && (parama.a != null))
    {
      localObject = new u(true);
      parama.a.b.b.add(localObject);
    }
    this.c = new e(450, 650);
    this.c.setLocation(10, 10);
    (localObject = new JFrame()).getContentPane().setBackground(new Color(1710618));
    ((JFrame)localObject).getContentPane().setLayout(null);
    ((JFrame)localObject).setVisible(true);
    ((JFrame)localObject).setSize(470, 700);
    this.a = false;
    parama = this;
    ((JFrame)localObject).addWindowListener(new d(this, parama));
    ((JFrame)localObject).getContentPane().add(this.c);
    ((JFrame)localObject).repaint();
  }
  
  public final void a(a parama)
  {
    a locala = parama;
    (parama = this.c).b = locala;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */