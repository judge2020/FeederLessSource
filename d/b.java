package d;

import Client.A;
import c.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class b
{
  private ArrayList a;
  
  public b(ArrayList paramArrayList)
  {
    this.a = paramArrayList;
  }
  
  public b(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    this.a = new ArrayList();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject1;
      if (!(localObject1 = (Element)paramString.item(i)).getNodeName().equals("PacketType"))
      {
        localObject1 = ((Element)localObject1).getChildNodes();
        a locala = new a();
        for (int j = 0; j < ((NodeList)localObject1).getLength(); j++)
        {
          Object localObject2;
          if ((localObject2 = ((NodeList)localObject1).item(j).getNodeName()).equals("type"))
          {
            locala.a = Integer.parseInt(((NodeList)localObject1).item(j).getTextContent());
          }
          else if (((String)localObject2).equals("target"))
          {
            locala.c = Integer.parseInt(((NodeList)localObject1).item(j).getTextContent());
          }
          else if (((String)localObject2).equals("gold"))
          {
            locala.d = Integer.parseInt(((NodeList)localObject1).item(j).getTextContent());
          }
          else if (((String)localObject2).equals("from"))
          {
            localObject2 = ((NodeList)localObject1).item(j).getChildNodes();
            for (int k = 0; k < ((NodeList)localObject2).getLength(); k++) {
              locala.b.add(Integer.valueOf(Integer.parseInt(((NodeList)localObject2).item(k).getTextContent())));
            }
          }
        }
        this.a.add(locala);
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>ActionEvent" + "</PacketType>";
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      str = str + "<Event><type>" + locala.a + "</type><from>";
      for (int i = 0; i < locala.b.size(); i++) {
        str = str + "<e>" + locala.b.get(i) + "</e>";
      }
      str = str + "</from><target>" + locala.c + "</target><gold>" + locala.d + "</gold></Event>";
    }
    return str += "</Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */