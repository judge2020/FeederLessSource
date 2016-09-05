package PostGameAnalytics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

final class g
  implements ActionListener
{
  private e a;
  
  public g(e parame)
  {
    this.a = parame;
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.a((JToggleButton)paramActionEvent.getSource());
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\g.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */