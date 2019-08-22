/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.log;

/**
 * @author Zen
 * @version 1.0: FactoryMethodLogMain.java, v 0.1 2019/08/22 11:30 Zen Exp $
 */
public class FactoryMethodLogMain {
    /**
     * 这里就不写那个XMLUtil了，直接使用简单的main()方法
     * @param args
     */
    public static void main(String[] args) {
        Log log;
        LogFactory factory;
        factory = new FileLogFactory();
        log = factory.createLog();
        log.writeLog();
    }
}