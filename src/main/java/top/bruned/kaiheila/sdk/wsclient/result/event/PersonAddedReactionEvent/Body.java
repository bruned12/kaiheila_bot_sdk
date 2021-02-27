package top.bruned.kaiheila.sdk.wsclient.result.event.PersonAddedReactionEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.base.Emoji;

public class Body {
    private Emoji emoji;
    private String user_id;
    private String chat_code;
    private String msg_id;
    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }
    public Emoji getEmoji() {
        return emoji;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getUser_id() {
        return user_id;
    }

    public void setChat_code(String chat_code) {
        this.chat_code = chat_code;
    }
    public String getChat_code() {
        return chat_code;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }
    public String getMsg_id() {
        return msg_id;
    }
}
