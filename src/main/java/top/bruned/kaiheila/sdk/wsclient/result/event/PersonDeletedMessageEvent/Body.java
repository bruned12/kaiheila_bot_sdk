package top.bruned.kaiheila.sdk.wsclient.result.event.PersonDeletedMessageEvent;

public class Body {
    private String chat_code;
    private String msg_id;
    private String author_id;
    private String target_id;
    private long deleted_at;
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

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }
    public String getAuthor_id() {
        return author_id;
    }

    public void setTarget_id(String target_id) {
        this.target_id = target_id;
    }
    public String getTarget_id() {
        return target_id;
    }

    public void setDeleted_at(long deleted_at) {
        this.deleted_at = deleted_at;
    }
    public long getDeleted_at() {
        return deleted_at;
    }
}
