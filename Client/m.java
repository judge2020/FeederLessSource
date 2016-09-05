package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

final class m
  implements ActionListener
{
  m(a parama1, a parama2) {}
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      this.a.setVisible(false);
      paramActionEvent = new d.w(0, "Exit clicked.");
      if ((this.a.a != null) && (this.a.a.b != null)) {
        this.a.a.b.a(paramActionEvent);
      }
      Thread.sleep(2000L);
    }
    catch (Exception localException)
    {
      (paramActionEvent = localException).printStackTrace();
    }
    System.exit(0);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\m.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */