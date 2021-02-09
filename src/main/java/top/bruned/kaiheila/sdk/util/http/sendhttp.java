package top.bruned.kaiheila.sdk.util.http;

import okhttp3.*;

import java.io.IOException;

public class sendhttp {
    public MediaType mediaType=MediaType.Companion.parse("application/json;charset=utf-8");
    private String url;
    private String authorization;
    private String webServer = "https://www.kaiheila.cn/api";

    public sendhttp(String url, String authorization) {
        this.url = url;
        this.authorization = authorization;
    }

    public String getHttp(String url) {
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
    public String postHttp(String json) throws IOException {
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
