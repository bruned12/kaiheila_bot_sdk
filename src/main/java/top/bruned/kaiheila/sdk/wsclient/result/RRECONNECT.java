package top.bruned.kaiheila.sdk.wsclient.result;

import com.alibaba.fastjson.JSONObject;

public class RRECONNECT {
    public int code;
    public String err;

    public RRECONNECT(JSONObject json) {
        this.code = json.getInteger("code");
        this.err = json.getString("err");
    }
}
