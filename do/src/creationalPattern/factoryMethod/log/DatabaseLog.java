/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.log;

/**
 * @author Zen
 * @version 1.0: DatabaseLog.java, v 0.1 2019/08/22 11:25 Zen Exp $
 */
public class DatabaseLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("写数据库日志");
    }
}