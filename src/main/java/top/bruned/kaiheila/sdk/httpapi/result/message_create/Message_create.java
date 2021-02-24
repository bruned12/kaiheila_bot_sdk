package top.bruned.kaiheila.sdk.httpapi.result.message_create;

public class Message_create {
    private String msg_id;
    private long msg_timestamp;
    private String nonce;
    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }
    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_timestamp(long msg_timestamp) {
        this.msg_timestamp = msg_timestamp;
    }
    public long getMsg_timestamp() {
        return msg_timestamp;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
    public String getNonce() {
        return nonce;
    }
}
