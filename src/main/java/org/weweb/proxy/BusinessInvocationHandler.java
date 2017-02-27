package org.weweb.proxy;

import org.weweb.dubbo.BusinessInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wshen on 2017/2/27.
 */
public class BusinessInvocationHandler implements InvocationHandler {
    private BusinessInterface realBusiness;

    public BusinessInvocationHandler(BusinessInterface realBusiness) {
        this.realBusiness = realBusiness;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("=================调用处理器被激活=======================");
        System.out.println("代理对象："+proxy.getClass().getName());
        System.out.println("外部模块/外部系统调用方法名："+method.getName());
        System.out.println("----------------正式执行前-----------------");
        Object resultObject=method.invoke(this,realBusiness,args);
        System.out.println("----------------正式执行后-----------------");
        return resultObject;
    }
}
