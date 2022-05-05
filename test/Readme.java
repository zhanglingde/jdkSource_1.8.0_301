import com.ling.juc.lock.CountDownLatchTest;
import com.ling.juc.lock.ReentrantLockTest;
import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.ling.juc.threadPool.FixedThreadPoolDemo;
import com.ling.juc.threadPool.CachedThreadPoolDemo;
import com.ling.juc.threadPool.newSingleThreadExecutorDemo;

import com.ling.juc.lock.ReentrantLock_ReEnter;
import com.ling.juc.lock.ReentrantLock_Condition;
import com.ling.juc.lock.ReentrantLock_Interrupt;
import com.ling.juc.lock.ReentrantLock_tryLock;
import com.ling.juc.lock.ReentrantLock_FairAndNoFair;
import com.ling.juc.lock.ReadWriteLockTest;
import com.ling.juc.lock.CyclicBarrierTest;
import com.ling.juc.lock.StampedLockTest;
import com.ling.juc.lock.SemaphoreTest;
import com.ling.juc.lock.AQSTest;
import com.ling.juc.lock.LockSupport_Test;


import com.ling.juc.demo03_thread.Demo03_Join;
import com.ling.juc.demo03_thread.Demo04_interrupt_sleep;
import com.ling.juc.demo03_thread.Demo04_interrupt_park;
import com.ling.juc.demo03_thread.Demo05_Daemon;
import com.ling.juc.demo03_thread.Demo06_ThreadState;
import com.ling.juc.demo03_thread.Demo04_TwoPhaseTermination;

/**
 * @author zhangling
 * @date 2022/1/13 4:34 下午
 */
public class Readme {

    /**
     * 集合相关
     * <ul>
     *     <li> ArrayList 源码： {@link com.ling.hashmap.ArrayListTest} </li>
     *     <li> HashMap 源码： {@link com.ling.hashmap.HashMapTest} </li>
     * </ul>
     */
    void list() {
    }

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
    void proxy() {
    }

    /**
     * 线程：
     * <ol>
     *     <li> join：{@link Demo03_Join} </li>
     *     <li> interrupt 打断正常运行的线程：{@link Demo04_interrupt_sleep} </li>
     *     <li> interrupt 打断 park 线程：{@link Demo04_interrupt_park} </li>
     *     <li> 两阶段终止模式：{@link Demo04_TwoPhaseTermination} </li>
     *     <li> 守护线程：{@link Demo05_Daemon} </li>
     *     <li> 线程状态：{@link Demo06_ThreadState} </li>
     * </ol>
     *
     * juc 同步锁
     * <ul>
     *     <li> AQS：{@link AQSTest} </li>
     *     <li> ReentrantLock：{@link ReentrantLockTest} </li>
     *     <ol>
     *         <li> 可重入： {@link ReentrantLock_ReEnter} </li>
     *         <li> 可打断： {@link ReentrantLock_Interrupt} </li>
     *         <li> 锁超时 tryLock：{@link ReentrantLock_tryLock } </li>
     *         <li> 公平锁与非公平锁： {@link ReentrantLock_FairAndNoFair } </li>
     *         <li> 条件变量： {@link ReentrantLock_Condition} </li>
     *     </ol>
     *     <li> LockSupport：{@link LockSupport_Test} </li>
     *     <li> 门闩阻塞线程 - CountDownLatch：{@link CountDownLatchTest} </li>
     *     <li> 读写锁 - ReadWriteLock：{@link ReadWriteLockTest} </li>
     *     <li> 特殊的读写锁 - StampedLock：{@link StampedLockTest} </li>
     *     <li> 栅栏 - CyclicBarrier：{@link CyclicBarrierTest} </li>
     *     <li> 信号量(最多几个线程并行（限流）) - Semaphore：{@link SemaphoreTest} </li>
     * </ul>
     */
    void jucSyncLock() {
    }

    /**
     * 线程池
     * <ul>
     *     <li> 固定大小线程池 - newFixedThreadPool: {@link FixedThreadPoolDemo}  </li>
     *     <li> 带缓冲线程池 - newCachedThreadPool: {@link CachedThreadPoolDemo}  </li>
     *     <li> 单线程线程池 - newSingleThreadExecutor: {@link newSingleThreadExecutorDemo}  </li>
     * </ul>
     * <p>
     * 扩展线程池-定时任务线程池：
     * <ul>
     *     <li> Timer（已过时） {@link com.ling.juc.threadPool.TestTimer} </li>
     *     <li> newScheduledThreadPool（定时任务线程池）： {@link com.ling.juc.threadPool.newScheduledThreadPoolDemo} </li>
     * </ul>
     * <p>
     * 线程池异常处理：{@link com.ling.juc.threadPool.ThreadPool_Exception}
     */
    void threadPool() {
    }

    /**
     * jvm 相关
     * <ol>
     *     <li> 类加载器加载类：{@link com.ling.jvm.ClassLoaderTest} </li>
     *     <li> 类加载器分类：{@link com.ling.jvm.T002_ClassLoaderLevel} </li>
     * </ol>
     */
    void jvm() {
    }
}
