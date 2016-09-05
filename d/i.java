package d;

import Client.A;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class i
  extends m
{
  public ArrayList a;
  public ArrayList b;
  private ArrayList g;
  public ArrayList c;
  public ArrayList d;
  private ArrayList h;
  public double[] e;
  public double[] f;
  
  public i(ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4, ArrayList paramArrayList5, ArrayList paramArrayList6, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    this.c = paramArrayList3;
    this.a = paramArrayList1;
    this.g = paramArrayList2;
    this.h = paramArrayList4;
    this.b = new ArrayList();
    this.d = new ArrayList();
    this.e = paramArrayOfDouble1;
    this.f = paramArrayOfDouble2;
  }
  
  public i(String paramString)
  {
    this.c = new ArrayList();
    this.a = new ArrayList();
    this.g = new ArrayList();
    this.h = new ArrayList();
    this.b = new ArrayList();
    this.d = new ArrayList();
    this.e = new double[10];
    this.f = new double[10];
    paramString = (paramString = (paramString = A.b(paramString)).getDocumentElement()).getChildNodes();
    for (int i = 0; i < paramString.getLength(); i++)
    {
      Object localObject;
      if (!(localObject = (Element)paramString.item(i)).getNodeName().equals("PacketType"))
      {
        int j;
        if (((Element)localObject).getNodeName().equals("my_team"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.a.add(localObject[j]);
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("enemy_team"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.g.add(localObject[j]);
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("my_bans"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.c.add(localObject[j]);
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("enemy_bans"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.h.add(localObject[j]);
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("my_team_scores"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.b.add(Integer.valueOf(Integer.parseInt(localObject[j])));
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("my_bans_scores"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.d.add(Integer.valueOf(Integer.parseInt(localObject[j])));
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("advantage_team"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.e[j] = Double.parseDouble(localObject[j]);
            }
          }
        }
        else if (((Element)localObject).getNodeName().equals("advantage_enemy"))
        {
          localObject = ((Element)localObject).getTextContent().split(",");
          for (j = 0; j < localObject.length; j++) {
            if (localObject[j].length() != 0) {
              this.f[j] = Double.parseDouble(localObject[j]);
            }
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    String str = "<Packet><PacketType>HeroPick" + "</PacketType>";
    str = str + a(this.a, "my_team");
    str = str + a(this.g, "enemy_team");
    str = str + a(this.c, "my_bans");
    str = str + a(this.h, "enemy_bans");
    str = str + a(this.b, "my_team_scores");
    str = str + a(this.d, "my_bans_scores");
    str = str + "<advantage_team>";
    for (int i = 0; i < this.e.length; i++)
    {
      str = str + this.e[i];
      if (i != this.e.length - 1) {
        str = str + ",";
      }
    }
    str = str + "</advantage_team>";
    str = str + "<advantage_enemy>";
    for (i = 0; i < this.f.length; i++)
    {
      str = str + this.f[i];
      if (i != this.f.length - 1) {
        str = str + ",";
      }
    }
    str = str + "</advantage_enemy>";
    return str += "</Packet>";
  }
  
  private static String a(ArrayList paramArrayList, String paramString)
  {
    String str = "<" + paramString + ">";
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      str = str + paramArrayList.get(i);
      if (i != paramArrayList.size() - 1) {
        str = str + ",";
      }
    }
    return str = str + "</" + paramString + ">";
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\d\i.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */