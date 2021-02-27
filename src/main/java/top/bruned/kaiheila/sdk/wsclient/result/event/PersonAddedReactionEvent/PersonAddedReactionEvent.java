package top.bruned.kaiheila.sdk.wsclient.result.event.PersonAddedReactionEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;

public class PersonAddedReactionEvent extends REVENT {
    private Extra extra;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }
}
