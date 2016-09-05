package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class u
{
  private boolean a;
  
  public u(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public u(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if ((!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) && (localElement.getNodeName().equals("open"))) {
        this.a = Boolean.parseBoolean(localElement.getTextContent());
      }
    }
  }
  
  public final String toString()
  {
    return "<Packet><PacketType>Stats_Window</PacketType><open>" + this.a + "</open></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\u.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */