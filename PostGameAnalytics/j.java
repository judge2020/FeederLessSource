package PostGameAnalytics;

import javax.swing.BoundedRangeModel;
import javax.swing.JSlider;

public final class j
  extends JSlider
{
  public j()
  {
    j localj = this;
    setOrientation(0);
  }
  
  public final void updateUI()
  {
    setUI(new RangeSliderUI(this));
    updateLabelUIs();
  }
  
  public final int getValue()
  {
    return super.getValue();
  }
  
  public final void setValue(int paramInt)
  {
    if ((i = getValue()) == paramInt) {
      return;
    }
    int j = getExtent();
    paramInt = Math.min(Math.max(getMinimum(), paramInt), i + j);
    int i = j + i - paramInt;
    getModel().setRangeProperties(paramInt, i, getMinimum(), getMaximum(), getValueIsAdjusting());
  }
  
  public final int a()
  {
    return getValue() + getExtent();
  }
  
  public final void a(int paramInt)
  {
    int i = getValue();
    paramInt = Math.min(Math.max(0, paramInt - i), getMaximum() - i);
    setExtent(paramInt);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\j.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */