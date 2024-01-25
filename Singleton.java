package org.example;

public class Singleton {

    // Convert this class into a Singleton class
    private static Singleton singletonIns = null;
    private static int maxCapacity = 1000;

    public static Singleton getInstance(Singleton singletonIn){
        if (singletonIn==null){
            singletonIns = new Singleton();
        }
        return singletonIns;
    }

    public int getCount(int count){
        return maxCapacity - count;
    }

    public static void sayHello() {
        Singleton singleton = null;
        singleton = getInstance(singleton);
        System.out.println(singleton.getCount(100));
        singleton = getInstance(singleton);
        System.out.println(singleton.getCount(200));
    }

    public static void main(String[] args) {
        sayHello();
    }

}