package com.ext.lect.operator.oops.polymorphism;

public class Onida extends AbstractTV {

    public Onida(String name, String color, boolean state, int volume, String channel) {
        super(name, color, state, volume);
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


    @Override
    public void changeVolume(int volume) {
        this.volume = this.volume+volume;
    }

    @Override
    public void on() {
        System.out.println("Getting started Your ONIDAAAA...");
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
        System.out.println("switch of your IDAAAA.. TV.");
    }
}