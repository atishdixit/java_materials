package com.ext.lect.operator.oops.exaple.exception;

/**
 * Crit:
 * if Person age >= 10, the he can vote otherwise throw exception
 */
public class Voter {

    private String name;
    private String voterId;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
