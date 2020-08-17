package com.company;

public class BarkingDog {

    public static boolean  shouldWakeUp( boolean barking, int hourOfDay) {

        boolean isAwake = false;

        if (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23)) {
            isAwake =  true;
        }

        return isAwake;
    }
}
