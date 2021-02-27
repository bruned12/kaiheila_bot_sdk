package top.bruned.kaiheila.sdk.wsclient.result.event.GroupImageMessageEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.GroupTextMessageEvent.Author;
import top.bruned.kaiheila.sdk.wsclient.result.event.base.Attachments;

public class Extra {
    private String local_id;
    private int type;
    private String code;
    private String guild_id;
    private Author author;
    private Attachments attachments;

    public String getLocal_id() {
        return local_id;
    }

    public void setLocal_id(String local_id) {
        this.local_id = local_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGuild_id() {
        return guild_id;
    }

    public void setGuild_id(String guild_id) {
        this.guild_id = guild_id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }
}
