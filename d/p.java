package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class p
{
  public long a;
  public String b;
  public String c;
  public String d;
  public boolean e;
  public int f;
  public boolean g;
  public String h;
  
  public p(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Element localElement;
      if (!(localElement = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (localElement.getNodeName().equals("item_name")) {
          this.b = localElement.getTextContent();
        } else if (localElement.getNodeName().equals("item_url")) {
          this.c = localElement.getTextContent();
        } else if (localElement.getNodeName().equals("item_img")) {
          this.d = localElement.getTextContent();
        } else if (localElement.getNodeName().equals("expire")) {
          this.a = Long.parseLong(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("entered")) {
          this.e = Boolean.parseBoolean(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("tickets")) {
          this.f = Integer.parseInt(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("signup")) {
          this.g = Boolean.parseBoolean(localElement.getTextContent());
        } else if (localElement.getNodeName().equals("code")) {
          this.h = localElement.getTextContent();
        }
      }
    }
  }
  
  public final String toString()
  {
    String str;
    return str = "<Packet><PacketType>Raffel_Update" + "</PacketType><item_name>" + this.b + "</item_name><item_url>" + this.c + "</item_url><item_img>" + this.d + "</item_img><expire>" + this.a + "</expire><entered>" + this.e + "</entered><tickets>" + this.f + "</tickets><signup>" + this.g + "</signup><code>" + this.h + "</code></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\p.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */