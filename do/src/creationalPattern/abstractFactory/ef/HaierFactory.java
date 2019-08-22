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
        System.out.println("生产Haier的电视");
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("生产海尔的空调");
        return new HaierAirConditioner();
    }
}