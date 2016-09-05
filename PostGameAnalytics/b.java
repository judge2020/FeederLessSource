package PostGameAnalytics;

import Client.R;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

public final class b
  implements Serializable
{
  public int a;
  public R b;
  public ArrayList c;
  public ArrayList d;
  public int e;
  
  public b(int paramInt1, int paramInt2, R paramR1, int paramInt3, R paramR2, int paramInt4, R paramR3)
  {
    this.e = paramInt1;
    this.a = paramInt2;
    this.b = paramR1;
    this.c = new ArrayList();
    this.d = new ArrayList();
    this.c.add(Integer.valueOf(paramInt3));
    this.d.add(paramR2);
    if (paramInt4 != -1)
    {
      this.c.add(Integer.valueOf(paramInt4));
      this.d.add(paramR3);
    }
    System.out.println(toString());
  }
  
  public final String toString()
  {
    String str = "DeathLog[ died:" + this.a + "(" + this.b.a + "," + this.b.b + ")";
    if (this.c.size() == 1)
    {
      str = str + " killer:" + this.c.get(0) + "(" + ((R)this.d.get(0)).a + "," + ((R)this.d.get(0)).b + ")";
    }
    else
    {
      str = str + " killes:";
      for (int i = 0; i < this.c.size(); i++) {
        str = str + this.c.get(0) + "(" + ((R)this.d.get(0)).a + "," + ((R)this.d.get(0)).b + ") ";
      }
    }
    return str;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */