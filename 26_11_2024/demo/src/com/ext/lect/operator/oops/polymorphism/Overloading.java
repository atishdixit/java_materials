package com.ext.lect.operator.oops.polymorphism;

public class Overloading {

    public static void main(String[] args) {
        String messageContent = "Hello {name}, How Are you?";
        Message message = new Message("Rahul", "asd@gmail.com", "xyz@gmail.com", messageContent);

        NotificationHandlerIntr handlerIntr = new NotificationHandler();
        handlerIntr.setPlateForm("Facebook");
        handlerIntr.sent(message);
    }


    //Overloading--> static type/compile time binding

    //signature always change

    //returnType name(argument)
    //public int sum(int a, int b)
    //public float sum(double a, int b, int c)
    //void sum(float a, int b, float c, )





}
