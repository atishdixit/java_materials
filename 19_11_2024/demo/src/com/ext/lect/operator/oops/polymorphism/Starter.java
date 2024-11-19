package com.ext.lect.operator.oops.polymorphism;

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

//        Onida onida = new Onida("Green",false, 10, "NDTV" );
//
//        OnidaV2 onidaV2 = new OnidaV2("Ultra Green",false, 12, "NDTV-Pro" );

       // AbstractTV remote1 = new Onida("Green",false, 10, "NDTV" );

        AbstractTV remote1 = new OnidaV2("Ultra Green",false, 12, "NDTV-Pro" );


//        remote1.showColor();
//        remote1.showVolume();
        remote1.showState();
        //remote1.showChannel();
        remote1.on();
        remote1.showState();

        remote1.off();
        remote1.showState();
    }

    //inheritance --polymorphism
    //Binding:
    // -->  Static binding/compile time ,
    // ---> Dynamic binding/ run time

    // polymorphism: inheritance(Imp)
    // Overloading: Static binding, Static binding/compile time, Overloading
    // Overloading: Dynamic binding/ run time
    //

}
