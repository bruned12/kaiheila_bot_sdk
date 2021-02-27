package top.bruned.kaiheila.sdk.wsclient.result.event.PersonImgaeMessageEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.base.Attachments;
import top.bruned.kaiheila.sdk.wsclient.result.event.base.Author;

public class Extra {
    private String local_id;
    private int type;
    private String code;
    private Author author;
    private Attachments attachments;
    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }
    public String getLocal_id() {
        return local_id;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public Author getAuthor() {
        return author;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }
    public Attachments getAttachments() {
        return attachments;
    }
}
