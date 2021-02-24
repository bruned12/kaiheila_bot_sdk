package top.bruned.kaiheila.sdk.httpapi;

import top.bruned.kaiheila.sdk.httpapi.result.channel_role_index.Channel_role_index;
import top.bruned.kaiheila.sdk.httpapi.result.gateway_index.Gateway_index;
import top.bruned.kaiheila.sdk.httpapi.result.guild_list.Guild_list;
import top.bruned.kaiheila.sdk.httpapi.result.guild_mute_list.Guild_mute_list;
import top.bruned.kaiheila.sdk.httpapi.result.guild_user_list.Guild_user_list;
import top.bruned.kaiheila.sdk.httpapi.result.message_create.Message_create;
import top.bruned.kaiheila.sdk.util.http.Sendhttp;
import top.bruned.kaiheila.sdk.util.util;

public class api {
    private final Sendhttp http;

    public api(Sendhttp http){
        this.http = http;
    }


    //服务器相关接口
    public static final String API_guild_list = "/api/v3/guild/list";
    public Guild_list getGuild_list(){
        return http.getHttp(API_guild_list).toJavaObject(Guild_list.class);
    }

    public static final String API_guild_user_list = "/api/v3/guild/user-list";
    public Guild_user_list getGuild_user_list(String guild_id){
        return http.getHttp(String.format(API_guild_user_list+"?guild_id=%s",guild_id)).toJavaObject(Guild_user_list.class);
    }

    public static final String API_guild_nickname = "/api/v3/guild/nickname";
    public void Guild_user_nickname(String guild_id,String nickname,String user_id){
        String str = "{\"guild_id\":\"%s\",\"nickname\":\"%s\",\"user_id\":\"%s\"}";
        http.postHttp(API_guild_nickname ,String.format(str, guild_id,nickname,user_id));
    }

    public static final String API_guild_leave = "/api/v3/guild/leave";
    public void Guild_leave(String guild_id){
        String str = "{\"guild_id\":\"%s\"}";
        http.postHttp(API_guild_leave, String.format(str, guild_id));

    }

    public static final String API_guild_kickout = "/api/v3/guild/kickout";
    public void Guild_user_kickout(String guild_id,String target_id){
        String str ="{\"guild_id\":\"%s\",\"target_id\":\"%s\"}";
        http.postHttp(API_guild_kickout, String.format(str, guild_id,target_id));
    }

    public static final String API_guild_mute_list = "/api/v3/guild-mute/list";
    public Guild_mute_list getGuild_mute_list(String guild_id){
        return new Guild_mute_list(http.getHttp(String.format(API_guild_mute_list+"?guild_id=%s",guild_id)));
    }

    public static final String API_guild_mute_create = "/api/v3/guild-mute/create";
    public void Guild_mute_create(String guild_id,String user_id,String type){
        String str = "{\"guild\":\"%s\",\"user_id:\"%s\",\"type\":\"%s\"}";
        http.postHttp(API_guild_mute_create,String.format(str, guild_id,user_id,type));
    }

    public static final String API_guild_mute_delete = "/api/v3/guild-mute/delete";
    public void Guild_mute_delete(String guild_id,String user_id,String type){
        String str = "{\"guild\":\"%s\",\"user_id:\"%s\",\"type\":\"%s\"}";
        http.postHttp(API_guild_mute_delete,String.format(str, guild_id,user_id,type));
    }





    //频道相关接口
    public static final String API_channel_role_index = "/api/v3/channel-role/index";
    public Channel_role_index getChannel_role_index(String channel_id){
        return http.getHttp(String.format(API_channel_role_index+"?channel_id=%s",channel_id)).toJavaObject(Channel_role_index.class);
    }
    public static final String API_channel_role_create = "/api/v3/channel-role/create";
    public static final String API_channel_role_update = "/api/v3/channel-role/update";
    public static final String API_channel_role_delete = "/api/v3/channel-role/delete";






    //频道消息相关接口
    public static final String API_message_list = "/api/v3/message/list";

