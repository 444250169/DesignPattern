/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.abstractFactory.ef;

/**
 * @author Zen
 * @version 1.0: AbstractFactoryMain.java, v 0.1 2019/08/22 14:00 Zen Exp $
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        EFactory afactory;
        EFactory bfactory;
        Television television;
        AirConditioner airConditioner;
        afactory = new HaierFactory();
        bfactory = new TclFactory();

        television = afactory.produceTelevision();
        airConditioner = bfactory.produceAirConditioner();

        television.play();
        airConditioner.changeTemperature();

    }
}