package PostGameAnalytics;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

public final class l
  extends BasicSliderUI.TrackListener
{
  public l(RangeSliderUI paramRangeSliderUI)
  {
    super(paramRangeSliderUI);
  }
  
  public final void mousePressed(MouseEvent paramMouseEvent)
  {
    if (!RangeSliderUI.c(this.a).isEnabled()) {
      return;
    }
    this.currentMouseX = paramMouseEvent.getX();
    this.currentMouseY = paramMouseEvent.getY();
    if (RangeSliderUI.c(this.a).isRequestFocusEnabled()) {
      RangeSliderUI.c(this.a).requestFocus();
    }
    paramMouseEvent = 0;
    int i = 0;
    if ((RangeSliderUI.d(this.a)) || (RangeSliderUI.c(this.a).getMinimum() == RangeSliderUI.c(this.a).getValue()))
    {
      if (RangeSliderUI.e(this.a).contains(this.currentMouseX, this.currentMouseY)) {
        i = 1;
      } else if (RangeSliderUI.f(this.a).contains(this.currentMouseX, this.currentMouseY)) {
        paramMouseEvent = 1;
      }
    }
    else if (RangeSliderUI.f(this.a).contains(this.currentMouseX, this.currentMouseY)) {
      paramMouseEvent = 1;
    } else if (RangeSliderUI.e(this.a).contains(this.currentMouseX, this.currentMouseY)) {
      i = 1;
    }
    if (paramMouseEvent != 0)
    {
      switch (RangeSliderUI.c(this.a).getOrientation())
      {
      case 1: 
        this.offset = (this.currentMouseY - RangeSliderUI.f(this.a).y);
        break;
      case 0: 
        this.offset = (this.currentMouseX - RangeSliderUI.f(this.a).x);
      }
      RangeSliderUI.a(this.a, false);
      RangeSliderUI.b(this.a, true);
      return;
    }
    RangeSliderUI.b(this.a, false);
    if (i != 0)
    {
      switch (RangeSliderUI.c(this.a).getOrientation())
      {
      case 1: 
        this.offset = (this.currentMouseY - RangeSliderUI.e(this.a).y);
        break;
      case 0: 
        this.offset = (this.currentMouseX - RangeSliderUI.e(this.a).x);
      }
      RangeSliderUI.a(this.a, true);
      RangeSliderUI.c(this.a, true);
      return;
    }
    RangeSliderUI.c(this.a, false);
  }
  
  public final void mouseReleased(MouseEvent paramMouseEvent)
  {
    RangeSliderUI.b(this.a, false);
    RangeSliderUI.c(this.a, false);
    RangeSliderUI.c(this.a).setValueIsAdjusting(false);
    super.mouseReleased(paramMouseEvent);
  }
  
  public final void mouseDragged(MouseEvent paramMouseEvent)
  {
    if (!RangeSliderUI.c(this.a).isEnabled()) {
      return;
    }
    this.currentMouseX = paramMouseEvent.getX();
    this.currentMouseY = paramMouseEvent.getY();
    int i;
    int j;
    int k;
    int m;
    int n;
    if (RangeSliderUI.a(this.a))
    {
      RangeSliderUI.c(this.a).setValueIsAdjusting(true);
      paramMouseEvent = this;
      switch (RangeSliderUI.c(this.a).getOrientation())
      {
      case 1: 
        i = RangeSliderUI.f(paramMouseEvent.a).height / 2;
        j = paramMouseEvent.currentMouseY - paramMouseEvent.offset;
        k = RangeSliderUI.g(paramMouseEvent.a).y;
        m = RangeSliderUI.g(paramMouseEvent.a).y + (RangeSliderUI.g(paramMouseEvent.a).height - 1);
        n = RangeSliderUI.a(paramMouseEvent.a, RangeSliderUI.c(paramMouseEvent.a).getValue() + RangeSliderUI.c(paramMouseEvent.a).getExtent());
        if (RangeSliderUI.h(paramMouseEvent.a)) {
          m = n;
        } else {
          k = n;
        }
        j = Math.min(j = Math.max(j, k - i), m - i);
        paramMouseEvent.a.setThumbLocation(RangeSliderUI.f(paramMouseEvent.a).x, j);
        i = j + i;
        RangeSliderUI.c(paramMouseEvent.a).setValue(paramMouseEvent.a.valueForYPosition(i));
        break;
      case 0: 
        i = RangeSliderUI.f(paramMouseEvent.a).width / 2;
        j = paramMouseEvent.currentMouseX - paramMouseEvent.offset;
        k = RangeSliderUI.g(paramMouseEvent.a).x;
        m = RangeSliderUI.g(paramMouseEvent.a).x + (RangeSliderUI.g(paramMouseEvent.a).width - 1);
        n = RangeSliderUI.b(paramMouseEvent.a, RangeSliderUI.c(paramMouseEvent.a).getValue() + RangeSliderUI.c(paramMouseEvent.a).getExtent());
        if (RangeSliderUI.h(paramMouseEvent.a)) {
          k = n;
        } else {
          m = n;
        }
        j = Math.min(j = Math.max(j, k - i), m - i);
        paramMouseEvent.a.setThumbLocation(j, RangeSliderUI.f(paramMouseEvent.a).y);
        i = j + i;
        RangeSliderUI.c(paramMouseEvent.a).setValue(paramMouseEvent.a.valueForXPosition(i));
        break;
      default: 
        return;
      }
    }
    else if (RangeSliderUI.b(this.a))
    {
      RangeSliderUI.c(this.a).setValueIsAdjusting(true);
      paramMouseEvent = this;
      switch (RangeSliderUI.c(this.a).getOrientation())
      {
      case 1: 
        i = RangeSliderUI.f(paramMouseEvent.a).height / 2;
        j = paramMouseEvent.currentMouseY - paramMouseEvent.offset;
        k = RangeSliderUI.g(paramMouseEvent.a).y;
        m = RangeSliderUI.g(paramMouseEvent.a).y + (RangeSliderUI.g(paramMouseEvent.a).height - 1);
        n = RangeSliderUI.a(paramMouseEvent.a, RangeSliderUI.c(paramMouseEvent.a).getValue());
        if (RangeSliderUI.h(paramMouseEvent.a)) {
          k = n;
        } else {
          m = n;
        }
        j = Math.min(j = Math.max(j, k - i), m - i);
        RangeSliderUI.a(paramMouseEvent.a, RangeSliderUI.f(paramMouseEvent.a).x, j);
        i = j + i;
        RangeSliderUI.c(paramMouseEvent.a).setExtent(paramMouseEvent.a.valueForYPosition(i) - RangeSliderUI.c(paramMouseEvent.a).getValue());
        return;
      case 0: 
        i = RangeSliderUI.f(paramMouseEvent.a).width / 2;
        j = paramMouseEvent.currentMouseX - paramMouseEvent.offset;
        k = RangeSliderUI.g(paramMouseEvent.a).x;
        m = RangeSliderUI.g(paramMouseEvent.a).x + (RangeSliderUI.g(paramMouseEvent.a).width - 1);
        n = RangeSliderUI.b(paramMouseEvent.a, RangeSliderUI.c(paramMouseEvent.a).getValue());
        if (RangeSliderUI.h(paramMouseEvent.a)) {
          m = n;
        } else {
          k = n;
        }
        j = Math.min(j = Math.max(j, k - i), m - i);
        RangeSliderUI.a(paramMouseEvent.a, j, RangeSliderUI.f(paramMouseEvent.a).y);
        i = j + i;
        RangeSliderUI.c(paramMouseEvent.a).setExtent(paramMouseEvent.a.valueForXPosition(i) - RangeSliderUI.c(paramMouseEvent.a).getValue());
        return;
      }
    }
  }
  
  public final boolean shouldScroll(int paramInt)
  {
    return false;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\l.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */