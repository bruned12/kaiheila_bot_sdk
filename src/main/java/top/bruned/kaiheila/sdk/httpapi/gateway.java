package top.bruned.kaiheila.sdk.httpapi;

import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class gateway {
    private Sendhttp api;
    private final String index = "/api/v3/gateway/index";
    public gateway(Sendhttp api){
        this.api = api;
    }
    public void getIndex(){
        api.getHttp(index);
    }
}
