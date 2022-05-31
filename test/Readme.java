import com.ling.juc.lock.CountDownLatchTest;
import com.ling.juc.lock.ReentrantLockTest;
import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.ling.juc.threadPool.FixedThreadPoolDemo;
import com.ling.juc.threadPool.CachedThreadPoolDemo;
import com.ling.juc.threadPool.newSingleThreadExecutorDemo;

import com.ling.juc.demo04.Wait_notify_Test;
import com.ling.juc.demo04.Producer_Consumer;
import com.ling.juc.demo04.DeadLock_Test01;
import com.ling.juc.demo04.DeadLock_Philosopher;
import com.ling.juc.demo04.AliveLock_Test;

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
 *
 * 依赖：
 *      ch.qos.logback:logback-classic:1.2.3
 *      org.projectlombok:lombok:1.18.10
 * @author zhangling
 *
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
     * 线程：
     * <ol>
     *     <li> join：{@link Demo03_Join} </li>
     *     <li> interrupt 打断正常运行的线程：{@link Demo04_interrupt_sleep} </li>
     *     <li> interrupt 打断 park 线程：{@link Demo04_interrupt_park} </li>
     *     <li> 两阶段终止模式：{@link Demo04_TwoPhaseTermination} </li>
     *     <li> 守护线程：{@link Demo05_Daemon} </li>
     *     <li> 线程状态：{@link Demo06_ThreadState} </li>
     * </ol>
     * <p>
     * wait - notify ：{@link Wait_notify_Test}
     * 生产者 - 消费者模式：{@link Producer_Consumer }
     * 测试死锁：{@link DeadLock_Test01}
     * 测试死锁 - 哲学家问题：{@link DeadLock_Philosopher}
     * 测试活锁：{@link AliveLock_Test}
     * <p>
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
     * 无锁线程安全
     *
     * <ul>
     *     <li> CAS：{@link com.ling.juc.nolock.Demo02_BigDecimalAccount} </li>
     *     <li> CAS 存在 ABA 问题：{@link com.ling.juc.nolock.Demo03_ABA} </li>
     *     <li> AtomicStampedReference 解决 ABA 问题：{@link com.ling.juc.nolock.Demo03_AtomicStampedReference} </li>
     *     <li> 原子数组：{@link com.ling.juc.nolock.Demo04_AtomicArray} </li>
     *     <li> 字段更新器，更新对象中的字段，保证线程安全：{@link com.ling.juc.nolock.Demo05_AtomicReferenceField} </li>
     *     <li> LongAddr、AtomicLong 累加操作效率：{@link com.ling.juc.nolock.Demo06_LongAddr_AtomicLong} </li>
     *
     *     <li> 获取 Unsafe 对象：{@link com.ling.juc.nolock.UnsafeAccessor} </li>
     *     <li> Unsafe CAS 操作：{@link com.ling.juc.nolock.TestUnsafe} </li>
     *     <li> Unsafe CAS 实现 Account 扣减余额：{@link com.ling.juc.nolock.TestUnsafe_Account} </li>
     * </ul>
     */
    void noLock() {
    }

    /**
     * 控制线程顺序
     * <ol>
     *     <li> wait-notify：{@link com.ling.juc.threadsort.Demo10} </li>
     *     <li> LockSupport：{@link com.ling.juc.threadsort.Demo10_2} </li>
     * </ol>
     */
    void threadSort() {
    }

    /**
     * 线程模式：
     * <ol>
     *     <li> 保护性暂停：{@link com.ling.juc.module.GuardedObject} </li>
     * </ol>
     */
    void threadModule() {
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
     * 模板方法：{@link ReentrantLockTest}
     * 装饰者：{@link com.ling.io.BufferedInputStreamDemo}
     *
     * 命令模式：{@link }
     */
    void test() {
    }
}
