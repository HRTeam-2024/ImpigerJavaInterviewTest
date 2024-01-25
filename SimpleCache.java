package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleCache {

    public static List<String> cacheList = new ArrayList<>(10);

    //    implement a basic cache with methods for adding, retrieving, and removing elements.
    //    The cache should have a maximum size, and when it reaches that size, it should remove
    //    the least recently used element and add the new one
    public static void sayHello() {
        System.out.println("Hello World");
        for (int i = 0; i < 12; i++) {
            List<String> strings = new ArrayList<>();
            strings.add(String.valueOf(i));
            strings.add(String.valueOf(i+1));
            addCacheMethod(strings);
        }
        System.out.println(gettingCache());
        removeCache("2");
        System.out.println(gettingCache());

    }


    public static void removeCache(String s){
        cacheList.remove(s);
    }

    public static List<String> gettingCache(){
        return cacheList;
    }

    public static void addCacheMethod(List<String> result){
        if (cacheList.size()<=10){
            cacheList.addAll(result);
        }else {
            for (int i = 0; i < result.size(); i++) {
                cacheList.set(i,result.get(i));
            }
        }
    }

    public static void main(String[] args) {
        sayHello();
    }

}