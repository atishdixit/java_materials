package com.ext.lect;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
//        String str = """
//                kghdjg khdj kjhkjdsg hksdg
//                dkfhkjd sdfhgjgh jhjhfsd
//                fhssdfh sdfhsufjhfjf
//                skdhsdjgfgf
//                sdhfsdfhkf
//                dshdh
//                jdhf
//                db
//
//
//                """;
//        Scanner scanner = new Scanner(str);

//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter something");
//        while (scanner.hasNextInt()){
//            System.out.println(scanner.nextInt() * 2);
//      }

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please provide input");
//
//        while (scanner.hasNext()){
//
//            String data = scanner.next();
//            if(data.equals("Exit")){
//                System.out.println("Exiting from program");
//                break;
//            } else {
//                System.out.println(data);
//            }
//            System.out.println("Please provide input");
//        }
        String data = "";

        do{
            System.out.println("Please provide input");
            data = scanner.next();
            System.out.println(data);


        }while (!data.equals("Exit"));

//        if(data.equals("Hello")){
//            System.out.println("Hi");
//        } else if (data.equals("Hi")){
//            System.out.println("Hello");
//        }


    }
}
