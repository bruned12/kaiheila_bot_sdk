package top.bruned.kaiheila.sdk.wsclient.result;

import com.alibaba.fastjson.JSONObject;

public class REVENT {
    public JSONObject extra;
    private String channel_type;
    private int type;
    private String target_id;
    private String author_id;
    private String content;
    private String msg_id;
    private long msg_timestamp;
    private String nonce;

    public String getChannel_type() {
        return channel_type;
    }

    public void setChannel_type(String channel_type) {
        this.channel_type = channel_type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTarget_id() {
        return target_id;
    }

    public void setTarget_id(String target_id) {
        this.target_id = target_id;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public long getMsg_timestamp() {
        return msg_timestamp;
    }

    public void setMsg_timestamp(long msg_timestamp) {
        this.msg_timestamp = msg_timestamp;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

}

