package Client;

import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class af
  implements ChangeListener
{
  private JButton a;
  
  public af(JButton paramJButton)
  {
    this.a = paramJButton;
  }
  
  public final void stateChanged(ChangeEvent paramChangeEvent)
  {
    paramChangeEvent = (paramChangeEvent = (JSlider)paramChangeEvent.getSource()).getValue();
    this.a.setText("Submit a rating of: " + paramChangeEvent);
    this.a.setEnabled(true);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\af.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */