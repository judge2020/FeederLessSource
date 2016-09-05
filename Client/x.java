package Client;

import java.awt.Point;
import java.awt.Rectangle;

public final class x
{
  public int a;
  public int b;
  public double c;
  public int d;
  public double e;
  public double f;
  public Rectangle g;
  public int h = 3;
  public int i = 0;
  public int j;
  public int k;
  
  public x(int paramInt1, int paramInt2)
  {
    new Point(paramInt1, paramInt2);
    this.a = 0;
    this.b = 0;
    this.c = 0.0D;
    this.d = 0;
    this.g = new Rectangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
    this.k = 1;
  }
  
  public final void a()
  {
    this.e /= this.a;
    this.f /= this.a;
    this.c = (this.c * 1000.0D / this.b);
  }
  
  public final void a(x paramx)
  {
    this.c = ((this.c * this.b + paramx.c * paramx.b) / (paramx.b + this.b));
    this.e = ((this.e * this.a + paramx.e * paramx.a) / (this.a + paramx.a));
    this.f = ((this.f * this.a + paramx.f * paramx.a) / (this.a + paramx.a));
    this.a += paramx.a;
    this.b += paramx.b;
    this.g.width = (this.g.x + this.g.width);
    this.g.height = (this.g.y + this.g.height);
    if (paramx.g.x < this.g.x) {
      this.g.x = paramx.g.x;
    }
    if (paramx.g.y < this.g.y) {
      this.g.y = paramx.g.y;
    }
    if (paramx.g.x + paramx.g.width > this.g.width) {
      paramx.g.width += paramx.g.x;
    }
    if (paramx.g.y + paramx.g.height > this.g.height) {
      paramx.g.height += paramx.g.y;
    }
    this.g.width -= this.g.x;
    this.g.height -= this.g.y;
    this.k += paramx.k;
  }
  
  public final String toString()
  {
    return "[inside_points:" + this.a + "(" + this.d + ") outside_points:" + this.b + "(" + this.c + ") cov:(" + this.g.x + "," + this.g.y + "," + this.g.width + "," + this.g.height + ") avg:(" + this.e + "," + this.f + ")]";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\x.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */