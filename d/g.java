package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class g
{
  public String a;
  public int b;
  
  public g() {}
  
  public g(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("Cookie")) {
          this.a = localElement.getTextContent();
        } else if (localElement.getNodeName().equals("Ver")) {
          this.b = Integer.parseInt(localElement.getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>Hello" + "</PacketType><Cookie>" + this.a + "</Cookie><Ver>" + this.b + "</Ver></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\g.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */