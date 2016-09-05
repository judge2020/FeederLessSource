package b;

import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public final class b
{
  public g a;
  public h b;
  public e c;
  private ArrayList d;
  private ArrayList e;
  
  public b(String paramString)
  {
    try
    {
      paramString = (JSONObject)(localObject = new JSONParser()).parse(paramString);
      a(paramString);
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
  }
  
  private void a(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject;
    if ((localJSONObject = (JSONObject)paramJSONObject.get("auth")) != null) {
      localJSONObject.get("token");
    }
    if ((localJSONObject = (JSONObject)paramJSONObject.get("provider")) != null) {
      new i(localJSONObject);
    }
    if ((localJSONObject = (JSONObject)paramJSONObject.get("map")) != null) {
      this.a = new g(localJSONObject);
    }
    if ((localJSONObject = (JSONObject)paramJSONObject.get("player")) != null) {
      this.b = new h(localJSONObject);
    }
    if ((localJSONObject = (JSONObject)paramJSONObject.get("hero")) != null) {
      this.c = new e(localJSONObject);
    }
    Object localObject;
    if ((localJSONObject = (JSONObject)paramJSONObject.get("abilities")) != null)
    {
      this.d = new ArrayList();
      for (int i = 0; i < localJSONObject.size() - 1; i++) {
        this.d.add(new a((JSONObject)localJSONObject.get("ability" + i)));
      }
      if (localJSONObject.size() != 0) {
        ((JSONObject)(localObject = localJSONObject.get("attributes"))).get("level");
      }
    }
    if ((localObject = (JSONObject)paramJSONObject.get("items")) != null)
    {
      this.e = new ArrayList();
      for (paramJSONObject = 0; paramJSONObject < Math.min(6, ((JSONObject)localObject).size()); paramJSONObject++) {
        this.e.add(new f((JSONObject)((JSONObject)localObject).get("slot" + paramJSONObject)));
      }
      for (paramJSONObject = 6; paramJSONObject < Math.min(12, ((JSONObject)localObject).size()); paramJSONObject++) {
        this.e.add(new f((JSONObject)((JSONObject)localObject).get("stash" + (paramJSONObject - 6))));
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\b.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */