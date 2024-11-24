package com.ext.lect.immutable;

import java.io.*;
import java.util.Date;

public class Tester implements Serializable{

    private Date date = new Date();


    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Tester employee =new Tester();
        System.out.println(employee);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(employee);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Tester deepCopy = (Tester)ois.readObject();
        Thread.sleep(20000);
        deepCopy.date.setTime(new Date().getTime());
        System.out.println(deepCopy);
        System.out.println(employee);

        System.out.println(deepCopy.hashCode());
        System.out.println(employee.hashCode());
    }

    @Override
    public String toString() {
        return "Tester{" +
                "date=" + date +
                '}';
    }
}
