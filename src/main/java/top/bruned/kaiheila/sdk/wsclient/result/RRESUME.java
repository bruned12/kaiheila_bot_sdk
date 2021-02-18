package top.bruned.kaiheila.sdk.wsclient.result;

import com.alibaba.fastjson.JSONObject;

public class RRESUME {
    public String sessionId;
    public RRESUME(JSONObject json){
        this.sessionId = json.getString("sessionId");
    }
}
