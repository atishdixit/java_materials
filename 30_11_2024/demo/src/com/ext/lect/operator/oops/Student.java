package com.ext.lect.operator.oops;

//Access specifier/ modifier
// Private// Only in side class
//Public:  can access anywhere, out side class, out package, out side project, even on remote
//protected
// default: accessible in package

import java.util.Date;
import java.util.Locale;

//scope
public class Student {

    //static int count = 0;
    static String CODE = "";  //ABP3232323_{random}

    static {
        Date current =  new Date();
        long time = current.getTime();
        //ABPCurrentTomeInMIliSec+10_NUM
        CODE = "ABP"+(time+10)+"_{random}";
    }

    public static void main(String[] args) {
        System.out.println(CODE);
    }
//    //private String name;
//    private int age;
//    private int std;
//
//
////Setter/Mutator
//    public void setName(String name){
//        if(name.length()<25){
//            this.name = name.substring(0,1).toUpperCase().concat(name.substring(1).toLowerCase());
//        }
//    }
//
//    public void setSTD(int std){
//        if(std<=12){
//            this.std = std;
//        }
//
//    }
//
//    public void setAge(int age){
//        if(age<25){
//            this.age = age;
//        }

 //   }














    //default
//    public Student(){
//
//    }

    // constructor chaining
//    public Student(){
//    }
////
//    public Student(int age){
//        this();
//        this.age = age;
//    }

//    public Student(String name){
//        this.name = name;
//        this.age = 2;
//        this.std = "LKG";
//    }
//
//    public Student(String name, int age){
//        this(age);
//        this.name = name;
//    }
//
//    public Student(String name, String std, int age){
//       this(name, age);
//       this.std = std;
//    }

//    public void show(){//
//        System.out.println("Hello: "+this.name);
//        System.out.println("Age: "+this.age);
//        System.out.println("STD: "+this.std);
//    }

    //Type of constructor
    // default: zero argument
    // Argument
    //default: implicitly with no argument: Compiler syntax--> Signature
    //If developer provides any constructor(explicit)



//    public Student(String name, int age, String std) {
//        this.name = name;
//        this.age = age;
//        this.std = std;
//   }

//    int study(int a){ //Arguma 0 to Positive
//        return 10;
//    }
//
//    void speak(){
//
//
//    }
//
//    public void test(int z){
//
//    }
//
//    int no(){
//        return 10;
//    }

    //Function with no argument and and no return value

    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;

    // Length should be between 2 to 25, First Character should be caps, No Space in between, start end
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Length should be between 2 to 25, First Character should be caps, No Space in between, start end
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Length should be between 2 to 25, First Character should be caps , No Space in between, start end
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // fullName =  firstName+lastName+middleName (First Charater should be caps and with one space),
    //
    private void setFullName(String fullName){
        this.fullName = this.fullName+ " "+ this.middleName + " "+this.lastName ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        return fullName;
    }
}
