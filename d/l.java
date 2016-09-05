package d;

import Client.A;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class l
{
  public ArrayList a;
  
  public l(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  public l(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    this.a = new ArrayList();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if (!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType"))
      {
        localObject = ((Element)localObject).getChildNodes();
        for (int j = 0; j < ((NodeList)localObject).getLength(); j++) {
          this.a.add(new k(((NodeList)localObject).item(j)));
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>Option" + "</PacketType><Options>";
    for (int i = 0; i < this.a.size(); i++) {
      str = str + ((k)this.a.get(i)).toString();
    }
    return str += "</Options></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\l.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */