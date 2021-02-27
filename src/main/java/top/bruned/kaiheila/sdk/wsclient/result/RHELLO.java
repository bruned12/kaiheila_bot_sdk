package top.bruned.kaiheila.sdk.wsclient.result;

import com.alibaba.fastjson.JSONObject;

public class RHELLO {
    public int code;
    public String sessionId;

    public RHELLO(JSONObject json) {
        this.code = json.getInteger("code");
        this.sessionId = json.getString("sessionId");
    }
}
