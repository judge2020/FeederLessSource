package d;

import Client.A;
import Client.R;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class x
{
  public ArrayList a;
  public boolean[] b;
  public ArrayList c;
  public ArrayList d;
  public ArrayList e;
  public ArrayList f;
  public int g;
  public int h;
  
  public x() {}
  
  public x(String paramString)
  {
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if (!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType")) {
        if (((Element)localObject).getNodeName().equals("MyId"))
        {
          this.h = Integer.parseInt(((Element)localObject).getTextContent());
        }
        else if (((Element)localObject).getNodeName().equals("Time"))
        {
          this.g = Integer.parseInt(((Element)localObject).getTextContent());
        }
        else
        {
          int j;
          double d1;
          double d3;
          NodeList localNodeList;
          int k;
          String str;
          if (((Element)localObject).getNodeName().equals("Heros"))
          {
            this.a = new ArrayList();
            this.b = new boolean[10];
            localObject = ((Element)localObject).getChildNodes();
            for (j = 0; j < ((NodeList)localObject).getLength(); j++)
            {
              d1 = -1.0D;
              d3 = -1.0D;
              localNodeList = ((Element)((NodeList)localObject).item(j)).getChildNodes();
              for (k = 0; k < localNodeList.getLength(); k++)
              {
                if ((str = localNodeList.item(k).getNodeName()).equals("alive")) {
                  this.b[j] = Boolean.parseBoolean(localNodeList.item(k).getTextContent());
                }
                if (str.equals("null")) {
                  break;
                }
                if (str.equals("x")) {
                  d1 = Double.parseDouble(localNodeList.item(k).getTextContent());
                }
                if (str.equals("y")) {
                  d3 = Double.parseDouble(localNodeList.item(k).getTextContent());
                }
              }
              if (d1 != -1.0D) {
                this.a.add(new R(d1, d3));
              } else {
                this.a.add(null);
              }
            }
          }
          else if (((Element)localObject).getNodeName().equals("Wards"))
          {
            this.c = new ArrayList();
            localObject = ((Element)localObject).getChildNodes();
            for (j = 0; j < ((NodeList)localObject).getLength(); j++)
            {
              d1 = -1.0D;
              d3 = -1.0D;
              localNodeList = ((Element)((NodeList)localObject).item(j)).getChildNodes();
              for (k = 0; k < localNodeList.getLength(); k++)
              {
                if ((str = localNodeList.item(k).getNodeName()).equals("x")) {
                  d1 = Double.parseDouble(localNodeList.item(k).getTextContent());
                }
                if (str.equals("y")) {
                  d3 = Double.parseDouble(localNodeList.item(k).getTextContent());
                }
              }
              this.c.add(new R(d1, d3));
            }
          }
          else if (((Element)localObject).getNodeName().equals("Towers"))
          {
            this.f = new ArrayList();
            localObject = ((Element)localObject).getChildNodes();
            for (j = 0; j < ((NodeList)localObject).getLength(); j++)
            {
              boolean bool = Boolean.parseBoolean(((Element)((NodeList)localObject).item(j)).getTextContent());
              this.f.add(Boolean.valueOf(bool));
            }
          }
          else
          {
            double d2;
            if (((Element)localObject).getNodeName().equals("Ally_Creeps"))
            {
              this.d = new ArrayList();
              localObject = ((Element)localObject).getChildNodes();
              for (j = 0; j < ((NodeList)localObject).getLength(); j++)
              {
                d2 = -1.0D;
                d3 = -1.0D;
                localNodeList = ((Element)((NodeList)localObject).item(j)).getChildNodes();
                for (k = 0; k < localNodeList.getLength(); k++)
                {
                  if ((str = localNodeList.item(k).getNodeName()).equals("x")) {
                    d2 = Double.parseDouble(localNodeList.item(k).getTextContent());
                  }
                  if (str.equals("y")) {
                    d3 = Double.parseDouble(localNodeList.item(k).getTextContent());
                  }
                }
                this.d.add(new R(d2, d3));
              }
            }
            else if (((Element)localObject).getNodeName().equals("Enemy_Creeps"))
            {
              this.e = new ArrayList();
              localObject = ((Element)localObject).getChildNodes();
              for (j = 0; j < ((NodeList)localObject).getLength(); j++)
              {
                d2 = -1.0D;
                d3 = -1.0D;
                localNodeList = ((Element)((NodeList)localObject).item(j)).getChildNodes();
                for (k = 0; k < localNodeList.getLength(); k++)
                {
                  if ((str = localNodeList.item(k).getNodeName()).equals("x")) {
                    d2 = Double.parseDouble(localNodeList.item(k).getTextContent());
                  }
                  if (str.equals("y")) {
                    d3 = Double.parseDouble(localNodeList.item(k).getTextContent());
                  }
                }
                this.e.add(new R(d2, d3));
              }
            }
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>Update" + "</PacketType><Time>" + this.g + "</Time><MyId>" + this.h + "</MyId><Heros>";
    for (int i = 0; i < this.a.size(); i++) {
      if (this.a.get(i) != null) {
        str = str + "<Hero><id>" + i + "</id><x>" + ((R)this.a.get(i)).a + "</x><y>" + ((R)this.a.get(i)).b + "</y><alive>" + this.b[i] + "</alive></Hero>";
      } else {
        str = str + "<Hero><id>" + i + "</id><alive>" + this.b[i] + "</alive><null></null></Hero>";
      }
    }
    str = str + "</Heros><Wards>";
    for (i = 0; i < this.c.size(); i++) {
      str = str + "<Ward><x>" + ((R)this.c.get(i)).a + "</x><y>" + ((R)this.c.get(i)).b + "</y></Ward>";
    }
    str = str + "</Wards><Towers>";
    for (i = 0; i < this.f.size(); i++) {
      str = str + "<Tower>" + this.f.get(i) + "</Tower>";
    }
    str = str + "</Towers><Ally_Creeps>";
    for (i = 0; i < this.d.size(); i++) {
      str = str + "<Creep><x>" + ((R)this.d.get(i)).a + "</x><y>" + ((R)this.d.get(i)).b + "</y></Creep>";
    }
    str = str + "</Ally_Creeps><Enemy_Creeps>";
    for (i = 0; i < this.e.size(); i++) {
      str = str + "<Creep><x>" + ((R)this.e.get(i)).a + "</x><y>" + ((R)this.e.get(i)).b + "</y></Creep>";
    }
    return str += "</Enemy_Creeps></Packet>";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\x.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */