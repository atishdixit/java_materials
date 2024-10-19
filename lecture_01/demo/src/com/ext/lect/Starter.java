package com.ext.lect;

import com.ext.lect.model.User;

public class Starter {

    public static void main(String[] args) {
       User u1 =  new User();
        User u2 =  new User();
        u2.wrongHit();
        User u3 =  new User();
        User u4 =  new User();
        u4.wrongHit();
        User u5 =  new User();
        User u6 =  new User();


//        u6.wrongHit();
////        System.out.println("Total number of object on heap "+User.getCount());
//
//
//        System.out.println("Objects: "+User.getCount());
//        System.out.println(User.audit());
//
//        //out of Hundrad Object, if 06 worng, system on risk, 50-> Alert, lest 50 ok

        ShadowIng shadowIng = new ShadowIng();
        shadowIng.setName("Ajay");

        String value = shadowIng.getName();

        System.out.println(value);




    }
}
