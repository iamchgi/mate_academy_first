package org.example;

import java.util.List;

public class ListElementsAddition {
    public int calculateSum(List<Integer> listToSum) {
        int sum = 0;
        if (listToSum != null) {
            for (int item : listToSum) {
                sum += item;
            }
        }
        return sum;
    }
}