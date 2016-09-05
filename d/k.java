package d;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class k
{
  public int a;
  public String b;
  public int c;
  
  public k(int paramInt1, String paramString, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  public k(Node paramNode)
  {
    paramNode = paramNode.getChildNodes();
    for (int i = 0; i < paramNode.getLength(); i++)
    {
      String str;
      if ((str = paramNode.item(i).getNodeName()).equals("id")) {
        this.a = Integer.parseInt(paramNode.item(i).getTextContent());
      } else if (str.equals("description")) {
        this.b = paramNode.item(i).getTextContent();
      } else if (str.equals("value")) {
        this.c = Integer.parseInt(paramNode.item(i).getTextContent());
      }
    }
  }
  
  public final String toString()
  {
    return "<Option><id>" + this.a + "</id><description>" + this.b + "</description><value>" + this.c + "</value></Option>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\k.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */