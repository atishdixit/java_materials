package com.ext.lect;
//Arguments
//Parameter
public class CommandLineArguments {
    //JVM
    public static void main(String[] args) {
//        //shdfgsdh sadgsd sjdgjds hgj     //IndexOutOfBound
//        // args[0] args[1]       args[3], args[4]
//
//        for(String str: args){
//            System.out.println(str);
//        }
//        if(args.length<2){
//            System.out.println("Please provide valid Cred");
//        } else{
//            String userName = args[0];
//            String password = args[1];
//            if(userName.equals("Rahul") && password.equals("31Oct@1234")){
//                startProgram();
//            } else {
//                System.out.println("Please provide valid Cred");
//            }
//        }
        if(args.length<2){
            System.out.println("Please provide two numbers by length");
            return;
        }
//        double x = 0;
//        double y = 0;

        int x = 0;
        int y = 0;
        try {
//            x = Double.parseDouble(args[0]);  // "12"  0-9
//            y = Double.parseDouble(args[1]);
//            sumOfDoubles(x, y);

            x = Integer.parseInt(args[0]);  // "12"  0-9
            y = Integer.parseInt(args[1]);
            sum(x, y);
        } catch (Exception exception){
            System.out.println("Please provide two numbers");
        }



    }


    static void startProgram(){
        System.out.println("Hi!, I am started..");
    }



    static void sum(int a, int b){
        System.out.println("Sum "+(a+b));
    }

    static void sumOfDoubles(double a, double b){
        System.out.println("Sum "+(a+b));
    }
}
