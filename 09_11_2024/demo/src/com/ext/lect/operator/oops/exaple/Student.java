package com.ext.lect.operator.oops.exaple;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
//        if(Validator.validateName(name)) {
//            this.name = Validator.formatName(name);
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        if(Validator.validateName(name)) {
//            this.name = Validator.formatName(name);
//        }
        this.name = name;
    }

//    private boolean validateName(String name){
////        if(name.length()>0 && name.length()<20) {
////            return true;
////        }
////        } else {
////            return false;
////        }
//        //return false;
//            return name.length()>0 && name.length()<20;
//    }

//    private String formatName(String name){
//        name = name.trim();
//        return name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
//    }
}
