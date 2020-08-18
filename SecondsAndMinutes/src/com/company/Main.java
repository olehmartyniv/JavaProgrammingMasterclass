package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(650, 59));
        System.out.println(getDurationString(3665));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        return String.format("%02d", minutes / 60).concat("h ") + String.format("%02d", minutes % 60).concat("m ")
                + String.format("%02d", seconds).concat("s");
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
}
