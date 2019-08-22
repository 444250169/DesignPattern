/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.log;

/**
 * @author Zen
 * @version 1.0: FileLogFactory.java, v 0.1 2019/08/22 11:26 Zen Exp $
 */
public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("创建FileLog对象");
        return new FileLog();
    }
}