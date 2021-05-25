package top.bruned.kaiheila.sdk.bot.api.message_create;

import java.math.BigInteger;

public class rec_message_create {
    public String msg_id;
    public BigInteger msg_timestamp;
    public String nonce;

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public void setMsg_timestamp(BigInteger msg_timestamp) {
        this.msg_timestamp = msg_timestamp;
    }
}
