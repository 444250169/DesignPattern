package creationalPattern.simpleFactory.tv;

/**
 * @author Zen
 * @version 1.0: tv.java, v 0.1 2019/08/21 14:56 Zen Exp $
 */
public interface TV {
    /**
     * 其实这里是最好创建一个类的。因为这里对应的是产品的抽象，但是接口是对功能的抽象。所以这里最好是写一个类。
     * 一定要被重写的方法就用abstract去定义抽象方法，自己的方法就普通形式就行了。
     */
    public void play();
}
