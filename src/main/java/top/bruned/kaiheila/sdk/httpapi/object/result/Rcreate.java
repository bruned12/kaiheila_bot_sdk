package top.bruned.kaiheila.sdk.httpapi.object.result;

import com.alibaba.fastjson.JSONObject;

public class Rcreate {
    public String url;
    public Rcreate(JSONObject json){
        this.url = json.getString("url");
    }
}
