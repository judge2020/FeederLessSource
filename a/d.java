package a;

import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class d
{
  public String a;
  public ArrayList b;
  private ArrayList d;
  public String c;
  
  public d(Element paramElement)
  {
    this.a = paramElement.getElementsByTagName("Name").item(0).getTextContent();
    this.c = paramElement.getElementsByTagName("GSI_Name").item(0).getTextContent();
    NodeList localNodeList1 = paramElement.getElementsByTagName("Role");
    this.b = new ArrayList();
    Object localObject;
    for (int i = 0; i < localNodeList1.getLength(); i++)
    {
      Node localNode;
      localObject = (Element)(localNode = localNodeList1.item(i));
      localObject = new j(((Element)localObject).getTextContent(), ((Element)localObject).getAttribute("Tier"));
      this.b.add(localObject);
    }
    NodeList localNodeList2 = paramElement.getElementsByTagName("Counter");
    this.d = new ArrayList();
    for (int j = 0; j < localNodeList2.getLength(); j++)
    {
      localObject = (Element)(localObject = localNodeList2.item(j));
      paramElement = new c(((Element)localObject).getTextContent(), ((Element)localObject).getAttribute("Type"));
      this.d.add(paramElement);
    }
  }
  
  public final String toString()
  {
    String str = this.a + "[ " + this.c + " Roles[";
    Iterator localIterator = this.b.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (j)localIterator.next();
      str = str + ((j)localObject).toString() + " ";
    }
    str = str + "] Counters [";
    localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      localObject = (c)localIterator.next();
      str = str + ((c)localObject).a + "(" + ((c)localObject).b + ") ";
    }
    return str += "] ]";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\a\d.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */