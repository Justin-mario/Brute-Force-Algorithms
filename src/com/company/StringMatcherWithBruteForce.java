package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringMatcherWithBruteForce {

    public static void main(String[] args) {

	String text = "abcabbabbaabac";
    String pattern = "abba";

    List<Integer> matchedIndexes = bruteForceStringMatcher ( text, pattern );

    for(Integer matchedIndex : matchedIndexes){
        System.out.println("Pattern found at " + matchedIndex);
    }

    if(matchedIndexes.size() == 0){
        System.out.println("Pattern not found");
    }
    }


    public static List<Integer> bruteForceStringMatcher(String text, String pattern){

        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();
        List<Integer> matchedIndexes = new ArrayList<> ();

        int textIndex;

        textIndex = 0;
        while (textIndex < textArray.length) {
            int textIndexLocal = textIndex;
            boolean isMatched = true;

            for (char c : patternArray) {
                if (textArray[textIndexLocal] != c) {
                    isMatched = false;
                    break;
                }
                textIndexLocal += 1;
            }
            if (isMatched){
                matchedIndexes.add(textIndex);
            }
            textIndex++;
        }
        return matchedIndexes;
    }
}
