package com.ext.lect.operator.oops.polymorphism;

import java.io.IOException;

public class Parent{
    public int sum(int a, int b){//access modifier narrow/widden
        return a+b;
    }

    protected void showName(A a){
        a.show();
    }

    protected A getObject(A a){
        return new A();
    }

    protected void getException() throws Exception {//Checked
        System.out.println("Parent");
    }

    protected void getRunTimeException() throws RuntimeException{//unchecked
//        ArrayIndexOutOfBoundsException s;
//        ArithmeticException  s;

        System.out.println("Parent");
    }

    protected void test(int a, int b) {//unchecked
       System.out.println("test paret");
    }
}
