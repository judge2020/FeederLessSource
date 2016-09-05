package d;

import Client.A;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class a
{
  public ArrayList a;
  public long b;
  public String c;
  public long d;
  
  public a()
  {
    this.a = new ArrayList();
  }
  
  public a(String paramString)
  {
    paramString = (paramString = A.b(paramString)).getDocumentElement();
    this.a = new ArrayList();
    paramString = paramString.getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if (!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (((Element)localObject).getNodeName().equals("Options"))
        {
          localObject = ((Element)localObject).getChildNodes();
          for (int j = 0; j < ((NodeList)localObject).getLength(); j++)
          {
            k localk = new k(((NodeList)localObject).item(j));
            this.a.add(localk);
          }
        }
        else if (((Element)localObject).getNodeName().equals("LastLogin"))
        {
          this.b = Integer.parseInt(((Element)localObject).getTextContent());
        }
        else if (((Element)localObject).getNodeName().equals("Cookie"))
        {
          this.c = ((Element)localObject).getTextContent();
        }
        else if (((Element)localObject).getNodeName().equals("premium_expires_in"))
        {
          this.d = Long.parseLong(((Element)localObject).getTextContent());
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>Account" + "</PacketType><Cookie>" + this.c + "</Cookie><premium_expires_in>" + this.d + "</premium_expires_in><Options>";
    for (int i = 0; i < this.a.size(); i++) {
      str = str + ((k)this.a.get(i)).toString();
    }
    return str = str + "</Options><LastLogin>" + this.b + "</LastLogin></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */