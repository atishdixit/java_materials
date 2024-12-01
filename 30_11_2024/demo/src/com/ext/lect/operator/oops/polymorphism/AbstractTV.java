package com.ext.lect.operator.oops.polymorphism;

public abstract class AbstractTV implements TV{

    protected int volume;
    protected String name;
    protected String color;
    protected String channel;
    protected boolean state;
    protected boolean isTechSupport;

    public AbstractTV(String name, String color, boolean state, int volume) {
        this.name = name;
        this.volume = volume;
        this.color = color;
        this.state = state;
    }

    @Override
    public void getName() {
        System.out.println("TV Name: "+this.name);
    }

    @Override
    public void on() {
        if(!this.state){
            state  = true;
        }
    }

    @Override
    public void off() {
        if(this.state){
            this.state  = false;
        }
    }

    @Override
    public void showState(){
        String state =  this.state? "ON": "OFF";
        System.out.println("Current State "+state);
    }

    @Override
    public void showColor() {
        System.out.println("Current color "+this.color);
    }

    @Override
    public void showVolume() {
        System.out.println("Current Volume "+this.volume);
    }

    @Override
    public void showChannel() {
        System.out.println("Current channel "+this.channel);
    }

    public boolean isTechSupportAvailable() {
        System.out.println("Tech support is Available for this TV: "+(isTechSupport?"YES":"NO"));
        return isTechSupport;
    }

    public void setTechSupport(boolean techSupport) {
    }

    @Override
    public String toString() {
        return "AbstractTV{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", channel='" + channel + '\'' +
                ", state=" + state +
                ", isTechSupport=" + isTechSupport +
                '}';
    }
}
