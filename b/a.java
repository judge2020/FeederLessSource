package b;

import org.json.simple.JSONObject;

public final class a
{
  public a(JSONObject paramJSONObject)
  {
    paramJSONObject.get("name");
    paramJSONObject.get("level");
    ((Boolean)paramJSONObject.get("can_cast")).booleanValue();
    ((Boolean)paramJSONObject.get("passive")).booleanValue();
    ((Boolean)paramJSONObject.get("ability_active")).booleanValue();
    paramJSONObject.get("cooldown");
    ((Boolean)paramJSONObject.get("ultimate")).booleanValue();
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\a.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */