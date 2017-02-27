package org.weweb.dubbo;

/**
 * Created by wshen on 2017/2/27.
 */
public class MyServiceImpl implements MyService{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
