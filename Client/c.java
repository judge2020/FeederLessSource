package Client;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

final class c
  extends MouseAdapter
{
  c(a parama) {}
  
  public final void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (SwingUtilities.isLeftMouseButton(paramMouseEvent))
    {
      this.a.k.show(this.a.f, "1");
      this.a.setVisible(true);
      this.a.setExtendedState(0);
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\c.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */