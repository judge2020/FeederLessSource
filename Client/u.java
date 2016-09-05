package Client;

import java.awt.Color;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class u
  implements ChangeListener
{
  private JButton a;
  
  public u(JButton paramJButton)
  {
    this.a = paramJButton;
  }
  
  public final void stateChanged(ChangeEvent paramChangeEvent)
  {
    if ((paramChangeEvent = (ButtonModel)paramChangeEvent.getSource()).isRollover())
    {
      this.a.setBackground(new Color(171, 45, 20));
      return;
    }
    this.a.setBackground(new Color(153, 153, 153));
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\u.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */