package top.bruned.kaiheila.sdk.httpapi.result.channel_role_index;

import java.util.List;

/**
 * Auto-generated: 2021-02-22 2:14:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Channel_role_index {

    private List<Permission_overwrites> permission_overwrites;
    private List<String> permission_users;
    private int permission_sync;
    public void setPermission_overwrites(List<Permission_overwrites> permission_overwrites) {
         this.permission_overwrites = permission_overwrites;
     }
     public List<Permission_overwrites> getPermission_overwrites() {
         return permission_overwrites;
     }

    public void setPermission_users(List<String> permission_users) {
         this.permission_users = permission_users;
     }
     public List<String> getPermission_users() {
         return permission_users;
     }

    public void setPermission_sync(int permission_sync) {
         this.permission_sync = permission_sync;
     }
     public int getPermission_sync() {
         return permission_sync;
     }

}