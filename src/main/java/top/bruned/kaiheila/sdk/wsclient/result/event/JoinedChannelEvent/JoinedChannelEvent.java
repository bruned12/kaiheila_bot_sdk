package top.bruned.kaiheila.sdk.wsclient.result.event.JoinedChannelEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;

public class JoinedChannelEvent extends REVENT {
    private Extra extra;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }


}
