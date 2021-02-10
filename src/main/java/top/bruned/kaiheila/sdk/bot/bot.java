package top.bruned.kaiheila.sdk.bot;

import top.bruned.kaiheila.sdk.httpapi.*;
import top.bruned.kaiheila.sdk.util.Log;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;

public class bot {
    public asset asset;
    public channel channel;
    public gateway gateway;
    public guild guild;
    public guild_emoji guild_emoji;
    public guildrole guildrole;
    public intimacy intimacy;
    public message message;
    public user user;
    public user_chat user_chat;
    private Log log = new Log("MAIN");


    public bot(String authorization) {
        Sendhttp api = new Sendhttp(authorization, log);
        this.asset = new asset(api);
        this.channel = new channel(api);
        this.gateway = new gateway(api);
        this.guild = new guild(api);
        this.guild_emoji = new guild_emoji(api);
        this.guildrole = new guildrole(api);
        this.intimacy = new intimacy(api);
        this.message = new message(api);
        this.user = new user(api);
        this.user_chat = new user_chat(api);


    }
}
