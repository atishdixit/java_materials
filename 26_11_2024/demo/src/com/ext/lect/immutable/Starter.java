package com.ext.lect.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        // String
        // Wrapper classes: Integer, Float, Double
        // Collection Framework
        // Constant Pool
        // clone
        // Custom Immutable object

        // String class,
        // Internally Fata as Array of Chars
        // jhfjfhjdfh

        //= [j, h, f, j, f, h,j,d,f,h]
        // = 0, 1,.................n-1

        //1-Way

//        String str1 = "xyz";
//        String str2 = "abc";
//        String str3 = "abc";
//
//
//                // case 1 , hashCode: memory address
//        System.out.println(str2.hashCode());
//        System.out.println(str3.hashCode());
//        System.out.println(str1.hashCode());
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str2 == str3);
//
//
//        System.out.println(str2.equals(str3));


        //Way 2
//        String str = new String("abc");
//        String str21 = new String("abc");
//        String str22 = new String("abc");
//        String str23= new String("abc");
//
//        System.out.println(str23.hashCode());
//        System.out.println(str23.concat("aa"));
//        System.out.println(str23.hashCode());
//
//        System.out.println(str23.hashCode());
//        System.out.println(str23);
//        System.out.println(str23.toUpperCase());
//        System.out.println(str23);
//
//        System.out.println("----------------");
//        System.out.println(str23.hashCode());
//        str23 = str23.toUpperCase();
//        System.out.println(str23.hashCode());












//        String original = "abc";
//
//       // Byte value = original.getBytes();
//
//        int a = 10;

     //   String str5="";//2000+ //Immuatble, Performance issue, lots of object
        //Mutable: StringBuilder and StringBuffer

        //StringBuilder: Mutable, not Thread safe, all methods are not synchronized(Key word), good in performance due to no synchronize
        //StringBuffer :  Mutable, Thread safe, all methods are synchronized(Key word), bad in performance due to synchronized

        //solution
        //String Builder class, Mutable class, but not thread safe
        //Muatbilty as well as Thread safty hen Stiring StringBuffer

//        StringBuffer buffer = new StringBuffer();//muat
//        //
//
//        StringBuilder stringBuilder = new StringBuilder();// Mutable

//        for(int i=1; i<=2000; i++){
////            str5 = str5+i;
////            System.out.println("String"+str5.hashCode());
////            // str5 = str5.concat(""+i);
////            buffer.append(i);
//            // stringBuilder.append(i);
////            System.out.println("buffer"+buffer.hashCode());
//
//            str5 = "abc";//2 3, 4==>+2+3+4->9//Hashing, Collisions
//            String ss = "cab";//4+2+3=>9: +1==// 100
//            System.out.println("String"+str5.hashCode());
//            System.out.println("String"+ss.hashCode());
//            //
//        }

       // System.out.println(str5);
        //System.out.println(buffer);

        //====================================================Wrapper==============================
        // primitive--
        // int  4, wrapper class
        // int --> Integer
        //Char--> Character class

        //Auto boxing: primitive to Wrapper// automatically
        //Auto unboxing: Wrapper to primitive


//
//        int a1=10;
//        Integer aa = new Integer("1");
//        Integer aaa =11;//Auto boxing
//
//        System.out.println(aaa);
//
//
//
//        System.out.println(a1);
//
//        Integer i=128;
//
//        // to insert data in Wrapper class, you can go via factory method or constructor, but no setters
//        Integer j=128;
//
//        System.out.println(j == i);
//
//
//          Integer a11 = Integer.valueOf(10);
//        Integer a22=  Integer.parseInt("22");// static factory method
//
//        a1 = aaa; //Auto unboxing
//        System.out.println(aaa);
//        System.out.println(a1);


        //8 wrapper class

        //Immutable class
        //Integer
//        Float ff;
//        //Double
//        //Short
//        Byte j2;
//        Boolean k;
//        //Character
        //Void

        //Created once, can not change it
        Date today = new Date();
        Address address =  new Address(371, "Jandhar", "Punjab", today);

        System.out.println(address.hashCode());
        System.out.println(address);

        Employee employee = new Employee("Rahul", 25, today, address);


        //Employee employeedefault = new Employee();
        //Worker worker = new Worker("rah", 2772);


//
//        System.out.println(employee.hashCode());
//        System.out.println(employee);

        //employee.setName("Raman");
       // System.out.println(employee.hashCode());
        //System.out.println(employee.hashCode());
//        System.out.println(employee.getName());
//        System.out.println(employee.getAge());
//        System.out.println(employee.getDob());
        System.out.println(employee);


        //System.out.println(employee.getName().toLowerCase());


       // try {
            Thread.sleep(100);
//        } catch (InterruptedException e) {
//           e.printStackTrace();
//       }
        //employee.getDate().setTime(new Date().getTime());
        //Or
        Date d1 = employee.getDob();
//        System.out.println(address1);

        d1.setTime(new Date().getTime());

        Address address1 = employee.getAddress();
        address1.setCity("hello");
        address1.getHouseBuyDate().setTime(new Date().getTime());

//        System.out.println(address1.hashCode());

       // System.out.println(employee.hashCode());
//        System.out.println(employee.hashCode());
//        System.out.println(employee.getName());
//        System.out.println(employee.getAge());
//        System.out.println(employee.getDob());
        System.out.println(employee);
        System.out.println("-------------------------");
        //Collections
        List list = new ArrayList();
        list.add("hello");
        list.add("hello 1");
        List xxx= List.of("ffhd", "fdfd");
        //List xx= Collections.unmodifiableList(list);// Making immutable
//        xxx.add("rahul");//Unmodeable
//        xxx.add("rahu");
        System.out.println(xxx);

//        xx.add("rahul");//Unmodeable
//        xx.add("rahu");
//        System.out.println(xx);




    }








}
