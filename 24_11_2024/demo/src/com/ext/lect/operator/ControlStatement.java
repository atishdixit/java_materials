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
       // printTable(1);
       // printTable(40);
        ///**
//        Yes153
//                Yes370
//        Yes371
//                Yes407

        goldenNumber(153);
//        for(int a=10;a<500; a++){
//            goldenNumber(a);
//        }

       //jumpState(1);
       //
        //True/false
        // 0/1
        // boolean
        //int a=0
        //boolean b=true;
        //boolean result = isEven(20);
       // System.out.println(result);
//        String cap = giveMeState("HP");
//
//        System.out.println(cap);

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




//        if(result == 0)
//            return true;
//        return false;

//        if(result == 0){
//            return true;
//        } else {
//            return false;
//        }

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


    /**
     * 2 table
     *
     *
     */

   static void printTable(int num){
            //step 1     //step 2    step 4
//       int start = 1;
//
//       for( ;1start<=0; ) {
//           // step 3
//           System.out.println(num * start);
//
//           start++;
//       }

//       for (int start = 1;start<=10; start++){
//           System.out.println(num * start);
//       }


//       int start = 11;
//       while(start<=10){
//           System.out.println(num * start);
//           start++;
//       }
//        int a=2;////infinity loop
//       for (;;){
//           System.out.println("hello");
//           if(a>20){
//               break;
//           }
//           a++;
//       }
       //
//       while (true){//infinity loop
//           System.out.println("hello");
//       }
//

      // int start = 11;
//
//    do{
//        System.out.println("hello");
//        start++;
//    }while (start<=10);

//       for (int i=1;i<=100;i++){//179
//
//           if(i<10){
//               continue;
//           }
//           System.out.println(i);
//           if(i == num){
//               break; //185
//           }
//           System.out.println("hello");
//       }
//       //--


       p:
       for(int i=1;i<=10;i++){
           //System.out.println("i");
           for(int j=1;j<=3;j++){
               if(i==2 && j==2){
                   break p;
               }
               System.out.println("I = "+i +" J = "+j);
           }
       }
   }

   static void sumOfDigit(int num){
       //num = 1234==> 1+2+3+4=>10: 1234%10= 4
       //12
       //45467
       //temp = 1234%10= 4
       // num/10;==> 123.4
       // num 123.4;==>123
       //tepm = num%10==> 4
       // num = 1/10 =0

       int sum = 0;
       int temp = 0;
       while(num>0){
           temp = num%10;  //4
           num = num/10;  //123
           sum = sum+temp;
           //      0+4
       }

//       int sum = 0;
//       int temp = 0;
//       for (; num>0 ;){
//           temp = num%10;
//           num = num/10;
//           sum = sum+temp;
//       }

       System.out.println(sum);

   }


   static void jumpState(int x){
       x =x*20;
       if(x>40){
           System.out.println("in if block");
            return;
       }
       System.out.println(x);
   }

   // String
    // hds sdjhfdjf kjhkf kjhkjsf kjhksf khsf

   static void factorial(int num){
       int fact = 1;
       // 2=>5*4*3*2*1
//       for(int i = 1; i<=num;i++){
//           fact = fact*i;
//       }

//       for(int i = num; i>=1;i--){
//           fact = fact*i;
//       }
       int i = num;
       while (i>=1)
       System.out.println(fact);
       i--;
   }

   //
   //
   static void isPrime(int num){
       boolean isPrime = true;
       if(num>2){
           for (int i=3;i<=num/2;i++){
               System.out.println("in fro");
               if(num%i == 0){
                   isPrime = false;
                   System.out.println("in fro");
                   break;
               }
           }
       }

        if(isPrime){
            System.out.println("Yes No is prime");
        } else {
            System.out.println("none prime");
        }
   }
   //add ==> Matirx, numb,


    // 234 ==> 2, 3, 4 2^3+3^3+4^3

    static void goldenNumber(int num){
        int temp = num;
       int sum = 0;
       int vale = 0;
       while(num>0){
           vale = num%10;
           sum =  sum+(vale*vale*vale);
           num = num/10;
       }

       if(temp == sum){
           System.out.println("Yes ");
       } else {
            System.out.println("No");
        }
    }

    static void reversNumber(int num){

       // 1234 == > 4321
        // 1234 => 4 num%10
        //1234 => 4 num/10 ==123
        // 123==>num%10 == 3;
        //123 => 4 num/10 == 12
        // result = 0;
        //result= result*10+4
        //result = result*10+3;

        int sum = 0;
        int vale = 0;
        while(num>0){
            vale = num%10;
            sum =  sum+vale;
            num = num/10;
        }

    }

//1 to 100
// binaomi
//    ncr==>
//Prime
// Factorial
//gplden number
    //  °C = (°F - 32) × 5/9

    // ax+by+c=2

// sum of digit 1234=
    // 1234 --> 4321

    static void sum1OfDigit(int num){
        // 1234 == > 4321
        // 1234 => 4 num%10
        //1234 => 4 num/10 ==123
        // 123==>num%10 == 3;
        //123 => 4 num/10 == 12
        //result 4
        int sum = 0;
        int vale = 0;
        while(num>0){
            vale = num%10;
            sum = sum+vale;
            num = num/10;

        }
        System.out.println(sum);
    }

}


