package personal.nathan.intercepters;


import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;

import java.util.Properties;

/**
 * Created by za-zhangwei002 on 2019/2/19.
 */
public class SimpleInterceptor implements Interceptor {

    private String name;

    public SimpleInterceptor(String name) {
        this.name = name;
    }

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("前置处理： " + name);
        Object result = invocation.proceed();
        System.out.println("后置处理： " + name);
        return result;
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
