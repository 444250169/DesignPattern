/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.tv;

/**
 * @author Zen
 * @version 1.0: HaierTV.java, v 0.1 2019/08/21 14:57 Zen Exp $
 */
public class HaierTV implements TV{
    @Override
    public void play() {
        System.out.println("生产海尔电视了");
    }
}