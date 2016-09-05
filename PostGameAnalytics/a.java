package PostGameAnalytics;

import Client.R;
import java.awt.Dimension;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public final class a
  implements Serializable
{
  ArrayList a;
  ArrayList b;
  ArrayList c;
  ArrayList d;
  ArrayList e;
  private ArrayList j;
  public String[] f;
  Dimension g;
  private ArrayList k;
  int h;
  int i;
  
  public a(int paramInt1, int paramInt2)
  {
    this.g = new Dimension(paramInt1, paramInt2);
    this.b = new ArrayList();
    for (paramInt1 = 0; paramInt1 < 10; paramInt1++) {
      this.b.add(new ArrayList());
    }
    this.a = new ArrayList();
    this.c = new ArrayList();
    this.d = new ArrayList();
    this.e = new ArrayList();
    this.j = new ArrayList();
    this.k = new ArrayList();
    for (paramInt1 = 0; paramInt1 < 10; paramInt1++) {
      this.k.add(new R(0.0D, 0.0D));
    }
    this.h = Integer.MAX_VALUE;
  }
  
  public final void a(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3)
  {
    this.a.add(Integer.valueOf(paramInt));
    if (paramInt < this.h) {
      this.h = paramInt;
    }
    if (paramInt > this.i) {
      this.i = paramInt;
    }
    for (int m = 0; m < this.b.size(); m++)
    {
      ((ArrayList)this.b.get(m)).add((R)paramArrayList1.get(m));
      if (paramArrayList1.get(m) != null)
      {
        ((R)this.k.get(m)).a = ((R)paramArrayList1.get(m)).a;
        ((R)this.k.get(m)).b = ((R)paramArrayList1.get(m)).b;
      }
    }
    this.d.addAll(paramArrayList3);
    this.e.add(Integer.valueOf(paramArrayList3.size()));
    ArrayList localArrayList = new ArrayList();
    for (paramArrayList1 = paramArrayList2.size() - 1; paramArrayList1 >= 0; paramArrayList1--)
    {
      if ((this.j.size() != 0) && (((c.a)paramArrayList2.get(paramArrayList1)).a((c.a)this.j.get(this.j.size() - 1)))) {
        break;
      }
      localArrayList.add(0, (c.a)paramArrayList2.get(paramArrayList1));
    }
    for (paramArrayList1 = 0; paramArrayList1 < localArrayList.size(); paramArrayList1++)
    {
      this.j.add((c.a)localArrayList.get(paramArrayList1));
      if (((c.a)localArrayList.get(paramArrayList1)).a == 2)
      {
        System.out.println("Adding player_killed_event");
        paramArrayList2 = ((Integer)((c.a)localArrayList.get(paramArrayList1)).b.get(0)).intValue();
        paramArrayList3 = -1;
        R localR = null;
        if (((c.a)localArrayList.get(paramArrayList1)).b.size() >= 2)
        {
          paramArrayList3 = ((Integer)((c.a)localArrayList.get(paramArrayList1)).b.get(1)).intValue();
          localR = ((R)this.k.get(paramArrayList3)).a();
        }
        int n = ((c.a)localArrayList.get(paramArrayList1)).c;
        this.c.add(new b(paramInt, n, ((R)this.k.get(n)).a(), paramArrayList2, ((R)this.k.get(paramArrayList2)).a(), paramArrayList3, localR));
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */