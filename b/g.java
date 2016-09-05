package b;

import org.json.simple.JSONObject;

public final class g
{
  public int a;
  public String b;
  public String c;
  
  public g(JSONObject paramJSONObject)
  {
    paramJSONObject.get("name");
    if (paramJSONObject.containsKey("matchid")) {
      paramJSONObject.get("matchid");
    }
    if (paramJSONObject.containsKey("game_time")) {
      paramJSONObject.get("game_time");
    }
    if (paramJSONObject.containsKey("clock_time")) {
      this.a = ((int)((Long)paramJSONObject.get("clock_time")).longValue());
    }
    if (paramJSONObject.containsKey("daytime")) {
      ((Boolean)paramJSONObject.get("daytime")).booleanValue();
    }
    if (paramJSONObject.containsKey("nightstalker_night")) {
      ((Boolean)paramJSONObject.get("nightstalker_night")).booleanValue();
    }
    if (paramJSONObject.containsKey("game_state")) {
      this.b = ((String)paramJSONObject.get("game_state"));
    }
    if (paramJSONObject.containsKey("win_team")) {
      this.c = ((String)paramJSONObject.get("win_team"));
    }
    if (paramJSONObject.containsKey("customgamename")) {
      paramJSONObject.get("customgamename");
    }
    if (paramJSONObject.containsKey("ward_purchase_cooldown")) {
      paramJSONObject.get("ward_purchase_cooldown");
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\g.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */