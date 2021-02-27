package top.bruned.kaiheila.sdk.wsclient.result.event.PersonGuildMemberOfflineEvent;

import java.util.List;

public class Body {
    private String user_id;
    private long event_time;
    private List<String> guilds;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public long getEvent_time() {
        return event_time;
    }

    public void setEvent_time(long event_time) {
        this.event_time = event_time;
    }

    public List<String> getGuilds() {
        return guilds;
    }

    public void setGuilds(List<String> guilds) {
        this.guilds = guilds;
    }
}
