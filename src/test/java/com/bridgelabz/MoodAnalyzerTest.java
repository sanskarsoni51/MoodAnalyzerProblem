package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer Analyze = new MoodAnalyzer();
    Assert Assertions = null;

    @Test
    public void MoodIsSad(){
        String mood = Analyze.AnalyzeMood("I am in sad mood");

        Assertions.assertEquals("SAD!",mood);
    }

    @Test
    public void MoodIsHappy(){
        String mood = Analyze.AnalyzeMood("I am in happy mood");

        Assertions.assertEquals("HAPPY!",mood);
    }

}
