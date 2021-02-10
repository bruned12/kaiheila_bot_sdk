package top.bruned.kaiheila.sdk.util.http;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.jetbrains.annotations.Nullable;
import top.bruned.kaiheila.sdk.util.Log;

import java.io.IOException;

public class Sendhttp {
    private final Log log;
    private final String authorization;
    private final String webServer = "https://www.kaiheila.cn";
    public MediaType mediaType = MediaType.Companion.parse("application/json;charset=utf-8");

    public Sendhttp(String authorization, Log log) {
        this.authorization = authorization;
        this.log = log;
    }

    public JSONObject getHttp(String url) {
        log.info("[GET]" + url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(webServer + url)
                .addHeader("Authorization", this.authorization)
                .get()
                .build();
        return getJsonObject(client, request);
    }

    public JSONObject postHttp(String url, String json) {
        log.info("[POST]" + url);
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.Companion.create(json, mediaType);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", this.authorization)
                .post(body)
                .build();
        return getJsonObject(client, request);
    }

    @Nullable
    private JSONObject getJsonObject(OkHttpClient client, Request request) {
        try (Response response = client.newCall(request).execute()) {
            JSONObject jsonObject = JSONObject.parseObject(response.body().string());
            log.info("[RESULT]" + "code:" + jsonObject.getIntValue("code") + "," + "message:" + jsonObject.getString("message"));
            return jsonObject.getJSONObject("data");
        } catch (IOException e) {
            log.warning("API-ERROR");
        }
        return null;
    }
}
