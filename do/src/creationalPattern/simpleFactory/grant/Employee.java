/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: Employee.java, v 0.1 2019/08/21 15:34 Zen Exp $
 */
public class Employee extends User{
    public Employee(){
        System.out.println("����ְԱ");
    }
    @Override
    public void diffOperation() {
        System.out.println("����ְԱ�Ҵ�");
    }
}