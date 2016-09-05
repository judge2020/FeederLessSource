package d;

import Client.A;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class h
  extends m
{
  private String[] a;
  
  public h(String[] paramArrayOfString)
  {
    this.a = paramArrayOfString;
  }
  
  public h(String paramString)
  {
    this.a = new String[10];
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if (!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType"))
      {
        localObject = ((Element)localObject).getChildNodes();
        for (int j = 0; j < ((NodeList)localObject).getLength(); j++)
        {
          String str;
          if ((str = ((NodeList)localObject).item(j).getNodeName()).equals("Name")) {
            this.a[(i - 1)] = ((NodeList)localObject).item(j).getTextContent();
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>HeroList" + "</PacketType>";
    for (int i = 0; i < this.a.length; i++) {
      str = str + "<Hero><id>" + i + "</id><Name>" + this.a[i] + "</Name></Hero>";
    }
    return str += "</Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\h.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */