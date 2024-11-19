package com.ext.lect.operator.oops.polymorphism;

public abstract class AbstractTV implements TV{

    protected int volume;
    protected String color;
    protected String channel;
    protected boolean state;

    public AbstractTV(String color, boolean state, int volume) {
        this.volume = volume;
        this.color = color;
        this.state = state;
    }

    @Override
    public void on() {
        if(!state){
            state  = true;
        }
    }

    @Override
    public void off() {
        if(state){
            state  = false;
        }
    }

    public void showState(){
        System.out.println("Current State "+state);
    }
}
