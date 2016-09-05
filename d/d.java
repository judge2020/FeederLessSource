package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class d
{
  public d() {}
  
  public d(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      (localElement = (Element)paramString.item(i)).getNodeName();
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>Enter_Raffel" + "</PacketType></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */