package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for (int i = bigCount; i != 0 && goal > 4; i--) {
            goal -= 5;
        }

        for (int i = smallCount; i != 0 && goal > 0; i--) {
            goal -= 1;
        }

        return goal == 0;
    }
}
