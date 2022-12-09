package org.example;

import org.junit.Assert;
import org.junit.Test;


public class DailyPlannerTest {
    String[] planList = {"e1000wewewe", "ef2c223", "dvdfd33ddfd", "rerer4000vvdv"};
    private final DailyPlanner dailyPlanner = new DailyPlanner();

    @Test
    public void getDailyPlan1() {
        String actualResult = dailyPlanner.createDailyPlan(planList);
        Assert.assertEquals(String.format("Test failed with input params %s. Your result = %s\n",
                "1,2,5,6", actualResult), "My plans:\n" +
                "1.) e1000wewewe;\n" +
                "2.) ef2c223;\n" +
                "3.) dvdfd33ddfd;\n" +
                "4.) rerer4000vvdv;", actualResult);
        System.out.println(actualResult);
    }
}
