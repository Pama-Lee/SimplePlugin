package cn.pamalee.nucleus.simpleplugin.test;

import cn.devspace.nucleus.Manager.Annotation.Commands;
import cn.devspace.nucleus.Manager.Annotation.Router;
import cn.devspace.nucleus.Manager.Command.CommandBase;

public class route implements CommandBase {

    @Router("hello")
    public String hello(){
        System.out.println("hello World!");
        return "Hello World!";
    }

    @Commands(Command = "plugins")
    public void command(String[] args){
        System.out.println("命令测试成功!");
    }

}
