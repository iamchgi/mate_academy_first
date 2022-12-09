package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MatchResultTest {
    private final MatchResult matchResult = new MatchResult();
    @Test
    public void getMatchResult_1_2_5_6() {
        int actualResult = matchResult.matchResult(1,2,5,6);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "1,2,5,6",actualResult),1,actualResult);
        System.out.println(actualResult);
    }
    @Test
    public void getMatchResult_1_1_5_5() {
        int actualResult = matchResult.matchResult(1,1,5,5);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "1,1,5,5",actualResult),1,actualResult);
        System.out.println(actualResult);
    }
    @Test
    public void getMatchResult_6_5_6_5() {
        int actualResult = matchResult.matchResult(6,5,6,5);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "1,2,5,6",actualResult),2,actualResult);
        System.out.println(actualResult);
    }
    @Test
    public void getMatchResult_3_5_2_5() {
        int actualResult = matchResult.matchResult(3,5,2,5);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "3,5,2,5",actualResult),1,actualResult);
        System.out.println(actualResult);
    }
    @Test
    public void getMatchResult_3_3_2_5() {
        int actualResult = matchResult.matchResult(3,3,2,5);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "3,3,2,5",actualResult),0,actualResult);
        System.out.println(actualResult);
    }
}
