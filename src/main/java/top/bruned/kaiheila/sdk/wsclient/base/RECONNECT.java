package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.wsclient.result.RRECONNECT;

public class RECONNECT {
    public int s;
    public RRECONNECT d;
    public RECONNECT(JSONObject json){
        this.s = json.getInteger("s");
        this.d = new RRECONNECT(json.getJSONObject("d"));
    }
}
