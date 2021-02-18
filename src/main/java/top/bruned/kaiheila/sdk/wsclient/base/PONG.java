package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;

public class PONG {
    public int s;
    public PONG(JSONObject json){
        json.getInteger("s");
    }
}
