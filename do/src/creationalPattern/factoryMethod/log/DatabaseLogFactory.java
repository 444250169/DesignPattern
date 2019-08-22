/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.log;

/**
 * @author Zen
 * @version 1.0: DatabaseLogFactory.java, v 0.1 2019/08/22 11:28 Zen Exp $
 */
public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        System.out.println("创建DatabaseLog对象");
        return new DatabaseLog();
    }
}