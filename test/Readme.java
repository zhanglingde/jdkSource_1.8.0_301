import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangling
 * @date 2022/1/13 4:34 下午
 */
public class Readme {

    /**
     * 代理模式
     * <ol>
     *     <li> {@link com.ling.proxy.Test}  </li>
     *     <li> 创建代理对象： {@link com.ling.proxy.CalculatorProxy } </li>
     *     <li> {@link Proxy#newProxyInstance(ClassLoader, Class[], InvocationHandler)} </li>
     *     <li> 生成接口的代理类的字节码文件：{@link Proxy#getProxyClass0(ClassLoader, Class[])} </li>
     *     <li> {@link java.lang.reflect.WeakCache#get(Object, Object)} </li>
     *     <li> {@link WeakCache.Factory#get()}  } </li>
     *     <li> {@link java.lang.reflect.Proxy.ProxyClassFactory#apply(ClassLoader, Class[])}</li>
     *     <li> {@link ProxyGenerator#generateProxyClass(String, Class[], int)} </li>
     * </ol>
     */
    void proxy(){}
}
