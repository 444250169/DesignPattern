/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.tv;

/**
 * @author Zen
 * @version 1.0: HisenseTV.java, v 0.1 2019/08/21 14:57 Zen Exp $
 */
public class HisenseTV implements TV{
    @Override
    public void play() {
        System.out.println("生产海信电视了");
    }
}