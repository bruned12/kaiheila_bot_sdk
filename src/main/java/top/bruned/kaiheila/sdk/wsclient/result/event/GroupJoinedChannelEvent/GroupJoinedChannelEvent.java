package top.bruned.kaiheila.sdk.wsclient.result.event.GroupJoinedChannelEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;

public class GroupJoinedChannelEvent extends REVENT {
    private Extra extra;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }


}
