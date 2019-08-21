/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.simpleFactory.grant;

/**
 * @author Zen
 * @version 1.0: UserFactory.java, v 0.1 2019/08/21 15:35 Zen Exp $
 */
public class UserFactory {
    public static User getUser(int permission)
    {
        if(0==permission)
        {
            return new Employee();
        }
        else if(1==permission)
        {
            return new Manager();
        }
        else if(2==permission)
        {
            return new Administrator();
        }
        else
        {
            return null;
        }
    }

}