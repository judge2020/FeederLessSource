package PostGameAnalytics;

import Client.ClientAlphaRelease;
import Client.a;
import Client.w;
import d.u;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

final class d
  extends WindowAdapter
{
  d(c paramc1, c paramc2) {}
  
  public final void windowClosing(WindowEvent paramWindowEvent)
  {
    if (this.b.b.a != null)
    {
      u localu = new u(false);
      this.b.b.a.b.b.add(localu);
    }
    this.a.a = true;
    paramWindowEvent.getWindow().dispose();
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\PostGameAnalytics\d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */