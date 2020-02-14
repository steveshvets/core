package com.ss.designPatterns.structural.adapter2;

public class SocketObjectAdapterImpl implements SocketAdapter{
    //Using Composition for adapter pattern
    private Socket sock = new Socket();
    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }
    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
