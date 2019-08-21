/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod;

/**
 * @author Zen
 * @version 1.0: HisenseTVFactory.java, v 0.1 2019/08/21 17:39 Zen Exp $
 */
public class HisenseTVFactory implements TVFactory {
    @Override
    public TV productTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }
}