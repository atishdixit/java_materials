package com.ext.lect.operator.oops.inher;
// inheritance between classes/interface extends
// inheritance between classes and interface:  implements
//public class Labor implements Human{
//final public class Labor extends Employee{ //Complete class, no further extends
public class Labor extends Employee{

    int x=200;



    //Compiler
//    Labor(){
//        super();
//        x=200;
//        System.out.println(this.x);
//        System.out.println(super.x);
//    }

    void abc(){

    }

//    Labor(String name){
//        System.out.println(x);
//        System.out.println();
//    }

    private Labor(){
       System.out.println("Hello");
    }
    public void work(){
        System.out.println("Labor ");
    }

    public void speak(){
        System.out.println("sleep Marathi");
    }

    public void sleep(){

    }

    public static Labor getLabor(){
        return new Labor();
    }
}
