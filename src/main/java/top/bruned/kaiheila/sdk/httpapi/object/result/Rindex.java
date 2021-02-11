package top.bruned.kaiheila.sdk.httpapi.object.result;

import com.alibaba.fastjson.JSONObject;

public class Rindex {
    public String url;
    public Rindex(JSONObject json){
        this.url = json.getString("url");
    }
}
