package top.bruned.kaiheila.sdk.httpapi.object.base.user;

import com.alibaba.fastjson.JSONObject;
import top.bruned.kaiheila.sdk.httpapi.object.base.Buser;

public class Urole_index extends Buser {
    public String os;
    public String nickname;
    public Urole_index(JSONObject json) {
        this.id = json.getString("id");
        this.username = json.getString("username");
        this.identify_num = json.getIntValue("identify_num");
        this.online = json.getBooleanValue("online");
        this.status = json.getIntValue("status");
        this.avatar = json.getString("avatar");
        this.mobile_verified = json.getBooleanValue("mobile_verified");
    }
}
