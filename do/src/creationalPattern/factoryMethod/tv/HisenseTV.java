/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.tv;

/**
 * @author Zen
 * @version 1.0: HisenseTV.java, v 0.1 2019/08/21 17:33 Zen Exp $
 */
public class HisenseTV implements TV {
    @Override
    public void play() {
        System.out.println("海信电视播放中");
    }
}