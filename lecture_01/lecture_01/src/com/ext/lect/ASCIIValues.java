package com.ext.lect;

/**
 * Wrapper classes and ASCII codes
 */
public class ASCIIValues {

    public static void main(String[] args) {
        System.out.println(isEqualsPrimitive(128,128));
        System.out.println(sumDigit('5', '5'));
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
