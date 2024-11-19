package com.ext.lect.operator.oops.polymorphism;

public class OnidaV2 extends AbstractTV {

    public OnidaV2(String color, boolean state, int volume, String channel) {
        super(color, state, volume);
        this.channel = channel;
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public void changeChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public void setVolume() {
        this.volume++;
    }

   public void showColor(){
       System.out.println(this.color);
    }

    public void showVolume(){
        System.out.println(this.volume);
    }

    public void showChannel(){
        System.out.println(this.channel);
    }

    @Override
    public void on() {
        System.out.println("Getting started V1...");
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
        System.out.println("switch of your TV V2");
    }
}
