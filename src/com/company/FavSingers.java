package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class FavSingers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        long maxo=0,result=0;
        for(int i=0;i<n;i++){
            long a = sc.nextLong();
            map.put(a,map.getOrDefault(a,0)+1);
            maxo = Math.max(maxo,map.get(a));
        }
        for(Long i:map.keySet()){
            if(map.get(i)==maxo){
                result++;
            }}
        System.out.println(result);
    }
}
