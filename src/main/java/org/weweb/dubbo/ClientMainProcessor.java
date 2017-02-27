package org.weweb.dubbo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wshen on 2017/2/27.
 */
public class ClientMainProcessor {
    static {
        BasicConfigurator.configure();
    }
    private static Object WAITOBJECT = new Object();

    private static final Log LOGGER = LogFactory.getLog(ClientMainProcessor.class);
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"spring-client.xml"});
        MyService myService= (MyService) app.getBean("myService");
        LOGGER.info("myService="+myService.add(123,345));
        synchronized (ClientMainProcessor.WAITOBJECT){
            ClientMainProcessor.WAITOBJECT.wait();
        }
    }
}
