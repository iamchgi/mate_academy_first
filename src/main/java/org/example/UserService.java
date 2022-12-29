package org.example;

import java.util.Arrays;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String item : records) {
            String[] record = item.split(":");
            if (record[0].equals(email)) {
                return Integer.valueOf(record[1]);
            }
        }
            throw new UserNotFoundException("User with given email doesn't exist");
    }
}
