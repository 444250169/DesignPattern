/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod;

/**
 * @author Zen
 * @version 1.0: HaierTV.java, v 0.1 2019/08/21 17:32 Zen Exp $
 */
public class HaierTV implements TV {
    @Override
    public void play() {
        System.out.println("海尔电视播放中");
    }
}