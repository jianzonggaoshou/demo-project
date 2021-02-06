package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.Video;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1, new Video(1, "Java基础课程，jdk8-13新特性1"));
        videoMap.put(2, new Video(2, "Java基础课程，jdk8-13新特性2"));
        videoMap.put(3, new Video(3, "Java基础课程，jdk8-13新特性3"));
        videoMap.put(4, new Video(4, "Java基础课程，jdk8-13新特性4"));
        videoMap.put(5, new Video(5, "Java基础课程，jdk8-13新特性5"));
    }

    public List<Video> listVideo() {

        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
