package com.ext.lect.operator.oops.exaple.exception;

public class Starter {
    public static void main(String[] args){

        //Create new Voter
        Voter voter = new Voter();
        voter.setName("Aman");
        voter.setVoterId("ABC2423243");
        voter.setAge(12);
//
//        Voter voter1 = new Voter();
//        voter1.setName("Rahul");
//        voter1.setVoterId("ABC242w3243");
//        voter1.setAge(21);

        //Create Object
        VoterServiceImpl voterService =  new VoterServiceImpl();

        //check Eligible
        boolean isEligibleVoter = false;
        try{
            isEligibleVoter = voterService.isEligibleVoter(voter);
            //Print details
            System.out.println(voter.getName() +" Is Eligible for vote "+isEligibleVoter);
        }catch (VoterEligibilityException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Closing...");


//
//
//        //check Eligible
//        isEligibleVoter = voterService.isEligibleVoter(voter1);
//
//        //Print details
//        System.out.println(voter1.getName() +" Is Eligible for vote "+isEligibleVoter);

    }
}
