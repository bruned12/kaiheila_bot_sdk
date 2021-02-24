package top.bruned.kaiheila.sdk.wsclient;

public class PING {
    public static String PING(int sn){
        String s = "{\"s\": 2,\"sn\": %d}";
        return String.format(s, sn);
    }

}
