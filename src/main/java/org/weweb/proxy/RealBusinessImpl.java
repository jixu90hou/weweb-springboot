package org.weweb.proxy;

import org.weweb.dubbo.BusinessInterface;

/**
 * Created by wshen on 2017/2/27.
 */
public class RealBusinessImpl implements BusinessInterface {
    @Override
    public void doSomething(String username) {
        System.out.println(username+"处理业务");
    }
}
