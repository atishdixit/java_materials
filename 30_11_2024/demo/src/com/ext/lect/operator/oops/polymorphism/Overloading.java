package com.ext.lect.operator.oops.polymorphism;

public class Overloading {

    public static void main(String[] args) {
//        String messageContent = "Hello {name}, How Are you?";
//        Message message = new Message("Rahul", "asd@gmail.com", "xyz@gmail.com", messageContent);
//
//        NotificationHandlerIntr handlerIntr = new NotificationHandler();
//        handlerIntr.setPlateForm("Facebook");
//        handlerIntr.sent(message);


        short x=10;
        short y = 10;
        add(x,y);
    }


    static public int add(int a, int b){//default
        System.out.println("int argument "+(a+b));
        //byte b= 10+10;
        return a+b;
    }

    static public short add(short a, short b){
        System.out.println("short argument "+(a+b));
        return (short) (a+b);
    }

    static public byte add(byte a, byte b){
        System.out.println("Byte argument "+ (a+b));
        return (byte) (a+b);
    }

    static public long add(long a, long b){
        System.out.println("long argument "+(a+b));
        return a+b;
    }

    //Overloading--> static type/compile time binding

    //signature always change

    //returnType name(argument)
    //public int sum(int a, int b)
    //public float sum(double a, int b, int c)
    //void sum(float a, int b, float c, )





}
