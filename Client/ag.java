package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.JSlider;
import javax.swing.JTextArea;

final class ag
  implements ActionListener
{
  private a a;
  private ad b;
  
  public ag(a parama, ad paramad)
  {
    this.a = parama;
    this.b = paramad;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    System.out.println("rate panel: " + this.b.b.getValue() + ad.a(this.b) + this.b.a.getText());
    if (ad.a(this.b)) {
      this.a.a.a(this.b.b.getValue(), this.b.a.getText());
    } else {
      this.a.a.a(this.b.b.getValue(), "");
    }
    if (this.b.b.getValue() >= 7)
    {
      ad.b(this.b);
      this.b.revalidate();
      this.b.repaint();
      return;
    }
    this.a.a(false);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\ag.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */