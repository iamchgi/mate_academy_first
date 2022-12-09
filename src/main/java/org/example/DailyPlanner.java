package org.example;

public class DailyPlanner {

    public  String createDailyPlan(String[] plans) {
        StringBuilder rez = new StringBuilder("My plans:");
        int i = 1;
        for (String item : plans) {
            rez.append("\n").append(i).append(".) ").append(item).append(";");
            i++;
        }
        String rezult = rez.toString();
        System.out.printf(rezult);
        return rezult;
    }
}
