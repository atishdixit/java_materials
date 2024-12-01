package com.ext.lect.immutable;

import java.util.Date;
//Step implements Cloneable
// if you will not implement cloneable interface what will happen
// wil get exception
//CloneNotSupportedException
public class Address implements Cloneable{
    private int houseNo;
    private String city;
    private String state;
    private Date houseBuyDate;

    public Address(int houseNo, String city, String state, Date houseBuyDate) {
        this.houseNo = houseNo;
        this.city = city;
        this.state = state;
        this.houseBuyDate = houseBuyDate;


        // suppose india--> City
       // if(listOfCilies contains city)
        //this.city = city;
        //else nope
        // State-->

        //it should be particaular



    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getHouseBuyDate() {
        return houseBuyDate;
    }

    public void setHouseBuyDate(Date houseBuyDate) {
        this.houseBuyDate = houseBuyDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", houseBuyDate=" + houseBuyDate +
                '}';
    }

//    @Override
//    protected Object clone() {
//        Object obj = null;
//        try {
//            obj =  super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//
//        }
//
//        return obj;
//    }


    //Shallow
//    @Override
//    protected Address clone() {
//        Address obj = null;
//        try {
//            obj = (Address) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//
//        return obj;
//    }

    //Deep
    @Override
    protected Address clone() {
        Address obj = null;
        try {
            obj = (Address) super.clone();//down casting
           // obj.setHouseBuyDate(new Date(obj.getHouseBuyDate().getTime()));//
            //or
            Date d = (Date) obj.getHouseBuyDate().clone();
            obj.setHouseBuyDate(d);//
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }

    //    @Override
//    public Address clone(){
//        Address address = null;
//        try {
//            address =  (Address) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return address;
//    }
}
