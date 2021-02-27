package top.bruned.kaiheila.sdk.wsclient.result.event.DeletedMessageEvent;

public class Body {
    private String channel_id;
    private String msg_id;

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }
}
