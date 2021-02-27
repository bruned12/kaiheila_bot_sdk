package top.bruned.kaiheila.sdk.wsclient.result.event.AddedReactionEvent;

import top.bruned.kaiheila.sdk.wsclient.result.event.base.Emoji;

public class Body {


        private String channel_id;
        private Emoji emoji;
        private String user_id;
        private String msg_id;
        public void setChannel_id(String channel_id) {
            this.channel_id = channel_id;
        }
        public String getChannel_id() {
            return channel_id;
        }

        public void setEmoji(Emoji emoji) {
            this.emoji = emoji;
        }
        public Emoji getEmoji() {
            return emoji;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }
        public String getUser_id() {
            return user_id;
        }

        public void setMsg_id(String msg_id) {
            this.msg_id = msg_id;
        }
        public String getMsg_id() {
            return msg_id;
        }

    }
