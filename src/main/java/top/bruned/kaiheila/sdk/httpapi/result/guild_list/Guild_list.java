/**
  * Copyright 2021 bejson.com 
  */
package top.bruned.kaiheila.sdk.httpapi.result.guild_list;
import java.util.List;

/**
 * Auto-generated: 2021-02-21 16:36:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Guild_list {

    private List<Items> items;
    private Meta meta;
    private Sort sort;
    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

    public void setMeta(Meta meta) {
         this.meta = meta;
     }
     public Meta getMeta() {
         return meta;
     }

    public void setSort(Sort sort) {
         this.sort = sort;
     }
     public Sort getSort() {
         return sort;
     }

}