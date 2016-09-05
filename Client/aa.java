package Client;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

final class aa
  extends MouseAdapter
{
  aa(T paramT) {}
  
  public final void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (Desktop.isDesktopSupported()) {
      try
      {
        Desktop.getDesktop().browse(new URI("http://www.eblur.co.uk/raffles"));
        return;
      }
      catch (IOException|URISyntaxException localIOException)
      {
        (paramMouseEvent = localIOException).printStackTrace();
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\aa.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */