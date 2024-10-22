package com.dsa.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set {


    public List<Integer> findCurrency(List<Integer> votes) {

        HashSet<Integer> set = new HashSet<>();
        for(int num: votes){
            if(set.add(num) == false){
                set.add(num);
            }

        }

        String s = "";
        String[] atr = s.split("");
        StringBuilder sb = new StringBuilder();


        return new ArrayList<>(set);

    }
}

