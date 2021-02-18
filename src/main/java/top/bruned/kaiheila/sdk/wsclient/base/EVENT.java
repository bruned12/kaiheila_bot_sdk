package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.wsclient.result.REVENT;

public class EVENT {
    public int s;
    public REVENT d;
    public int sn;
    public EVENT(JSONObject json){
        this.s = json.getInteger("s");
        this.d = new REVENT(json.getJSONObject("d"));
        this.sn = json.getInteger("sn");
    }
}
