package b;

import org.json.simple.JSONObject;

public final class h
{
  public String a;
  
  public h(JSONObject paramJSONObject)
  {
    if (paramJSONObject.containsKey("steamid"))
    {
      paramJSONObject.get("steamid");
      paramJSONObject.get("name");
      paramJSONObject.get("activity");
      paramJSONObject.get("kills");
      paramJSONObject.get("deaths");
      paramJSONObject.get("assists");
      paramJSONObject.get("last_hits");
      paramJSONObject.get("denies");
      paramJSONObject.get("kill_streak");
      this.a = ((String)paramJSONObject.get("team_name"));
      paramJSONObject.get("gold");
      paramJSONObject.get("gold_reliable");
      paramJSONObject.get("gold_unreliable");
      paramJSONObject.get("gpm");
      paramJSONObject.get("xpm");
    }
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\b\h.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */