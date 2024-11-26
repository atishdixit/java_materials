package com.ext.lect.operator.oops.polymorphism;

import java.util.Arrays;
import java.util.List;

public class Starter {

    /***
     *
     * TV--> ONIDA--> 2000, Feature [ ON, OFF Volume(+,-), Change color] -->>Remote[....]R1
     *
     * TV--> ONIDA--> 2005, Feature [ ON, OFF Volume(+,-), Change color, Internet, Sleep] -->>Remote[...., ..]R2-[R1+Some More F]
     *
     *
     *              TV--> ONIDA--> 2000
     *                      /\
     *                     /  \
     *                    R1   \
     *                         R2
     *
     *                          TV--> ONIDA--> 2005
     *      *                      /\
     *      *                     /  \
     *      *                     R1  \
     *      *                         R2
     *
     *      R1-->R2
     *
     */
    public static void main(String[] args) {
//        TV tv = null;
//
//        tv = new Onida("Onida","Green",false, 10, "NDTV" );
//        tv.getName();
//        tv.showState();
//        tv.showVolume();
//        tv.showChannel();
//        tv.showColor();
//
//        tv.changeVolume(-2);
//        tv.on();
//        System.out.println("------After changing Object-------");
//        tv.showState();
//        tv.showVolume();
//
//        tv = new Samsung("Samsung", "Green",false, 10, "NDTV" );
//        tv.getName();
//        tv.showState();
//        tv.showVolume();
//        tv.showChannel();
//        tv.showColor();
//
//        tv.changeVolume(-2);
//        tv.on();
//        System.out.println("------After changing Object-------");
//        tv.showState();
//        tv.showVolume();

//        Samsung samsung = new Samsung("Samsung", "Green",false, 10, "NDTV" );
//        samsung.setTechSupport(true);
//
//        showTVStatus(samsung);
//
//        Onida onida = new Onida("Onida", "Green",false, 10, "NDTV" );
//        onida.setTechSupport(true);
//        showTVStatus(onida);


        Samsung list[] = {
                new Samsung("Samsung", "Green",false, 10, "NDTV" ),
                new Samsung("Samsung", "Red",true, 12, "CYX" ),
                new Samsung("Samsung", "Yellow",false, 10, "PWQ" )
            };

        showTVList(list);
    }

    //inheritance --polymorphism
    //Binding:
    // -->  Static binding/compile time ,
    // ---> Dynamic binding/ run time

    // polymorphism: inheritance(Imp)
    // Overloading: Static binding, Static binding/compile time, Overloading
    // Overloading: Dynamic binding/ run time
    //



    public static void showTVStatus(TV tv){
        tv.getName();
        tv.showState();
        tv.showVolume();
        tv.showChannel();
        tv.showColor();
        //Samsung samsung = (Samsung)tv;//java.lang.ClassCastException: in case Onida
        //samsung.isTechSupportAvailable();


        AbstractTV abstractTV = (AbstractTV) tv; //Solution
        abstractTV.isTechSupportAvailable();


//        if(tv  instanceof Samsung){
//            Samsung samsung = (Samsung)tv;
//            samsung.isTechSupportAvailable();
//        } else if(tv instanceof Onida){
//            Onida onida = (Onida)tv;
//            onida.isTechSupportAvailable();
//        }
        tv.changeVolume(-2);
        tv.on();
        tv.showState();
        tv.showVolume();
        System.out.println();
    }

//    public static void showTVStatus(AbstractTV tv){
//        tv.getName();
//        tv.showState();
//        tv.showVolume();
//        tv.showChannel();
//        tv.showColor();
//        tv.isTechSupportAvailable();
//        tv.changeVolume(-2);
//        tv.on();
//        tv.showState();
//        tv.showVolume();
//        System.out.println();
//    }

//
//    public static void showTVStatus(Samsung tv){
//        tv.getName();
//        tv.showState();
//        tv.showVolume();
//        tv.showChannel();
//        tv.showColor();
//
//        tv.changeVolume(-2);
//        tv.on();
//        System.out.println("------After changing Object-------");
//        tv.showState();
//        tv.showVolume();
//    }
//
//    public static void showTVStatus(Onida tv){
//        tv.getName();
//        tv.showState();
//        tv.showVolume();
//        tv.showChannel();
//        tv.showColor();
//
//        tv.changeVolume(-2);
//        tv.on();
//        System.out.println("------After changing Object-------");
//        tv.showState();
//        tv.showVolume();
//    }


    static void  showTVList(Samsung samsungs[]){
        for (Samsung samsung : samsungs){
            System.out.println(samsung);
        }
    }

    static void showTVList(Onida onidas[]){
        for (Onida onida : onidas){
            System.out.println(onida);
        }
    }

    static void showTVList(TV tvs[]){
        for (TV tz : tvs){
            System.out.println(tz);
        }
    }


}
