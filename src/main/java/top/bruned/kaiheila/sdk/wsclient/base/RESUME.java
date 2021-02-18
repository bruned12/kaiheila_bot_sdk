package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.wsclient.result.RRESUME;

public class RESUME {
    public int s;
    public RRESUME d;
    public RESUME(JSONObject json){
        this.s = json.getInteger("s");
        this.d = new RRESUME(json.getJSONObject("d"));
    }
}
