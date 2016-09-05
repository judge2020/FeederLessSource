package d;

import Client.A;
import e.a;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class v
{
  public ArrayList a;
  
  public v()
  {
    this.a = new ArrayList();
  }
  
  public v(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if ((!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType")) && (((Element)localObject).getNodeName().equals("Donation")))
      {
        this.a = new ArrayList();
        localObject = ((Element)localObject).getChildNodes();
        for (int j = 0; j < ((NodeList)localObject).getLength(); j++)
        {
          String str1 = "";
          double d = 1.0D;
          NodeList localNodeList = ((Element)((NodeList)localObject).item(j)).getChildNodes();
          for (int k = 0; k < localNodeList.getLength(); k++)
          {
            String str2;
            if ((str2 = localNodeList.item(k).getNodeName()).equals("Name")) {
              str1 = localNodeList.item(k).getTextContent();
            }
            if (str2.equals("Value")) {
              d = Double.parseDouble(localNodeList.item(k).getTextContent());
            }
          }
          this.a.add(new a(str1, d));
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>Donators" + "</PacketType><Donation>";
    for (int i = 0; i < this.a.size(); i++) {
      str = str + "<Donator><Name>" + ((a)this.a.get(i)).a + "</Name><Value>" + ((a)this.a.get(i)).b + "</Value></Donator>";
    }
    return str += "</Donation></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\v.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */