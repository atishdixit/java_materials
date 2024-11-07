package com.ext.lect.operator.oops.exaple;

// Utility class
//Math
// Runtime
//SYstem
public class Validator {

    private Validator(){
    }

    public static String formatName(String name){
        name = name.trim();
        return name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
    }

    public static boolean validateName(String name){
        return name.length()>0 && name.length()<20;
    }
}
