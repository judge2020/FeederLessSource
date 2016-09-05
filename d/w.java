package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class w
{
  private int a;
  private String b;
  
  public w(int paramInt, String paramString)
  {
    this.a = paramInt;
    this.b = paramString;
  }
  
  public w(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("Message")) {
          this.b = localElement.getTextContent();
        } else if (localElement.getNodeName().equals("Message_type")) {
          this.a = Integer.parseInt(localElement.getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>Tracking" + "</PacketType><Message_type>" + this.a + "</Message_type><Message>" + this.b + "</Message></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\w.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */