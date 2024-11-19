package com.ext.lect.immutable;

import javax.xml.crypto.Data;
import java.util.Date;

public final class Employee {

//    private final String name = "rahul"; //Reflection api with the help of this we can changes access of any variable and function
//    private final int age = 123;

    private final String name; //Reflection api with the help of this we can changes access of any variable and function
    private final int age;
    private final Date dob;
    private final Address address;

//    public Employee() {
//     }

    public Employee(String name, int age, Date dob, Address address) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address  = address;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }


//    public Date getDob() {
//        return dob;
//    }

    //instead of this, send copy or clone

//    public Date getDob() {
//        return new Date(this.dob.getTime());
//    }

    public Date getDob() {
        return (Date) dob.clone();
    }

    public Address getAddress() {
        return address;
    }

//    public Address getAddress() {
//        return new Address(address.getHouseNo(), address.getCity(), address.getState(), new Date());
//    }

//    public Address getAddress() {
//        return address.clone();
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
