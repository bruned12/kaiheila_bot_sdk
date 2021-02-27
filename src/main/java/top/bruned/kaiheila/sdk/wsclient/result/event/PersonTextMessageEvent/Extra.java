package top.bruned.kaiheila.sdk.wsclient.result.event.PersonTextMessageEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.base.Author;

import java.util.List;

public class Extra {
    private String local_id;
    private int type;
    private List<String> mention;
    private boolean mention_all;
    private List<String> mention_roles;
    private boolean mention_here;
    private String code;
    private Author author;
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

    public void setMention(List<String> mention) {
        this.mention = mention;
    }
    public List<String> getMention() {
        return mention;
    }

    public void setMention_all(boolean mention_all) {
        this.mention_all = mention_all;
    }
    public boolean getMention_all() {
        return mention_all;
    }

    public void setMention_roles(List<String> mention_roles) {
        this.mention_roles = mention_roles;
    }
    public List<String> getMention_roles() {
        return mention_roles;
    }

    public void setMention_here(boolean mention_here) {
        this.mention_here = mention_here;
    }
    public boolean getMention_here() {
        return mention_here;
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
}
