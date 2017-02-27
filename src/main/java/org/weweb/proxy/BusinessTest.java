package org.weweb.proxy;

import org.weweb.dubbo.BusinessInterface;

/**
 * Created by wshen on 2017/2/27.
 */
public class BusinessTest {
    public static void main(String[] args) {
        RealBusinessImpl realBusiness=new RealBusinessImpl();
        BusinessInterface proxyBusinessInterface=new ProxyBusinessImpl(realBusiness);
        proxyBusinessInterface.doSomething("zhang");
    }
}
