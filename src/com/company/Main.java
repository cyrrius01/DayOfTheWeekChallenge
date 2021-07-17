package com.company;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek("MONDAY");
        printDayOfTheWeek(5);
    }

    private static void printDayOfTheWeek(String day) {


        switch(day.toLowerCase()) { // convert to lowercase so search works regardless of input
            case "monday":         // must be sure to test for lowercase
                System.out.println("1");
                break;
            case "tuesday":
                System.out.println("2");
                break;
            case "wednesday":
                System.out.println("3");
                break;
            case "thursday":
                System.out.println("4");
                break;
            case "friday":
                System.out.println("5");
                break;
            case "saturday":
                System.out.println("6");
                break;
            case "sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("Invalid day");
        }

        if(day.toLowerCase().equals("monday")) {
            System.out.println("1");
        } else if(day.toLowerCase().equals("tuesday")) {
            System.out.println("2");
        } else if(day.toLowerCase().equals("wednesday")) {
            System.out.println("3");
        } else if(day.toLowerCase().equals("thursday")) {
            System.out.println("4");
        } else if(day.toLowerCase().equals("friday")) {
            System.out.println("5");
        } else if(day.toLowerCase().equals("saturday")) {
            System.out.println("6");
        } else if(day.toLowerCase().equals("sunday")) {
            System.out.println("7");
        } else {
            System.out.println("Invalid day");
        }

    }

    private static void printDayOfTheWeek(int day) {

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        if(day==1) {
            System.out.println("Monday");
        } else if(day==2) {
            System.out.println("Tuesday");
        } else if(day==3) {
            System.out.println("Wednesday");
        } else if(day==4) {
            System.out.println("Thursday");
        } else if(day==5) {
            System.out.println("Friday");
        } else if(day==6) {
            System.out.println("Saturday");
        } else if(day==7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }

    }
}
