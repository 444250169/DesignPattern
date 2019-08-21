/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod;

/**
 * @author Zen
 * @version 1.0: HaierTVFactory.java, v 0.1 2019/08/21 17:38 Zen Exp $
 */
public class HaierTVFactory implements TVFactory{
    @Override
    public TV productTV() {
        System.out.println("海尔电视机工厂生产海尔电视机。");
        return new HaierTV();
    }
}