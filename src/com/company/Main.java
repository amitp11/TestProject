package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String a = "abc";
        String b = "pqr";
        //mergeAlternately(a,b);
        System.out.println("Hello World");
        String str1 = "ABCABC", str2 = "ABC";
        //gcdOfStrings(str1,str2);
        int[] a1 = {1,3},a2={2};
        double d = findMedianSortedArrays(a1,a2);
        System.out.printf("Value of D -> "+d);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int a = nums1.length, b= nums2.length;
        int[] mergedArray = new int[a+b];
        int k =0;
        for(int i=0;i<a;i++)
            mergedArray[k++] = nums1[i];
        for(int i=0;i<b;i++)
            mergedArray[k++] = nums2[i];
        Arrays.sort(mergedArray);
        int total = mergedArray.length;
        if(total%2==1)
            return (double) mergedArray[total/2];
        else {
            double m1 = mergedArray[total / 2];
            double m2 = mergedArray[total / 2 - 1];
            return ((double)m1+(double)m2)/2.0;
        }
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
