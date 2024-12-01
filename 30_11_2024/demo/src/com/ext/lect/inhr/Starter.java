package com.ext.lect.inhr;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Location location01 =  new Location("01");
        Location location02 =  new Location("02");
        CoastalLocation cl01 = new CoastalLocation("03", "97");
        CoastalLocation cl02 = new CoastalLocation("03", "99");
        List locations = new ArrayList();
        locations.add(location01);
        locations.add(location02);
        locations.add(cl01);
        locations.add(cl02);

        System.out.println("Rating factor is "+calculateRatingFactor(locations));
    }

    private static double calculateRatingFactor(List locations) {
        double ratingFactor = 23;
        if(locations!=null){

            for(int i=0; i< locations.size();i++){
                if (locations.get(i) instanceof CoastalLocation){
                    CoastalLocation location = (CoastalLocation) locations.get(i);
                    double coastalFactor;

                    if(location.getCoastalLocationCd() == "99"){
                        coastalFactor = 1.2;
                    } else if (location.getCoastalLocationCd().equals("98")){
                        coastalFactor = 1.5;
                    } else {
                        coastalFactor = 1;
                    }
                    //
                    if(Integer.parseInt(location.getLocationCd())<2){
                        ratingFactor = ratingFactor*coastalFactor*1.3;
                    } else if(Integer.parseInt(location.getLocationCd())<5){
                        ratingFactor = ratingFactor*coastalFactor*1.5;
                    } else {
                        ratingFactor = ratingFactor*coastalFactor*2;
                    }

                } else {
                    Location location = (Location) locations.get(i);
                    if(Integer.parseInt(location.getLocationCd())<2){
                        ratingFactor = ratingFactor*1.3;
                    } else if(Integer.parseInt(location.getLocationCd())<5){
                        ratingFactor = ratingFactor*1.5;
                    } else {
                        ratingFactor = ratingFactor*2;
                    }
                }
            }
        }
        return ratingFactor;
    }


    static class Location{
        private String locationCd;

        public Location(String locationCd) {
            this.locationCd = locationCd;
        }

        public String getLocationCd() {
            return locationCd;
        }

        public void setLocationCd(String locationCd) {
            this.locationCd = locationCd;
        }
    }

    static class CoastalLocation{
        private String locationCd;
        private String coastalLocationCd;

        public CoastalLocation(String locationCd, String coastalLocationCd) {
            this.locationCd = locationCd;
            this.coastalLocationCd = coastalLocationCd;
        }

        public String getCoastalLocationCd() {
            return coastalLocationCd;
        }

        public void setCoastalLocationCd(String coastalLocationCd) {
            this.coastalLocationCd = coastalLocationCd;
        }

        public String getLocationCd() {
            return locationCd;
        }

        public void setLocationCd(String locationCd) {
            this.locationCd = locationCd;
        }
    }

}
