/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: Manager.java, v 0.1 2019/08/21 15:35 Zen Exp $
 */
public class Manager extends User{
    Manager(){
        System.out.println("��������");
    }

    @Override
    public void diffOperation() {
        System.out.println("���Ǿ����Ұ���");
    }
}