package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.Person;

public class ListFilter {
    private static String MALE_PERSON_SEX = "male";

    private static int MAX_VALID_AGE = 27;
    private static int MIN_VALID_AGE = 18;
    @SuppressWarnings("unchecked")
    public List filter(List<Person> list) {
        List<Person> result = new ArrayList<>();
        if (list != null) {
            for (Person item : list) {
                if (item.getSex().equals(MALE_PERSON_SEX) && item.getAge() >= MIN_VALID_AGE
                        && item.getAge() <= MAX_VALID_AGE) {
                    result.add(item);
                }
            }
        }
        return result;
    }
}