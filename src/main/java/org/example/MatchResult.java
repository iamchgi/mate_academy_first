package org.example;

public class MatchResult {

    public int matchResult(int result1, int result2, int bet1, int bet2) {
        //Write code below this line;
        int ret;
        ret = ((result1 == bet1 && result2 == bet2) ? 2 : (result1 - result2 == bet1 - bet2) ? 1 :
                ((result1 - result2) * (bet1 - bet2) > 0) ? 1 : 0);
        return ret;

        //Write code above this line
    }
}
