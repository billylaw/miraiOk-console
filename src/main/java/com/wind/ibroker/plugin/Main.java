package com.wind.ibroker.plugin;

import net.mamoe.mirai.console.plugins.PluginBase;
import net.mamoe.mirai.message.FriendMessageEvent;

class Main extends PluginBase {

    public void onLoad() {

    }

    public void onEnable() {
        this.getEventListener().subscribeAlways(FriendMessageEvent.class, (FriendMessageEvent event) -> {
            event.getSubject().sendMessage("喵");
        });
    }

}