package top.bruned.kaiheila.sdk.wsclient.result.event.JoinedChannelEvent;

public class Body {
    private String user_id;
    private String channel_id;
    private long joined_at;

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

    public long getJoined_at() {
        return joined_at;
    }

    public void setJoined_at(long joined_at) {
        this.joined_at = joined_at;
    }
}
