package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56) || new Integer(56)
        int myInt = myIntValue; // myIntValue.intValue()
    }
}
