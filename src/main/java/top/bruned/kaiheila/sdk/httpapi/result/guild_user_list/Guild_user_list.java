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
public class Guild_user_list {

    private List<Items> items;
    private int user_count;
    private int online_count;
    private int offline_count;
    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

    public void setUser_count(int user_count) {
         this.user_count = user_count;
     }
     public int getUser_count() {
         return user_count;
     }

    public void setOnline_count(int online_count) {
         this.online_count = online_count;
     }
     public int getOnline_count() {
         return online_count;
     }

    public void setOffline_count(int offline_count) {
         this.offline_count = offline_count;
     }
     public int getOffline_count() {
         return offline_count;
     }

}