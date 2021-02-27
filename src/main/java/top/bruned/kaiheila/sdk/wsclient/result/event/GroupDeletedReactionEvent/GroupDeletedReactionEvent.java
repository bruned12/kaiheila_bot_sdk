package top.bruned.kaiheila.sdk.wsclient.result.event.GroupDeletedReactionEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;
import top.bruned.kaiheila.sdk.wsclient.result.event.PersonAddedReactionEvent.Extra;

public class GroupDeletedReactionEvent extends REVENT {
    private Extra extra;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }
}
