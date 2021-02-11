package top.bruned.kaiheila.sdk.httpapi;

import com.alibaba.fastjson.JSON;
import top.bruned.kaiheila.sdk.httpapi.object.data.Dmessage;
import top.bruned.kaiheila.sdk.httpapi.object.data.Drole_index;
import top.bruned.kaiheila.sdk.httpapi.object.result.Rmessage;
import top.bruned.kaiheila.sdk.httpapi.object.result.Rrole_index;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class channel {
    private final String message = "/api/v3/channel/message";
    private final String role_index = "/api/v3/channel-role/index";
    private final String role_create = "/api/v3/channel-role/create";
    private final String role_update = "/api/v3/channel-role/update";
    private final String role_delete = "/api/v3/channel-role/delete";
    private Sendhttp api;

    public channel(Sendhttp api) {
        this.api = api;
    }
    public Rmessage postMessage(Dmessage object){
        return new Rmessage(api.postHttp(message, JSON.toJSONString(object)));
    }
    public Rrole_index postRole_index(Drole_index object){
        return new Rrole_index(api.postHttp(role_index,JSON.toJSONString(object)));
    }
}
