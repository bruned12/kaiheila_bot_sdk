package top.bruned.kaiheila.sdk.wsclient.result.event.base;

public class Attachments {
    private String type;
    private String name;
    private String url;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}
