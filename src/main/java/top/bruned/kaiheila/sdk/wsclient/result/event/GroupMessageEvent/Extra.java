package top.bruned.kaiheila.sdk.wsclient.result.event.GroupMessageEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.base.Author;

import java.util.List;

public class Extra {

    private String local_id;
    private int type;
    private String guild_id;
    private String channel_name;
    private List<String> mention;
    private boolean mention_all;
    private List<String> mention_roles;
    private boolean mention_here;
    private String code;
    private Author author;

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

    public String getGuild_id() {
        return guild_id;
    }

    public void setGuild_id(String guild_id) {
        this.guild_id = guild_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public List<String> getMention() {
        return mention;
    }

    public void setMention(List<String> mention) {
        this.mention = mention;
    }

    public boolean getMention_all() {
        return mention_all;
    }

    public void setMention_all(boolean mention_all) {
        this.mention_all = mention_all;
    }

    public List<String> getMention_roles() {
        return mention_roles;
    }

    public void setMention_roles(List<String> mention_roles) {
        this.mention_roles = mention_roles;
    }

    public boolean getMention_here() {
        return mention_here;
    }

    public void setMention_here(boolean mention_here) {
        this.mention_here = mention_here;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


}
