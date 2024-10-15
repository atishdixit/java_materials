package com.ext.lect;

public class Main {

    /**
     * Class/interface/Record: Camel case EmployeeAddress, User
     * function/method: getAge(), sumOdValues()
     * variable/constant/enum : sumOdValues/Caps/ as Class(Class)
     * Day{
     *     SUNDAY
     *     MONDAY
     *    .
     * }
     * */

    static String name = "hello";

    static String name_Of_Office = "hello";

    static final String FULL_NAME = "hello";
    int a=10;
    double s =1.3;
    String ss = "dhfdfhjfhjfgksgksghskgj";
    static char c ='A';
//    static char digit ='7';
//
//
//    public static void main(String[] args) {
////        c= (char)(c+32);
////        System.out.println(c);
//
//       // System.out.println((int)(digit-48));
////        for(int i=0;i<26;i++){
////            System.out.println("Char "+c+" ASCII "+(int)c);
////            c= (char) (c+1);
//
//
//
//        System.out.println('\u0011');
//
//
//
//        System.out.println((int)(digit-'0'));
////        }
//
//
//
//
//
//
//
//
//    }



    public static void main(String[] args) { //scop

        String x= new String();


////        System.out.println(isEqualsPrimitive(128,128));
//        System.out.println(getAsciiValues('A', 'Z'));
//
////        for(int i=0;i<1000;i++)
////        System.out.println("Decimal-->"+i +" Char-->"+(char)i);
////
////
//    }
//        String name = "abc";
//        System.out.println(('3'-48) + ('4'-48));
//        System.out.println(sumDigit('3', '4'));
        System.out.println(name);
        System.out.println(FULL_NAME);
    }


    private static boolean isEqualsWrapper(Integer i1, Integer i2){
        return i1 == i2;
    }

    private static boolean isEqualsPrimitive(int i1, int i2){
        return i1 == i2;
    }

    /**
     * ASCII Table
     * Dec  = Decimal Value
     * Char = Character
     *
     * '5' has the int value 5
     * if we write char c = 'B'+32; then c stores 'b'
     *
     * @param fromChar
     * @param toChar
     * @return
     */
    private static String getAsciiValues(char fromChar, char toChar){

        Integer  integer;

        StringBuffer buffer =  new StringBuffer();
        buffer.append("CHAR    ASCII").append("\n");
        String deshLine = "-------------";
        buffer.append(deshLine).append("\n");

        String dec_char = " %s       %d\n";
        char tempChar = fromChar;
        while (tempChar<=toChar){
            String value =  String.format(dec_char, tempChar, (int)tempChar);
            buffer.append(value);
            tempChar++;
        }
        return buffer.toString();
    }

    /**    a-A : 97-65 = 32
     *
     *  [0 9]      [48 57]
     *  [a z]      [97 122]
     *  [A Z]      [65 90]
     * @param ch
     * @return
     */
    private static char getCaps(char ch){
        char tempCh = ch;
        if(ch>= 97 && ch<=122  ){
            tempCh = (char)(ch - 32);
        }
        return tempCh;
    }

    private static int sumDigit(char ch1, char ch2){
        int gap = (int)'0';
        int sum = (ch1-gap) + (ch2-gap);
        return sum;
    }
}
