package top.bruned.kaiheila.sdk.wsclient.result;

import com.alibaba.fastjson.JSONObject;

public class REVENT {
    public String channel_type;
    public int type;
    public String target_id;
    public String author_id;
    public String content;
    public String msg_id;
    public int msg_timestamp;
    public String nonce;

    public REVENT(JSONObject json){
        this.channel_type = json.getString("channel_type");
        this.type = json.getInteger("type");
        this.target_id = json.getString("target_id");
        this.author_id = json.getString("author_id");
        this.content = json.getString("content");
        this.msg_id = json.getString("msg_id");
        this.msg_timestamp = json.getInteger("msg_timestamp");
        this.nonce =json.getString("nonce");
    }
}
