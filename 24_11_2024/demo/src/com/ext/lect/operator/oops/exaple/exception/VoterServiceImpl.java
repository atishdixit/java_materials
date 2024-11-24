package com.ext.lect.operator.oops.exaple.exception;

import java.io.File;

public class VoterServiceImpl implements VoterServiceInfc{

//    @Override
//    public boolean isEligibleVoter(Voter voter) {
//        if(voter.getAge()>=18){
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean isEligibleVoter(Voter voter) {
        if(voter.getAge()>=18){
            throw new VoterEligibilityException(voter.getName() +" is not eligible for Voting..");
        }
        return true;
    }

//    @Override
//    public boolean isEligibleVoter(Voter voter){
//        int statusCode=0;
//        boolean flag = true;
//        if(voter.getAge()<10){
//            flag =false;
//            statusCode=100;
//        } else if(voter.getAge()<10){
//            flag = false;
//            statusCode=200;
//        }else if(voter.getAge()<10){
//            flag = false;
//            statusCode=300;
//        }
//        if(!flag){
//            throw new VoterEligibilityException(voter.getName() +" is not eligible for Voting..", statusCode);
//        }
//        return flag;
//    }
}
