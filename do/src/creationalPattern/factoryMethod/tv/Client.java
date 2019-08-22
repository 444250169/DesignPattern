/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod.tv;

/**
 * @author Zen
 * @version 1.0: Client.java, v 0.1 2019/08/21 17:45 Zen Exp $
 */
public class Client {
    public static void main(String[] args) {
        try {
            TV tv;
            TVFactory factory;
            factory = (TVFactory) XMLUtil.getBean();
            tv = factory.productTV();
            tv.play();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}