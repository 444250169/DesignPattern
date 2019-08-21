/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: Adiministrator.java, v 0.1 2019/08/21 15:35 Zen Exp $
 */
public class Administrator extends User{
    public Administrator() {
        System.out.println("创建管理员");
    }
    @Override
    public void diffOperation() {
        System.out.println("管理员可以踢人！");
    }
}