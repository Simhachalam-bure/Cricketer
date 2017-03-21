package com.example.admin.cricketer;

/**
 * Created by Admin on 3/21/2017.
 */

public class CricketModel {
    String name;
    String city;
    int matches;
    int runs;
    double strikerate;

    public CricketModel(String name, String city,int matches,int runs,double strikerate){

        this.name=name;
        this.city=city;
        this.matches=matches;
        this.runs=runs;
        this.strikerate=strikerate;

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }
        public int getMatches(){
             return matches;
        }

        public int getRuns(){
            return runs;
        }

        public double getStrikerate(){
            return strikerate;
        }
    }
}
