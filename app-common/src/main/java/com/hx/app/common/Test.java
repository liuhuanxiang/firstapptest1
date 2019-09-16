package com.hx.app.common;

import java.util.HashMap;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-07-31  11:07
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Object, String> map = new HashMap<>();
        User u1 = new User("1", "小明");
        User u2 = new User("2", "小红");
        map.put(u1, "u1");
        map.put(u2, "u2");
        u1.setUserCode("3");
        System.out.println(map.get(u1));
    }
}
