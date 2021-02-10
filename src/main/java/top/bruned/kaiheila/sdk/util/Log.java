package top.bruned.kaiheila.sdk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private final String PluginName;

    public Log(String PluginName) {
        this.PluginName = PluginName;
    }

    private String buildHead(String Level) {
        Date nowdata = new Date( );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss:");
        String date = simpleDateFormat.format(nowdata);
        return String.format("[%s][%s][%s]", Level, date, PluginName);
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