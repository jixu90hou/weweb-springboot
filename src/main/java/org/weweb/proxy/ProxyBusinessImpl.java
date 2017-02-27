package org.weweb.proxy;

import org.weweb.dubbo.BusinessInterface;

/**
 * Created by wshen on 2017/2/27.
 */
public class ProxyBusinessImpl implements BusinessInterface {
    private RealBusinessImpl realBusiness;

    public ProxyBusinessImpl(RealBusinessImpl realBusiness) {
        this.realBusiness = realBusiness;
    }

    @Override
    public void doSomething(String username) {
        System.out.println("=============开始执行业务===============");
        this.realBusiness.doSomething(username);
        System.out.println("=============完成执行业务===============");

    }
}
