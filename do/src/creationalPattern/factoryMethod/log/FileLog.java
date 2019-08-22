/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.log;

/**
 * @author Zen
 * @version 1.0: FileLog.java, v 0.1 2019/08/22 11:24 Zen Exp $
 */
public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("写文件日志");
    }
}