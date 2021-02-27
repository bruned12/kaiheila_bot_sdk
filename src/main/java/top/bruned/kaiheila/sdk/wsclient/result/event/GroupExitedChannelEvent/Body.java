package top.bruned.kaiheila.sdk.wsclient.result.event.GroupExitedChannelEvent;

public class Body {
    private String user_id;
    private String channel_id;
    private long exited_at;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public long getExited_at() {
        return exited_at;
    }

    public void setExited_at(long exited_at) {
        this.exited_at = exited_at;
    }

}
