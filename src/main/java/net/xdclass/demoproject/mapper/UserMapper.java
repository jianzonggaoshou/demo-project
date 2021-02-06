package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserMapper {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1, new User(1, "jack1", "123"));
        userMap.put(2, new User(1, "jack2", "123"));
        userMap.put(3, new User(1, "jack3", "123"));
    }

}
