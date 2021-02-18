package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.wsclient.result.RHELLO;

public class HELLO {
    public int s;
    public RHELLO d;
    public HELLO(JSONObject json){
        this.s = json.getInteger("s");
        this.d = new RHELLO(json.getJSONObject("d"));
    }
}
