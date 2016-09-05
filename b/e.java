package b;

import org.json.simple.JSONObject;

public final class e
{
  private int b;
  public String a;
  
  public e(JSONObject paramJSONObject)
  {
    if (paramJSONObject.containsKey("id"))
    {
      this.b = ((int)((Long)paramJSONObject.get("id")).longValue());
      if (this.b != -1)
      {
        this.a = ((String)paramJSONObject.get("name"));
        paramJSONObject.get("level");
        ((Boolean)paramJSONObject.get("alive")).booleanValue();
        paramJSONObject.get("respawn_seconds");
        paramJSONObject.get("buyback_cost");
        paramJSONObject.get("buyback_cooldown");
        if (paramJSONObject.containsKey("health"))
        {
          paramJSONObject.get("health");
          paramJSONObject.get("max_health");
          paramJSONObject.get("health_percent");
          paramJSONObject.get("mana");
          paramJSONObject.get("max_mana");
          paramJSONObject.get("mana_percent");
          ((Boolean)paramJSONObject.get("silenced")).booleanValue();
          ((Boolean)paramJSONObject.get("stunned")).booleanValue();
          ((Boolean)paramJSONObject.get("disarmed")).booleanValue();
          ((Boolean)paramJSONObject.get("magicimmune")).booleanValue();
          ((Boolean)paramJSONObject.get("hexed")).booleanValue();
          ((Boolean)paramJSONObject.get("muted")).booleanValue();
          ((Boolean)paramJSONObject.get("break")).booleanValue();
          ((Boolean)paramJSONObject.get("has_debuff")).booleanValue();
          return;
        }
      }
    }
    else
    {
      this.b = -1;
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\e.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */