package top.bruned.kaiheila.sdk.wsclient.result.event.GroupTextMessageEvent;

import java.util.List;

public class Author extends top.bruned.kaiheila.sdk.wsclient.result.event.base.Author {
    private boolean online;
    private String os;
    private int status;
    private String nickname;
    private List<Long> roles;

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }


}
