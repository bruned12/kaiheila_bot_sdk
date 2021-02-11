package top.bruned.kaiheila.sdk.httpapi.object.data;

public class Dmessage {
    private int type;
    private String channel_id;
    private String content;
    private String quote;
    private String nonce;
    private String temp_target_id;

    public Dmessage(String channel_id, String content) {
        this.channel_id = channel_id;
        this.content = content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public void setTemp_target_id(String temp_target_id) {
        this.temp_target_id = temp_target_id;
    }
}
