package com.company;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        //int[] intArray = new int[10];
        int[] numArray = {1,2,3,4,5,6,7,8,9,10};
        String stringArray[] = {"foo", "bar", "baz", "qux"};
//        int min;
//        int max;
//        //int sum = 0;
//        double avg;
//        System.out.println("the total is "+ total(numArray));
//        System.out.println("the odd total is "+ totalOdd(numArray));
//        System.out.println("the even total is "+ totalEven(numArray));
//        System.out.println("the larger is " + secondLargestNumber(numArray));
//        System.out.println("the swaped words "+ swapFirstAndLast(stringArray));
//        System.out.println("Reverse array is " + Arrays.toString((reverseArray(numArray))));
//       System.out.print("divde by three string is " + everyThird(numArray));
//        System.out.print("divde every five num is " + returnLessThanFive(numArray));
//        System.out.println(everyThird(numArray));
        System.out.println(lessThanFive(numArray));
    }//end of main

    public static int total(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }//endof forloop
        return sum;
    }//endof total

    public static int totalOdd(int[] array) {
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                oddSum += array[i];
            }

        } //endof for
        return oddSum;
    }//endof totalodd

    public static int totalEven(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum += array[i];
            }

        } //endof for
        return evenSum;
    }//endof totalEven

    public static int secondLargestNumber(int[] intArray) {
        int largest = 0;
        int middle = intArray[1];
        int secondLargest = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > largest) {
                secondLargest = largest;
                largest = intArray[i];

            } else if (intArray[i] > secondLargest) {
                secondLargest = intArray[i];
            } else if (intArray[i] < 0) {
                return middle;

            }
        }//endof forloop
        return secondLargest;
    }//endof secondLargestNumber

    public static String[] swapFirstAndLast(String[] stringArray) {

        String temp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = temp;

        return stringArray;
    }// end of swapFirst

    public static int[] reverse(int[] swapNumber) {

        int[] newArray = new int[swapNumber.length];
        int temp = 0;
        for (int i = 0; i < swapNumber.length / 2; i++) {
            temp = swapNumber[i];
            swapNumber[i] = swapNumber[swapNumber.length - i - 1];
            swapNumber[swapNumber.length - i - 1] = temp;

        }

        newArray = swapNumber;


        return newArray;


    }

    public static String concatenateString(String[] stringArray) {

        String combinedString = "";
        for (int i = 0; i < stringArray.length; i++) {
            combinedString += stringArray[i];
        }

        return combinedString;
    }// end of swapFirst

    public static int[] everyThird(int[] third) {
        int myArray [] = new int[third.length];
        if (third.length < 3) {
           return null;

        }

        for (int i = 2; i < third.length; i += 3) {
            if(third[i] != 0) {
                myArray[i] = third[i];

            }


        }
            System.out.println("this is teh array" + Arrays.toString(myArray));
            return myArray;
//
    }
    public static int [] lessThanFive(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                newArray[i] = array[i];
            }//else return null;
        }

        return newArray;
    }

}//endof class
