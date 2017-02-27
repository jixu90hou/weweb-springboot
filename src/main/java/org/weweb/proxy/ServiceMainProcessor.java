package org.weweb.proxy;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wshen on 2017/2/27.
 */
public class ServiceMainProcessor {
    static {
        BasicConfigurator.configure();
    }
    private static Object WAITOBJECT=new Object();

    public static void main(String[] args)  {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
        System.err.println("===============================================");
        /*
         * 这里锁定这个应用程序，和DUBBO框架本身的工作原理没有任何关系，只是为了让其不退出
         * 当然您也可以使用ClassPathXmlApplicationContext中的start方法，效果一样。
         * */
        synchronized (ServiceMainProcessor.WAITOBJECT){
            try {
                ServiceMainProcessor.WAITOBJECT.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
