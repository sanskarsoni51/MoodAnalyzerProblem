package com.bridgelabz;

public class MoodAnalyzer {
    String AnalyzeMood(String Message){

        if (Message.contains("I am in sad mood")){
            return "SAD!";
        } else if (Message.contains("I am in happy mood")) {
            return "HAPPY!";
        }

        return null;
    }

}
