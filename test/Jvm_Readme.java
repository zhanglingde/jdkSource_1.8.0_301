import java.net.URLClassLoader;

/**
 * @author zhangling
 * @date 2022/5/30 5:55 下午
 */
public class Jvm_Readme {

    /**
     * 内存结构
     * 栈：
     * <ul>
     *     <li> 栈帧：{@link com.ling.jvm.class01.stack.Stack_Demo01}</li>
     *     <li> 栈内存溢出：{@link com.ling.jvm.class01.stack.Stack_Demo02}</li>
     *     <li> 死锁：{@link com.ling.jvm.class01.stack.Stack_Demo03}</li>
     * </ul>
     * 堆：
     * <ul>
     *     <li> 堆内存溢出：{@link com.ling.jvm.class01.heap.Demo01} </li>
     *     <li> 堆内存变化：{@link com.ling.jvm.class01.heap.Demo02} </li>
     *     <li> 查看堆中对象个数：{@link com.ling.jvm.class01.heap.Demo03} </li>
     * </ul>
     * 方法区：
     * <ul>
     *     <li> 元空间内存溢出：{@link com.ling.jvm.class01.methodarea.Demo01} </li>
     *     <li> StringTable 底层结构：{@link com.ling.jvm.class01.methodarea.Demo02} </li>
     *     <li> 将字符串放入字符串常量池：{@link com.ling.jvm.class01.methodarea.Demo03} </li>
     *     <li> StringTable 的位置：{@link com.ling.jvm.class01.methodarea.Demo04} </li>
     *     <li> StringTable 垃圾回收：{@link com.ling.jvm.class01.methodarea.Demo05} </li>
     *     <li> 字符串池性能：{@link com.ling.jvm.class01.methodarea.Demo06} </li>
     * </ul>
     * 直接内存：
     * <ul>
     *     <li> 使用 ByteBuffer 演示直接内存读取效率：{@link com.ling.jvm.class01.directmemory.Demo01} </li>
     *     <li> 直接内存溢出：{@link com.ling.jvm.class01.directmemory.Demo02} </li>
     *     <li> Unsafe 分配释放直接内存：{@link com.ling.jvm.class01.directmemory.Demo03} </li>
     *     <li> 禁用显示回收：{@link com.ling.jvm.class01.directmemory.Demo04} </li>
     * </ul>
     */
    void memory(){}

    /**
     * 垃圾回收
     * <ul>
     *     <li> GC Roots 根对象：{@link com.ling.jvm.class02.Demo01} </li>
     *     <li> 软引用：{@link com.ling.jvm.class02.Demo02} </li>
     *     <li> 软引用配合引用队列使用：{@link com.ling.jvm.class02.Demo03} </li>
     *     <li> 弱引用：{@link com.ling.jvm.class02.Demo04} </li>
     *     <li> 分代垃圾回收：{@link com.ling.jvm.class02.Demo08} </li>
     *     <li> 大对象直接晋升老年代：{@link com.ling.jvm.class02.Demo09} </li>
     * </ul>
     */
    void gc(){}


    /**
     * 类加载器层级            {@link com.ling.jvm.classloader.T002_ClassLoaderLevel}
     * <ul>
     *     <li> {@link sun.misc.Launcher.AppClassLoader}</li>
     *     <li> {@link URLClassLoader}</li>
     *     <li> {@link sun.misc.Launcher.ExtClassLoader}</li>
     * </ul>
     * 类加载器范围            {@link T003_ClassLoaderScope}
     * 父加载器的概念          {@link T004_ParentAndChild}
     * classLoader 源码      {@link T005_LoadClassByHand}
     * 自定义类加载器          {@link T006_MyClassLoader}
     * 自定义ClassLoader加载加密的class         {@link T007_MyClassLoaderWithEncription}
     * 懒加载                  {@link T008_LazyLoading}
     * JIT 即时编译器           {@link T009_WayToRun}
     * 自定义类加载器指定父加载器  {@link T010_Parent}
     */
    void classloader(){}
}
