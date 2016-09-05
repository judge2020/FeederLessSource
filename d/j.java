package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class j
{
  private int a;
  private int b;
  
  public j(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public j(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("Width")) {
          this.a = Integer.parseInt(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("Height")) {
          this.b = Integer.parseInt(localElement.getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    return "<Packet><PacketType>MapInfo</PacketType><Width>" + this.a + "</Width><Height>" + this.b + "</Height></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\j.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */