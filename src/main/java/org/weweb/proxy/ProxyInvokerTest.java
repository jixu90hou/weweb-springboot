package org.weweb.proxy;

import org.weweb.dubbo.BusinessInterface;

import java.lang.reflect.Proxy;

/**
 * Created by wshen on 2017/2/27.
 */
public class ProxyInvokerTest {
	public static void main(String[] args) {
		BusinessInterface realBusiness = new RealBusinessImpl();
		BusinessInvocationHandler invocationHandler = new BusinessInvocationHandler(realBusiness);
		BusinessInterface proxyBusiness = (BusinessInterface) Proxy.newProxyInstance(
				Thread.currentThread().getContextClassLoader(), new Class[] { BusinessInterface.class },
				invocationHandler);
		proxyBusiness.doSomething("zhangdaming");
	}
}
