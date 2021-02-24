package top.bruned.kaiheila.sdk.bot;

import top.bruned.kaiheila.sdk.httpapi.api;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class Bot {
    public api api;
    public Bot(String authorization) {
        this.api = new api(new Sendhttp(authorization));
    }
}
