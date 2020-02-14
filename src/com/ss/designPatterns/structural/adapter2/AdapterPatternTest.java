package com.ss.designPatterns.structural.adapter2;

public class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }
    private static void testObjectAdapter() {
        SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
        Volt v12 = getVolt(sockAdapter, 12);
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
    }
    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v12 = getVolt(sockAdapter, 12);
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
    }
    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        return sockAdapter.get12Volt();
    }
}
