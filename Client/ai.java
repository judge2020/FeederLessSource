package Client;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

final class ai
  implements ActionListener
{
  private URL a;
  
  public ai(String paramString)
  {
    try
    {
      this.a = new URL(paramString);
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      (paramString = localMalformedURLException).printStackTrace();
    }
  }
  
  public final void actionPerformed(ActionEvent paramActionEvent)
  {
    if (((paramActionEvent = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null) != null) && (paramActionEvent.isSupported(Desktop.Action.BROWSE))) {
      try
      {
        paramActionEvent.browse(this.a.toURI());
        return;
      }
      catch (Exception localException)
      {
        (paramActionEvent = localException).printStackTrace();
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\ai.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */