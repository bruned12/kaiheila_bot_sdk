package top.bruned.kaiheila.sdk.httpapi;

import top.bruned.kaiheila.sdk.httpapi.object.result.Rindex;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class gateway {
    private final String index = "/api/v3/gateway/index";
    private Sendhttp api;

    public gateway(Sendhttp api) {
        this.api = api;
    }

    public Rindex getIndex() {
        return new Rindex(api.getHttp(index));
    }
}
