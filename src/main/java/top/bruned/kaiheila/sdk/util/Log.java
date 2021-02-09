package top.bruned.kaiheila.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private String PluginName;

    private String buildHead(String Level) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss:");
        String date = simpleDateFormat.format(new Date());
        return String.format("[%s][%s][%s]", Level, date, PluginName);
    }

    public Log(String PluginName) {
        this.PluginName = PluginName;
    }

    public void info(String msg) {
        System.out.println(buildHead("INFO") + msg);
    }

    public void warning(String msg) {
        System.out.println(buildHead("WARNING") + msg);
    }

    public void debug(String msg) {
        System.out.println(buildHead("DEBUG") + msg);
    }
}
//[INFO][12:12:12][PluginName]Plugin init