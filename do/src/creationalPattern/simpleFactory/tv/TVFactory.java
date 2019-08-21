/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.tv;

/**
 * @author Zen
 * @version 1.0: TVFactory.java, v 0.1 2019/08/21 14:58 Zen Exp $
 */
public   class TVFactory {
    public static Object productTV(String brand){
        if("Haier".equals(brand)){
            return new HaierTV();
        }else if("Hisense".equals(brand)){
            return new HisenseTV();
        }else{
            System.out.println("俺们不生产此品牌电视");
            return null;
        }
    }
}