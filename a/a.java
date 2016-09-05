package a;

import Client.A;
import Client.R;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class a
{
  private static boolean n;
  public static HashMap a;
  private static HashMap o;
  private static HashMap p;
  private static HashMap q;
  public double b;
  public double c;
  public Rectangle d;
  public ArrayList e;
  public ArrayList f;
  public Rectangle g;
  public Rectangle h;
  public Rectangle i;
  public int j;
  public Rectangle k;
  public Rectangle l;
  public ArrayList m;
  
  public static void a()
  {
    if (!n)
    {
      n = true;
      o = new HashMap();
      p = new HashMap();
      q = new HashMap();
      a = new HashMap();
      Object localObject1 = (localObject1 = A.c("dota_db.xml")).getElementsByTagName("Hero");
      for (int i1 = 0; i1 < ((NodeList)localObject1).getLength(); i1++)
      {
        Object localObject2 = (Element)(localObject2 = ((NodeList)localObject1).item(i1));
        localObject2 = new d((Element)localObject2);
        o.put(((d)localObject2).a, localObject2);
        a.put(((d)localObject2).c, localObject2);
        Iterator localIterator = ((d)localObject2).b.iterator();
        while (localIterator.hasNext())
        {
          j localj = (j)localIterator.next();
          if (p.get(localj.a) == null) {
            p.put(localj.a, new ArrayList());
          }
          ((ArrayList)p.get(localj.a)).add(localObject2);
          if (q.get(localj.a + localj.b) == null) {
            q.put(localj.a + localj.b, new ArrayList());
          }
          ((ArrayList)q.get(localj.a + localj.b)).add(localObject2);
        }
      }
      new f();
      new i();
      new g();
      new e();
      new h();
    }
  }
  
  public static ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = o.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(str);
    }
    return localArrayList;
  }
  
  public a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    int i1 = 0;
    double d1 = paramInt2;
    System.out.println(this.c / this.b + " 1.25");
    if ((this.c / this.b >= 0.79D) && (this.c / this.b <= 0.81D))
    {
      System.out.println("5:4 ratio detected!");
      this.c = ((int)(this.b * 3.0D / 4.0D));
      paramInt2 = (int)this.c;
      i1 = 1;
    }
    double d2;
    int i6 = (int)((d2 = this.c / 1080.0D) * 281.0D);
    this.g = new Rectangle((int)(d2 * 6.0D), (int)(paramInt2 - i6 - d2 * 6.0D), (int)(d2 * 286.0D), i6);
    this.i = new Rectangle((int)(paramInt1 + d2 * 8.0D - this.g.width), this.g.y, this.g.width, this.g.height);
    this.j = ((int)Math.ceil(d2 * 8.0D));
    this.d = new Rectangle((int)((this.b - d2 * 867.0D) / 2.0D), 0, (int)(d2 * 867.0D), (int)(d2 * 41.0D));
    this.e = new ArrayList();
    for (i6 = 0; i6 < 5; i6++) {
      this.e.add(new Rectangle((int)(this.d.x + i6 * 66.25D * d2) + 1, (int)(d2 * 5.5D) + 1, (int)(d2 * 64.0D) - 1, (int)(d2 * 36.0D) - 1));
    }
    for (i6 = 4; i6 >= 0; i6--) {
      this.e.add(new Rectangle((int)(this.d.x + this.d.width - i6 * 66.25D * d2 - d2 * 64.0D) + 1, (int)(d2 * 5.5D) + 1, (int)(d2 * 64.0D) - 1, (int)(d2 * 36.0D) - 1));
    }
    this.f = new ArrayList();
    for (i6 = 0; i6 < this.e.size(); i6++) {
      this.f.add(new Rectangle(((Rectangle)this.e.get(i6)).x - this.d.x, ((Rectangle)this.e.get(i6)).y - this.d.y, ((Rectangle)this.e.get(i6)).width, ((Rectangle)this.e.get(i6)).height));
    }
    this.h = new Rectangle((int)((paramInt1 - d2 * 78.0D) / 2.0D), 0, (int)(d2 * 78.0D), (int)(d2 * 21.0D));
    new Rectangle(this.h.x - this.d.x, this.h.y - this.d.y, this.h.width, this.h.height);
    this.k = new Rectangle((int)(d2 * 27.0D - 5.0D), (int)(paramInt2 * 0.65D - d2 * 38.0D * 7.5D), (int)(d2 * 561.0D), (int)(d2 * 38.0D * 8.0D));
    new Rectangle((int)(paramInt1 * 0.37D + paramInt2 * 0.05D - 2.0D), (int)(paramInt2 * 0.55D - 2.0D), (int)(paramInt1 * 0.31D + 4.0D), (int)(paramInt2 * 0.156D + 4.0D));
    if (i1 != 0)
    {
      System.out.println("Adapting height on maps");
      Rectangle tmp813_810 = this.g;
      tmp813_810.y = ((int)(tmp813_810.y + (d1 - this.c)));
      Rectangle tmp834_831 = this.i;
      tmp834_831.y = ((int)(tmp834_831.y + (d1 - this.c)));
    }
    paramInt2 = (int)d1;
    this.c = paramInt2;
    this.m = new ArrayList();
    i6 = 0;
    i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i7 = 0;
    int i5 = paramInt2;
    int i4 = paramInt1;
    double d4 = i5 / i4;
    System.out.println("width: " + i4 + " height: " + i5);
    System.out.println("real ratio: " + d4);
    System.out.println("error getting screen ratio");
    double d3;
    if ((d3 = (0.75D < d4) && (d4 < 0.8500000000000001D) ? 0.8D : (0.5125D < d4) && (d4 < 0.6125D) ? 0.5625D : (0.575D < d4) && (d4 < 0.675D) ? 0.625D : (0.7D < d4) && (d4 < 0.8D) ? 0.75D : 0.0D) == 0.8D)
    {
      paramInt2 = 3 * paramInt1 / 4;
      d3 = 0.75D;
    }
    if (d3 == 0.75D)
    {
      i7 = (int)Math.round(paramInt2 / 22.32558139534884D);
      i3 = (int)Math.round(paramInt2 / 12.30769230769231D);
      i1 = (int)Math.round(paramInt2 / 10.105263157894736D);
      i2 = (int)Math.floor(paramInt2 / 10.105263157894736D);
    }
    else if (d3 == 0.5625D)
    {
      i7 = (int)Math.round(paramInt2 / 21.91780821917808D);
      i3 = (int)Math.round(paramInt2 / 12.21374045801527D);
      i1 = (int)Math.round(paramInt2 / 10.112359550561798D);
      i2 = (int)Math.floor(paramInt2 / 10.112359550561798D);
    }
    else if (d3 == 0.625D)
    {
      i7 = (int)Math.round(paramInt2 / 22.0D);
      i3 = (int)Math.round(paramInt2 / 12.32876712328767D);
      i1 = (int)Math.round(paramInt2 / 10.126582278481013D);
      i2 = (int)Math.floor(paramInt2 / 10.126582278481013D);
    }
    if (d3 == 0.75D) {
      i6 = (int)Math.round(0.05D * paramInt2);
    } else if (d3 == 0.5625D) {
      i6 = (int)Math.round(0.15333333333333332D * paramInt2);
    } else if (d3 == 0.625D) {
      i6 = (int)Math.round(0.114375D * paramInt2);
    }
    R localR1;
    R localR2;
    for (paramInt1 = 0; paramInt1 < 5; paramInt1++)
    {
      localR1 = new R(i6, i1);
      localR2 = new R(i6 + i3, i1 + i7);
      this.m.add(new Rectangle((int)localR1.a, (int)localR1.b, (int)(localR2.a - localR1.a), (int)(localR2.b - localR1.b)));
      i6 += i2;
    }
    if (d3 == 0.75D) {
      i6 = (int)Math.round(0.8072916666666666D * paramInt2);
    } else if (d3 == 0.5625D) {
      i6 = (int)Math.round(1.1455555555555557D * paramInt2);
    } else if (d3 == 0.625D) {
      i6 = (int)Math.round(0.978125D * paramInt2);
    } else {
      i6 = (int)Math.round(0.6140819964349377D * paramInt2);
    }
    for (paramInt1 = 0; paramInt1 < 5; paramInt1++)
    {
      localR1 = new R(i6, i1);
      localR2 = new R(i6 + i3, i1 + i7);
      this.m.add(new Rectangle((int)localR1.a, (int)localR1.b, (int)(localR2.a - localR1.a), (int)(localR2.b - localR1.b)));
      i6 += i2;
    }
    this.l = new Rectangle(((Rectangle)this.m.get(0)).x, ((Rectangle)this.m.get(0)).y, ((Rectangle)this.m.get(9)).x + ((Rectangle)this.m.get(9)).width - ((Rectangle)this.m.get(0)).x, ((Rectangle)this.m.get(9)).height);
    for (paramInt1 = 0; paramInt1 < this.m.size(); paramInt1++)
    {
      ((Rectangle)this.m.get(paramInt1)).x -= this.l.x;
      ((Rectangle)this.m.get(paramInt1)).y -= this.l.y;
    }
  }
  
  public static BufferedImage a(BufferedImage paramBufferedImage, Rectangle paramRectangle)
  {
    if (paramRectangle.x + paramRectangle.width > paramBufferedImage.getWidth()) {
      paramRectangle.x = (paramBufferedImage.getWidth() - paramRectangle.width);
    }
    if (paramRectangle.y + paramRectangle.height > paramBufferedImage.getHeight()) {
      paramRectangle.y = (paramBufferedImage.getHeight() - paramRectangle.height);
    }
    return paramBufferedImage.getSubimage(paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\a\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */