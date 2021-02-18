package top.bruned.kaiheila.sdk.httpapi.object.result.channel;

import com.alibaba.fastjson.JSONObject;

public class Rmessage {
    public String msg_id;
    public int msg_timestamp;
    public String nonce;
    public Rmessage(JSONObject json){
        this.msg_id = json.getString("msg_id");
        this.msg_timestamp = json.getIntValue("msg_timestamp");
        this.nonce = json.getString("nonce");

    }
}
