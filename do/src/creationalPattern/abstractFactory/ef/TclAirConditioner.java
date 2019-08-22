/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.abstractFactory.ef;

/**
 * @author Zen
 * @version 1.0: TclAirConditioner.java, v 0.1 2019/08/22 13:54 Zen Exp $
 */
public class TclAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL¿Õµ÷£¬´µµÄÔôÀä");
    }
}