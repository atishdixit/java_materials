package com.ext.lect;

public class ShadowIng {
    //Hidden this == 2002
    private String name;

    public void setName(String name){
        //name = name; shadowing
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
