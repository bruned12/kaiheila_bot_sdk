package top.bruned.kaiheila.sdk.httpapi.result.guild_mute_list;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
public class Guild_mute_list {
    private List<String> Mmute;
    private List<String> Hmute;
    public Guild_mute_list(JSONObject json){
        for(Object id :json.getJSONArray("1")){
            Mmute.add((String) id);
        }
        for(Object id :json.getJSONArray("2")){
            Hmute.add((String) id);
        }
    }
    public void set1(List<String> Mmute) {
        this.Mmute = Mmute;
    }
    public List<String> getMmute() {
        return Mmute;
    }

    public void set2(List<String> Hmute) {
        this.Hmute = Hmute;
    }
    public List<String> getHmute() {
        return Hmute;
    }
}
