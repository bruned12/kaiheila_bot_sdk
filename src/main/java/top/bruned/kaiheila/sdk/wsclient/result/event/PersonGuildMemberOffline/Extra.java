package top.bruned.kaiheila.sdk.wsclient.result.event.PersonGuildMemberOffline;

public class Extra {
    private String type;
    private Body body;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setBody(Body body) {
        this.body = body;
    }
    public Body getBody() {
        return body;
    }
}
