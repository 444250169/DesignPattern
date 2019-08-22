/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.abstractFactory.ef;

/**
 * @author Zen
 * @version 1.0: HaierFactory.java, v 0.1 2019/08/22 13:56 Zen Exp $
 */
public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        System.out.println("����Haier�ĵ���");
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("���������Ŀյ�");
        return new HaierAirConditioner();
    }
}