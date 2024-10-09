package com.ext.lect;

/**
 * Data type: Define the characteristics of data
 */
public class DataTypes {

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    double doubleValue;
    float floatValue;
    boolean booleanValue;
    char charValue;

    public static void main(String as[]) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.shortCharacteristics();
    }

    private void byteCharacteristics() {
        byteValue = 0;
        for (int i = 0; i < 256; i++) {
            System.out.println(" " + byteValue);
            byteValue++;
        }
    }

    private void shortCharacteristics() {
        shortValue = 32765;
        for (int i = 32765; i < 32780; i++) {
            System.out.println(" " + shortValue);
            shortValue++;
        }
    }

    private void intCharacteristics() {
        System.out.println(intValue);
    }

    private void longCharacteristics() {
        System.out.println(longValue);
    }

    private void floatCharacteristics() {
        System.out.println(floatValue);
    }

    private void doubleCharacteristics() {
        System.out.println(doubleValue);
    }

    private void booleanCharacteristics() {
        System.out.println(booleanValue);
    }

    private void charCharacteristics() {
        System.out.println(charValue);
    }
}
