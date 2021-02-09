package top.bruned.kaiheila.sdk.util.http;

import okhttp3.*;
import top.bruned.kaiheila.sdk.util.Log;

import java.io.IOException;

public class Sendhttp {
    private Log log;
    public MediaType mediaType=MediaType.Companion.parse("application/json;charset=utf-8");
    private String authorization;
    private String webServer = "https://www.kaiheila.cn";

    public Sendhttp(String authorization, Log log) {
        this.authorization = authorization;
        this.log = log;
    }

    public String getHttp(String url) {
        log.info("[GET]"+url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(webServer + url)
                .addHeader("Authorization",this.authorization)
                .get()
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String postHttp(String url,String json){
        log.info("[POST]"+url);
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.Companion.create(json, mediaType);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", this.authorization)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
