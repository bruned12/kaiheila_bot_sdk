package top.bruned.kaiheila.sdk.bot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.util.Log;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpUtil {
    private final String webServer = "https://www.kaiheila.cn";
    private final Log log = new Log("HTTP");
    private final HttpClient client = HttpClient.newHttpClient();
    public String authorization;

    public HttpUtil(String authorization) {
        this.authorization = " " + authorization;
    }

    public static HttpRequest.Builder addJsonHeader(HttpRequest.Builder builder) {
        return builder.setHeader("Content-Type", "application/json");
    }

    public static HttpRequest.Builder basePostRequestBuilder(String url, String data) {
        return addJsonHeader(HttpRequest.newBuilder(URI.create(url)).POST(HttpRequest.BodyPublishers.ofString(data)));
    }

    public static HttpRequest.Builder baseGetRequestBuilder(String url) {
        return addJsonHeader(HttpRequest.newBuilder(URI.create(url)).GET());
    }

    public static JSONObject run_request(HttpClient client, HttpRequest request) {
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        if (response != null) {
            return JSON.parseObject(response.body());
        } else {
            return null;
        }
    }

    public HttpRequest.Builder addKaiheilaHeader(HttpRequest.Builder builder) {
        return builder.setHeader("Authorization", authorization);
    }

    public JSONObject getRequest(String url, List<String> data) {
        url = url + "?" + String.join("&", data);
        return getRequest(url);
    }

    public JSONObject getRequest(String url) {
        url = webServer + url;
        log.info(String.format("[GET][UP] %s", url));
        HttpRequest request = addKaiheilaHeader(baseGetRequestBuilder(url)).build();
        JSONObject jsonObject = run_request(request);
        log.info(String.format("[GET][DOWN] Code: %d Message: %s", jsonObject.getInteger("code"), jsonObject.getString("message")));
        return jsonObject;
    }

    public JSONObject postRequest(String url, String data) {
        url = webServer + url;
        log.info(String.format("[POST][UP] %s %s", url, data));
        HttpRequest request = addKaiheilaHeader(basePostRequestBuilder(url, data)).build();
        JSONObject jsonObject = run_request(request);
        log.info(String.format("[POST][DOWN] Code: %d Message: %s", jsonObject.getInteger("code"), jsonObject.getString("message")));
        return jsonObject;
    }

    public JSONObject run_request(HttpRequest request) {
        return run_request(client, request);
    }

}
