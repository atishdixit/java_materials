package com.ext.lect.operator.oops.polymorphism;

import java.io.IOException;

public class childClass extends Parent{

    @Override
    public int sum(int a, int b) {
        //return (10*a)+b;
        return super.sum(10*a, b);
    }

    @Override
    protected void showName(A a) {
        a.show();
    }

    @Override
    protected B getObject(A a) {
        return new B();
    }

    @Override
    protected void getException() throws IOException{//checked exception
        System.out.println("Child");
    }

    @Override
    protected void getRunTimeException() throws RuntimeException {//unchecked
        super.getRunTimeException();
    }
}