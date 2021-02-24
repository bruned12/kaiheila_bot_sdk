/**
  * Copyright 2021 bejson.com 
  */
package top.bruned.kaiheila.sdk.httpapi.result.guild_user_list;
import java.util.List;

/**
 * Auto-generated: 2021-02-21 17:15:48
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Items {

    private boolean is_master;
    private String id;
    private String username;
    private String identify_num;
    private String avatar;
    private boolean mobile_verified;
    private boolean online;
    private String nickname;
    private long joined_at;
    private long active_time;
    private List<Long> roles;
    private String abbr;
    private String os;
    private Music music;
    private Game game;
    private Hoist_info hoist_info;
    private long color;
    public void setIs_master(boolean is_master) {
         this.is_master = is_master;
     }
     public boolean getIs_master() {
         return is_master;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setUsername(String username) {
         this.username = username;
     }
     public String getUsername() {
         return username;
     }

    public void setIdentify_num(String identify_num) {
         this.identify_num = identify_num;
     }
     public String getIdentify_num() {
         return identify_num;
     }

    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

    public void setMobile_verified(boolean mobile_verified) {
         this.mobile_verified = mobile_verified;
     }
     public boolean getMobile_verified() {
         return mobile_verified;
     }

    public void setOnline(boolean online) {
         this.online = online;
     }
     public boolean getOnline() {
         return online;
     }

    public void setNickname(String nickname) {
         this.nickname = nickname;
     }
     public String getNickname() {
         return nickname;
     }

    public void setJoined_at(long joined_at) {
         this.joined_at = joined_at;
     }
     public long getJoined_at() {
         return joined_at;
     }

    public void setActive_time(long active_time) {
         this.active_time = active_time;
     }
     public long getActive_time() {
         return active_time;
     }

    public void setRoles(List<Long> roles) {
         this.roles = roles;
     }
     public List<Long> getRoles() {
         return roles;
     }

    public void setAbbr(String abbr) {
         this.abbr = abbr;
     }
     public String getAbbr() {
         return abbr;
     }

    public void setOs(String os) {
         this.os = os;
     }
     public String getOs() {
         return os;
     }

    public void setMusic(Music music) {
         this.music = music;
     }
     public Music getMusic() {
         return music;
     }

    public void setGame(Game game) {
         this.game = game;
     }
     public Game getGame() {
         return game;
     }

    public void setHoist_info(Hoist_info hoist_info) {
         this.hoist_info = hoist_info;
     }
     public Hoist_info getHoist_info() {
         return hoist_info;
     }

    public void setColor(long color) {
         this.color = color;
     }
     public long getColor() {
         return color;
     }

}