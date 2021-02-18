package top.bruned.kaiheila.sdk.httpapi.object.base;

import com.alibaba.fastjson.JSONObject;

public class Buser {
    protected String id;
    protected String username;
    protected int identify_num;
    protected boolean online;
    protected int status;
    protected String avatar;
    protected boolean mobile_verified;

    /*
        public Buser(JSONObject json){
        this.id = json.getString("id");
        this.username = json.getString("username");
        this.identify_num = json.getIntValue("identify_num");
        this.online = json.getBooleanValue("online");
        this.status = json.getIntValue("status");
        this.avatar = json.getString("avatar");
        this.mobile_verified = json.getBooleanValue("mobile_verified");
    }
    */
}
