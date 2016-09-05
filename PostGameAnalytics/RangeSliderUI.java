package PostGameAnalytics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

class RangeSliderUI
  extends BasicSliderUI
{
  private Color a = Color.GREEN;
  private Rectangle b;
  private boolean c;
  private transient boolean d;
  private transient boolean e;
  
  public RangeSliderUI(j paramj)
  {
    super(paramj);
  }
  
  public void installUI(JComponent paramJComponent)
  {
    this.b = new Rectangle();
    super.installUI(paramJComponent);
  }
  
  protected BasicSliderUI.TrackListener createTrackListener(JSlider paramJSlider)
  {
    return new l(this);
  }
  
  protected ChangeListener createChangeListener(JSlider paramJSlider)
  {
    return new k(this);
  }
  
  protected void calculateThumbSize()
  {
    super.calculateThumbSize();
    this.b.setSize(this.thumbRect.width, this.thumbRect.height);
  }
  
  protected void calculateThumbLocation()
  {
    super.calculateThumbLocation();
    if (this.slider.getSnapToTicks())
    {
      int j = i = this.slider.getValue() + this.slider.getExtent();
      int m = this.slider.getMajorTickSpacing();
      int n = this.slider.getMinorTickSpacing();
      int i1 = 0;
      if (n > 0) {
        i1 = n;
      } else if (m > 0) {
        i1 = m;
      }
      if (i1 != 0)
      {
        int k;
        if ((i - this.slider.getMinimum()) % i1 != 0)
        {
          float f;
          k = Math.round(f = (i - this.slider.getMinimum()) / i1);
          k = this.slider.getMinimum() + k * i1;
        }
        if (k != i) {
          this.slider.setExtent(k - this.slider.getValue());
        }
      }
    }
    if (this.slider.getOrientation() == 0)
    {
      i = xPositionForValue(this.slider.getValue() + this.slider.getExtent());
      this.b.x = (i - this.b.width / 2);
      this.b.y = this.trackRect.y;
      return;
    }
    int i = yPositionForValue(this.slider.getValue() + this.slider.getExtent());
    this.b.x = this.trackRect.x;
    this.b.y = (i - this.b.height / 2);
  }
  
  protected Dimension getThumbSize()
  {
    return new Dimension(12, 12);
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent)
  {
    super.paint(paramGraphics, paramJComponent);
    paramJComponent = paramGraphics.getClipBounds();
    if (this.c)
    {
      if (paramJComponent.intersects(this.thumbRect)) {
        a(paramGraphics);
      }
      if (paramJComponent.intersects(this.b)) {
        b(paramGraphics);
      }
    }
    else
    {
      if (paramJComponent.intersects(this.b)) {
        b(paramGraphics);
      }
      if (paramJComponent.intersects(this.thumbRect)) {
        a(paramGraphics);
      }
    }
  }
  
  public void paintTrack(Graphics paramGraphics)
  {
    super.paintTrack(paramGraphics);
    Rectangle localRectangle = this.trackRect;
    if (this.slider.getOrientation() == 0)
    {
      i = this.thumbRect.x + this.thumbRect.width / 2;
      j = this.b.x + this.b.width / 2;
      k = localRectangle.height / 2 - 2;
      localColor = paramGraphics.getColor();
      paramGraphics.translate(localRectangle.x, localRectangle.y + k);
      paramGraphics.setColor(this.a);
      for (m = 0; m <= 3; m++) {
        paramGraphics.drawLine(i - localRectangle.x, m, j - localRectangle.x, m);
      }
      paramGraphics.translate(-localRectangle.x, -(localRectangle.y + k));
      paramGraphics.setColor(localColor);
      return;
    }
    int i = this.thumbRect.x + this.thumbRect.width / 2;
    int j = this.b.x + this.b.width / 2;
    int k = localRectangle.width / 2 - 2;
    Color localColor = paramGraphics.getColor();
    paramGraphics.translate(localRectangle.x + k, localRectangle.y);
    paramGraphics.setColor(this.a);
    for (int m = 0; m <= 3; m++) {
      paramGraphics.drawLine(m, i - localRectangle.y, m, j - localRectangle.y);
    }
    paramGraphics.translate(-(localRectangle.x + k), -localRectangle.y);
    paramGraphics.setColor(localColor);
  }
  
  public void paintThumb(Graphics paramGraphics) {}
  
  private void a(Graphics paramGraphics)
  {
    Rectangle localRectangle;
    int i = (localRectangle = this.thumbRect).width;
    int j = localRectangle.height;
    paramGraphics = (Graphics2D)paramGraphics.create();
    Shape localShape = a(i - 1, j - 1);
    paramGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.translate(localRectangle.x, localRectangle.y);
    paramGraphics.setColor(Color.CYAN);
    paramGraphics.fill(localShape);
    paramGraphics.setColor(Color.BLUE);
    paramGraphics.draw(localShape);
    paramGraphics.dispose();
  }
  
  private void b(Graphics paramGraphics)
  {
    Rectangle localRectangle;
    int i = (localRectangle = this.b).width;
    int j = localRectangle.height;
    paramGraphics = (Graphics2D)paramGraphics.create();
    Shape localShape = a(i - 1, j - 1);
    paramGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    paramGraphics.translate(localRectangle.x, localRectangle.y);
    paramGraphics.setColor(Color.PINK);
    paramGraphics.fill(localShape);
    paramGraphics.setColor(Color.RED);
    paramGraphics.draw(localShape);
    paramGraphics.dispose();
  }
  
  private static Shape a(int paramInt1, int paramInt2)
  {
    return paramInt1 = new Ellipse2D.Double(0.0D, 0.0D, paramInt1, paramInt2);
  }
  
  public void scrollByBlock(int paramInt)
  {
    synchronized (this.slider)
    {
      int i;
      if (((i = (this.slider.getMaximum() - this.slider.getMinimum()) / 10) <= 0) && (this.slider.getMaximum() > this.slider.getMinimum())) {
        i = 1;
      }
      paramInt = i * (paramInt > 0 ? 1 : -1);
      if (this.c)
      {
        i = ((j)this.slider).a();
        ((j)this.slider).a(i + paramInt);
      }
      else
      {
        i = this.slider.getValue();
        this.slider.setValue(i + paramInt);
      }
      return;
    }
  }
  
  public void scrollByUnit(int paramInt)
  {
    synchronized (this.slider)
    {
      paramInt = 1 * (paramInt > 0 ? 1 : -1);
      int i;
      if (this.c)
      {
        i = ((j)this.slider).a();
        ((j)this.slider).a(i + paramInt);
      }
      else
      {
        i = this.slider.getValue();
        this.slider.setValue(i + paramInt);
      }
      return;
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\RangeSliderUI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */