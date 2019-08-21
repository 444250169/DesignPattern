/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: GrantMain.java, v 0.1 2019/08/21 15:44 Zen Exp $
 */
public class GrantMain {
    public static void main(String[] args) {
        Employee e = (Employee) UserFactory.getUser(0);
    }
}