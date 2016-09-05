package Client;

import java.awt.Rectangle;

public final class am
{
  private Rectangle g = new Rectangle(0, 0, 209, 205);
  private Rectangle h;
  public boolean a;
  public Rectangle b;
  public boolean c;
  public boolean d;
  public boolean e;
  private int i;
  private int j;
  private int k;
  private Rectangle l;
  public int f;
  private int m;
  private int n;
  
  public am(int paramInt1, int paramInt2)
  {
    this.h = new Rectangle(paramInt1, paramInt2, 20, 20);
    this.a = false;
    this.f = 0;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((this.n != paramInt2) || (this.m != paramInt1)) {
      this.a = false;
    }
    if (!this.a)
    {
      this.m = paramInt1;
      this.n = paramInt2;
      double d1 = paramInt1 / this.g.width;
      double d2 = paramInt1 / this.g.width;
      this.b = new Rectangle((int)(this.h.x * d1), (int)(this.h.y * d2), (int)(this.h.width * d1), (int)(this.h.height * d2));
      this.l = new Rectangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
    }
  }
  
  public final void a()
  {
    if (Math.max(this.i, this.j) > 0)
    {
      this.d = true;
      this.f = 0;
    }
    else
    {
      this.d = false;
    }
    this.e = false;
    if ((!this.a) && ((this.i != 0) || (this.j != 0)))
    {
      this.a = true;
      if (this.l.x != Integer.MAX_VALUE) {
        this.b = this.l;
      }
      this.l.x -= 1;
      this.l.y -= 1;
      this.l.width += 2 - this.l.x;
      this.l.height += 2 - this.l.y;
      this.l.height = ((int)(this.l.height * 1.5D));
      this.l = new Rectangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
      if (this.i > this.j) {
        this.c = true;
      } else {
        this.c = false;
      }
    }
    this.i = 0;
    this.j = 0;
    this.k = 0;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2);
    this.i += 1;
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2);
    this.j += 1;
  }
  
  private void d(int paramInt1, int paramInt2)
  {
    if (!this.a)
    {
      if (paramInt1 < this.l.x) {
        this.l.x = paramInt1;
      }
      if (paramInt2 < this.l.y) {
        this.l.y = paramInt2;
      }
      if (paramInt1 > this.l.width) {
        this.l.width = paramInt1;
      }
      if (paramInt2 > this.l.height) {
        this.l.height = paramInt2;
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\am.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */