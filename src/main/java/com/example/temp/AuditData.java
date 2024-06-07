package com.example.temp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuditData {
    @JsonProperty("Channel")
    String channel;

    @JsonProperty("ChannelIp")
    String channelIp;

    @JsonProperty("ChannelUser")
    String channelUser;

    @JsonProperty("ChannelUserBranch")
    String channelUserBranch;

    @JsonProperty("ChannelTime")
    String channelTime;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelIp() {
        return channelIp;
    }

    public void setChannelIp(String channelIp) {
        this.channelIp = channelIp;
    }

    public String getChannelUser() {
        return channelUser;
    }

    public void setChannelUser(String channelUser) {
        this.channelUser = channelUser;
    }

    public String getChannelUserBranch() {
        return channelUserBranch;
    }

    public void setChannelUserBranch(String channelUserBranch) {
        this.channelUserBranch = channelUserBranch;
    }

    public String getChannelTime() {
        return channelTime;
    }

    public void setChannelTime(String channelTime) {
        this.channelTime = channelTime;
    }
}
