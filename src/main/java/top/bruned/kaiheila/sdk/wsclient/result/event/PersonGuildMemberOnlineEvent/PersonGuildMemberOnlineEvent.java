package top.bruned.kaiheila.sdk.wsclient.result.event.PersonGuildMemberOnlineEvent;

import top.bruned.kaiheila.sdk.wsclient.result.REVENT;
import top.bruned.kaiheila.sdk.wsclient.result.event.PersonGuildMemberOfflineEvent.Extra;

public class PersonGuildMemberOnlineEvent extends REVENT {
    private Extra extra;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }
}
