package Client;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class h
  implements ChangeListener
{
  h(a parama) {}
  
  public final void stateChanged(ChangeEvent paramChangeEvent)
  {
    if (!(paramChangeEvent = (JSlider)paramChangeEvent.getSource()).getValueIsAdjusting())
    {
      A.k = (paramChangeEvent = paramChangeEvent.getValue()) / 10.0D;
      A.a();
      this.a.a.a.b("Hello mate!");
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\h.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */