package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class q
{
  private int a;
  private String b;
  
  public q(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = new String(paramString);
  }
  
  public q(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("Score")) {
          this.a = Integer.parseInt(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("Comment")) {
          this.b = new String(localElement.getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    return "<Packet><PacketType>RateGame</PacketType><Comment>" + this.b + "</Comment><Score>" + this.a + "</Score></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\q.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */