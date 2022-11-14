package cn.pamalee.nucleus.simpleplugin;


import cn.devspace.nucleus.Manager.Command.CommandBase;
import cn.devspace.nucleus.Manager.Command.CommandManager;
import cn.devspace.nucleus.Manager.RouteManager;
import cn.devspace.nucleus.Plugin.PluginBase;
import cn.pamalee.nucleus.simpleplugin.test.route;

public class main extends PluginBase implements CommandBase {
    @Override
    public void onLoad() {
        CommandManager.registerCommand(new route());
        RouteManager.registerRouter("SP", route.class);
        sendLog("Plugin 启动完成啦！！");
        new ex();
    }
}
