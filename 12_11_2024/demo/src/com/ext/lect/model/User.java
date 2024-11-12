package com.ext.lect.model;

//Real word entity
//code
public class User {
    String userName; //null
    String emilId;
    String name;
    int age = 10;

    static int count = 0;//data
    static int wrongCallCount = 0;

    static {
       System.out.println("I am in static 1 al class load time");
    }

    //Attribute/Instance Variable/Properties/

    //inatnce
    {
        System.out.println("age in  instance block Start"+ age);
        System.out.println("I am in  instance block");
        age = 20;
        System.out.println("age in instance block: End  "+ age);
    }

    public User() {
        System.out.println("I am in constructor 1: Age "+name);
        System.out.println("I am in constructor : Age "+name);
        System.out.println("I am in constructor: Age "+userName);
        System.out.println("I am in constructor: Age "+emilId);
        System.out.println("I am in constructor: Age "+age);
        count = count+1;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String tempUserName) {
        userName = tempUserName;
    }

    public String getEmilId() {
        return emilId;
    }

    public void setEmilId(String tempEmilId) {
        emilId = tempEmilId;
    }

    //Method/Behaviour
    public void setName(String fname){
            //Local variale/method
            name = fname;
    }

    public String getName(){
        return name;
    }

    //Method/Behaviour
    public void setAge(int thisAge){
        //Local variale/method
        age = thisAge;
    }

    public int getAge(){
        System.out.println("I am in age method");
        return age;
    }

    public static int getCount(){
        return count;

    }

    public void wrongHit(){
        System.out.println("I am in wrong place");
        wrongCallCount = wrongCallCount +1;
    }


    public static int audit(){
        return wrongCallCount;
    }
}


//Java->Compiler->ByteCode-->Interpreter--> Machine code