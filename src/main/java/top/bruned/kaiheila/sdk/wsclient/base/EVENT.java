package top.bruned.kaiheila.sdk.wsclient.base;

import com.alibaba.fastjson.JSONObject;

public class EVENT {
    private int s;
    private JSONObject d;
    private int sn;

    public int getS() {
        return s;
    }

    public int getSn() {
        return sn;
    }

    public JSONObject getD() {
        return d;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public void setD(JSONObject d) {
        this.d = d;
    }
}
