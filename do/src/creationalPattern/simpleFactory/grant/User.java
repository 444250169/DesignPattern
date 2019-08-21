/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: User.java, v 0.1 2019/08/21 15:34 Zen Exp $
 */
public abstract class User {
    public void sameOperation()
    {
        System.out.println("修改个人资料！");
    }
    public abstract void diffOperation();
}