    public static final String API_message_create = "/api/v3/message/create";
    public Message_create Message_create(String target_id, String content){
        String str = "{\"target_id\":\"%s\",\"content\":\"%s\",\"nonce\":\"%s\"}";
        String nonce = util.createRandomStr(8);
        return http.postHttp(API_message_create, String.format(str, target_id,content,nonce)).toJavaObject(Message_create.class);
    }
    public Message_create Message_create(int type,String target_id, String content){
        String str = "{\"target_id\":\"%s\",\"content\":\"%s\",\"nonce\":\"%s\",\"type\":\"%d\"}";
        String nonce = util.createRandomStr(8);
        return http.postHttp(API_message_create, String.format(str, target_id,content,nonce,type)).toJavaObject(Message_create.class);
    }
    public Message_create Message_create_temp(int type,String target_id, String content,String temp_target_id){
        String str = "{\"target_id\":\"%s\",\"content\":\"%s\",\"nonce\":\"%s\",\"type\":\"%d\",\"temp_target_id\":\"%s\"}";
        String nonce = util.createRandomStr(8);
        return http.postHttp(API_message_create, String.format(str, target_id,content,nonce,type,temp_target_id)).toJavaObject(Message_create.class);
    }
    public Message_create Message_create_quote(int type,String target_id, String content,String quote){
        String str = "{\"target_id\":\"%s\",\"content\":\"%s\",\"nonce\":\"%s\",\"type\":\"%d\",\"quote\":\"%s\"}";
        String nonce = util.createRandomStr(8);
        return http.postHttp(API_message_create, String.format(str, target_id,content,nonce,type,quote)).toJavaObject(Message_create.class);
    }
    public Message_create Message_create_quote_temp(int type,String target_id, String content,String quote,String temp_target_id){
        String str = "{\"target_id\":\"%s\",\"content\":\"%s\",\"nonce\":\"%s\",\"type\":\"%d\",\"quote\":\"%s\",\"temp_target_id\":\"%s\"}";
        String nonce = util.createRandomStr(8);
        return http.postHttp(API_message_create, String.format(str, target_id,content,nonce,type,quote,temp_target_id)).toJavaObject(Message_create.class);
    }

    public static final String API_message_update = "/api/v3/message/update";
    public static final String API_message_delete = "/api/v3/message/delete";
    public static final String API_message_reaction_list = "/api/v3/message/reaction-list";
    public static final String API_message_add_reaction = "/api/v3/message/add-reaction";
    public static final String API_message_delete_reaction = "/api/v3/message/delete-reaction";





    //私信聊天会话接口
    public static final String API_user_chat_index = "/api/v3/user-chat/index";
    public static final String API_user_chat_view = "/api/v3/user-chat/view";
    public static final String API_user_chat_create = "/api/v3/user-chat/create";
    public static final String API_user_chat_delete = "/api/v3/user-chat/delete";




    //用户私聊消息接口
    public static final String API_direct_message_list = "/api/v3/direct-message/list";
    public static final String API_direct_message_create = "/api/v3/direct-message/create";
    public static final String API_direct_message_update = "/api/v3/direct-message/update";
    public static final String API_direct_message_delete = "/api/v3/direct-message/delete";
    public static final String API_direct_message_reaction_list = "/api/v3/direct-message/reaction-list";
    public static final String API_direct_message_add_reaction = "/api/v3/direct-message/add-reaction";
    public static final String API_direct_message_delete_reaction = "/api/v3/direct-message/delete_reaction";




    //Gateway相关接口
    public static final String API_gateway_index = "/api/v3/gateway/index";
    public Gateway_index getGateway_index(int compress){
        return http.getHttp(String.format(API_gateway_index+"?compress=%d",compress)).toJavaObject(Gateway_index.class);
    }





    //用户相关接口
    public static final String API_user_me = "/api/v3/user/me";




    //媒体模块相关接口
    public static final String API_asset_create = "/api/v3/asset/create";





    //服务器角色权限相关接口
    public static final String API_guild_role_index = "/api/v3/guild-role/index";
    public static final String API_guild_role_create = "/api/v3/guild-role/create";
    public static final String API_guild_role_update = "/api/v3/guild-role/update";
    public static final String API_guild_role_delete= "/api/v3/guild-role/delete";
    public static final String API_guild_role_grant = "/api/v3/guild-role/grant";
    public static final String API_guild_role_revoke = "/api/v3/guild-role/revoke";





    //亲密度相关接口
    public static final String API_intimacy_index = "/api/v3/intimacy/index";
    public static final String API_intimacy_update = "/api/v3/intimacy/update";





    //服务器表情相关接口
    public static final String API_guild_emoji_index = "/api/v3/guild-emoji/index";
    public static final String API_guild_emoji_create = "/api/v3/guild-emoji/create";
    public static final String API_guild_emoji_update = "/api/v3/guild-emoji/update";
    public static final String API_guild_emoji_delete = "/api/v3/guild-emoji/delete";





}
