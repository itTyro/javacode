package runtime;

import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());//获得cpu线程数
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 /1024);//获取虚拟机最大可以获得多少字节(byte)
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);//虚拟机现在已经获取的内存大小(byte)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 /1024);//剩余内存

        //运行cmd命令
        //shutdown: 关机
        //加上参数才能执行
        //-s: 默认在一分钟后关机
        //-s -t指定时间: 指定关机时间:shutdown -s -t 3600 一小时后关机
        //-a: 取消关机操作
        //-r: 关机并重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
