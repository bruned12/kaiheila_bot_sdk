package top.bruned.kaiheila.sdk.bot.api.message_create;

import com.alibaba.fastjson.JSONObject;

import static top.bruned.kaiheila.sdk.util.StringUtil.createRandomStr;

public class message_create_data {
    private final String target_id;
    private final String content;
    private Integer type;
    private String quote;
    private String nonce;
    private String temp_target_id;

    public message_create_data(String target_id, String content) {
        this.target_id = target_id;
        this.content = content;
    }

    public message_create_data setType(int type) {
        this.type = type;
        return this;
    }

    public message_create_data setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    public message_create_data setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public message_create_data setTemp_target_id(String temp_target_id) {
        this.temp_target_id = temp_target_id;
        return this;
    }

    public String build() {
        JSONObject json = new JSONObject();
        json.put("target_id", target_id);
        json.put("content", content);
        if (type != null) {
            json.put("type", type);
        }
        if (quote != null) {
            json.put("quote", quote);
        }
        if (nonce != null) {
            json.put("nonce", nonce);
        } else {
            json.put("nonce", createRandomStr(6));
        }
        if (temp_target_id != null) {
            json.put("temp_target_id", temp_target_id);
        }
        return json.toJSONString();

    }
}
