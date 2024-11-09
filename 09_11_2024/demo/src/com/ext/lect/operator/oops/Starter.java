package com.ext.lect.operator.oops;

import com.ext.lect.operator.oops.inher.Human;

public class Starter {

    public static void main(String[] args) {
//        Human human = new Human();
//        human.setName("Raman");
//        System.out.println(human.getName());

//        Student student =  new Student("Rahul"); //special function
//        int         num =  student.no();
//        //
//        student.name = "Rahul";
//        student.age = 17;
//        student.std = "10th";

          //Student student =  new Student("Rahul"); //special function
        //Student student =  new Student("Rahul", 10);
        //Student student =  new Student("Rahul", "10th");
//        student.age = 17;
//        student.std = "10th";
//        Student student =  new Student("Rahul", "10th", 15);
//        student.show();

//        //
//        Student student = new Student();
//        System.out.println(student.getFirstName());

        Student student = populateStudentDetails(new Student());
        showStudentDetails(student);




//        student.name = "4898";
//        student.age = 18222;
//        student.std="fkefkjgh";
//        student.setName("   w    w   ");
//        student.setAge(0);
//        student.setSTD(-5);
//        student.show();




    }

    /**
     *
     *
     * public class Test {
     *
     *     public  Test(int a){
     *
     *     }
     *
     * 	public show(){
     * 		soup("hello")
     *        }
     * }
     *
     * public class Starter {
     *
     *     public static void main(String[] args) {
     * 		Test t = new Test();
     * 		t.show();
     *     }
     *
     * }
     *
     * CTE
     *
     */

    public static Student populateStudentDetails(Student student){
        student.setFirstName("Hello");
        student.setLastName("Hi");
        return student;
    }

    public static void showStudentDetails(Student student){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }


}
