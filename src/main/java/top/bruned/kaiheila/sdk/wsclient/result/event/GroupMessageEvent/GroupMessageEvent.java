package top.bruned.kaiheila.sdk.wsclient.result.event.GroupMessageEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;

public class GroupMessageEvent extends REVENT {
    private Extra extra;
    public void setExtra(Extra extra) {
        this.extra = extra;
    }
    public Extra getExtra() {
        return extra;
    }
}
