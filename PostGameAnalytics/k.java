package PostGameAnalytics;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class k
  implements ChangeListener
{
  public k(RangeSliderUI paramRangeSliderUI) {}
  
  public final void stateChanged(ChangeEvent paramChangeEvent)
  {
    if ((!RangeSliderUI.a(this.a)) && (!RangeSliderUI.b(this.a)))
    {
      this.a.calculateThumbLocation();
      RangeSliderUI.c(this.a).repaint();
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\k.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */