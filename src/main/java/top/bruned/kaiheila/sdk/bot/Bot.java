package top.bruned.kaiheila.sdk.bot;


import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.bot.api.message_create.message_create_data;
import top.bruned.kaiheila.sdk.bot.api.message_create.rec_message_create;
import top.bruned.kaiheila.sdk.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Bot {
    private final HttpUtil httpUtil;
    private final Log log = new Log("API");

    public Bot(String authorization) {
        this.httpUtil = new HttpUtil(authorization);
    }

    public String gateway_index(Boolean compress) {
        List<String> list = new ArrayList<>();
        if (compress) {
            list.add("compress=1");
        } else {
            list.add("compress=0");
        }
        return httpUtil.getRequest("/api/v3/gateway/index", list).getJSONObject("data").getString("url");
    }

    public rec_message_create message_create(message_create_data data) {
        return httpUtil.postRequest("/api/v3/message/create", data.build()).getJSONObject("data").toJavaObject(rec_message_create.class);
    }

    public void message_delete(String msg_id) {
        JSONObject json = new JSONObject();
        json.put("msg_id", msg_id);
        httpUtil.postRequest("/api/v3/message/delete", json.toJSONString());
    }

}
