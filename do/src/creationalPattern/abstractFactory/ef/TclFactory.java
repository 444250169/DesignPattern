/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.abstractFactory.ef;

/**
 * @author Zen
 * @version 1.0: TclFactory.java, v 0.1 2019/08/22 13:57 Zen Exp $
 */
public class TclFactory implements EFactory{
    @Override
    public Television produceTelevision() {
        System.out.println("生产tcl的电视");
        return new TclTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        System.out.println("生产tcl的空调");
        return new TclAirConditioner();
    }
}