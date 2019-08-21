/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod;

/**
 * @author Zen
 * @version 1.0: FactoryMethodTVMain.java, v 0.1 2019/08/21 17:35 Zen Exp $
 */
public class FactoryMethodTVMain {
    public static void main(String[] args) {
        TV tv;
        TVFactory factory;
        factory = new HaierTVFactory();
        factory.productTV();
    }
}