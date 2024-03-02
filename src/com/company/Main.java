package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String a = "abc";
        String b = "pqr";
        //mergeAlternately(a,b);
        System.out.println("Hello World");
        String str1 = "ABCABC", str2 = "ABC";
        gcdOfStrings(str1,str2);

    }

    private static void gcdOfStrings(String str1, String str2) {
        HashSet<Character> set = new HashSet<>();
        if(str1!=null && str2!=null){
            for(Character c:str1.toCharArray()){
                if(!set.contains(c))
                set.add(c);
                else break;
            }
        }
        System.out.println(set.toString());
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
