package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class s
{
  private int a;
  private int b;
  private int c;
  
  public s(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = paramInt3;
  }
  
  public s(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("Width")) {
          this.b = Integer.parseInt(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("Height")) {
          this.c = Integer.parseInt(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("State")) {
          this.a = Integer.parseInt(localElement.getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    return "<Packet><PacketType>SessionState</PacketType><Width>" + this.b + "</Width><Height>" + this.c + "</Height><State>" + this.a + "</State></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\s.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */