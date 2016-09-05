package c;

import java.io.Serializable;
import java.util.ArrayList;

public final class a
  implements Serializable
{
  public int a;
  public ArrayList b = new ArrayList();
  public int c;
  public int d;
  public boolean e;
  
  public final String toString()
  {
    if (this.a == 2)
    {
      if (this.b.size() == 1) {
        return "Player " + this.b.get(0) + " killed Player " + this.c;
      }
      return "Player " + this.b.get(0) + ", " + this.b.get(1) + " killed Player " + this.c;
    }
    if (this.a == 0)
    {
      if (this.c == 0) {
        return "Roshan Killed by Dire";
      }
      return "Roshan Killed by Radiant";
    }
    if (this.a == 1) {
      return "Aegis Picked up by Player " + this.b.get(0);
    }
    return "Undefined event";
  }
  
  public final boolean a(a parama)
  {
    if (this.a != parama.a) {
      return false;
    }
    if (this.b.size() != parama.b.size()) {
      return false;
    }
    for (int i = 0; i < this.b.size(); i++) {
      if (this.b.get(i) != parama.b.get(i)) {
        return false;
      }
    }
    if (this.c != parama.c) {
      return false;
    }
    return this.d == parama.d;
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\c\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */