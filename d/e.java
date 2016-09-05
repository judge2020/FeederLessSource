package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class e
{
  private String a;
  
  public e(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
  }
  
  public e(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        this.a = localElement.getTextContent();
      }
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>Friend_Code" + "</PacketType><Code>" + this.a + "</Code></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */