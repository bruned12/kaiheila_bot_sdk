package top.bruned.kaiheila.sdk.httpapi;
import com.alibaba.fastjson.JSON;
import top.bruned.kaiheila.sdk.httpapi.object.data.Dcreate;
import top.bruned.kaiheila.sdk.httpapi.object.result.Rcreate;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class asset {
    private final String create = "/api/v3/asset/create";
    private Sendhttp api;

    public asset(Sendhttp api) {
        this.api = api;
    }

    public Rcreate postCreate(Dcreate object){
        return new Rcreate(api.postHttp(create, JSON.toJSONString(object),"Content-Type","form-data"));
    }

}
