package com.ext.lect.operator;

public class ControlStatement {
    /**
     * Decision making if if-else, nested, switch
     * Looping/iterative statement for while do
     * Jumm/Transfer statements break, continue. return, goto(Ont in java),
     *
     * class Test { // address
     *
     *     int a = 20
     *
     *     public static void main(String ar[]){
     *         sout(a)
     *     }
     * }
     *
     *
     * 2 dsh
     * 3 fddgd
     * 4 fggf
     * 5 fgfg
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {
        //True/false
        // 0/1
        // boolean
        //int a=0
        //boolean b=true;
        //boolean result = isEven(20);
       // System.out.println(result);
        String cap = giveMeState("HP");

        System.out.println(cap);

    }

//    static boolean isEven(int num){
//        int result = num%2;
//        if(result == 0){
//            if(num%5==0){
//                System.out.println("this is dicisible by 10 too");
//            }
//            return true;
//        } else if(num>20){
//            System.out.println(num*10);
//            return false;
//        } else {
//            return false;
//        }
//    }

    static boolean isEven(int num){
        //int result = num%2;
        /**
         *  if(result == 0)
         *        int a=20;
         *
         * CTE error
         */


//        if(result == 0)
//            return true;
//        else
//            return false;




//        if(result == 0){
//            return true;
//        } else {
//            return false;
//        }

//        if(result == 0)
//            return true;
//        return false;

        return num%2 == 0;

    }

//    //pb->Capital, up, uk hr
//    private static String giveMeState(String code){
//        String name = "";
//        switch (code.toLowerCase()){
//            case "pb":
//                name = "Chandigarh";
//
//            case "hr":
//                name = "Chandigarh";
//                break;
//            case "hp":
//                name= "Shimla";
//                break;
//            default:
//                name = "none";
//        }
//        return name;
//    }

    //pb->Capital, up, uk hr
    private static String giveMeState(String code){
        String name= "none";
        switch (code.toLowerCase()){
            case "pb", "hr":
                name = "Chandigarh";
                break;
            case "hp":
                name = "Shimla";
                break;
//            default:
//                name = "none";
        }
        return name;
    }
}
