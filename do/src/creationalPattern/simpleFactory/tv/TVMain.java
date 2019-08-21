/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.tv;

/**
 * @author Zen
 * @version 1.0: TVmain.java, v 0.1 2019/08/21 15:08 Zen Exp $
 */
public class TVMain {
    public static void main(String[] args) {
        HaierTV h = (HaierTV) TVFactory.productTV("Haier");
        h.play();
    }
}