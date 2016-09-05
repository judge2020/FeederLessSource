package b;

import org.json.simple.JSONObject;

public final class f
{
  private String a;
  
  public f(JSONObject paramJSONObject)
  {
    this.a = ((String)paramJSONObject.get("name"));
    if (!this.a.equals("empty"))
    {
      if (paramJSONObject.containsKey("contains_rune")) {
        paramJSONObject.get("contains_rune");
      }
      if (paramJSONObject.containsKey("can_cast")) {
        ((Boolean)paramJSONObject.get("can_cast")).booleanValue();
      }
      if (paramJSONObject.containsKey("cooldown")) {
        paramJSONObject.get("cooldown");
      }
      if (paramJSONObject.containsKey("charges")) {
        paramJSONObject.get("charges");
      }
      if (paramJSONObject.containsKey("passive")) {
        ((Boolean)paramJSONObject.get("passive")).booleanValue();
      }
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\f.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */