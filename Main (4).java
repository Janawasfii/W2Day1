package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//EX1
       /* int[] num = new int[7];
        int[] numbers = {50, -20, 0, 30, 40, 60,10};
        boolean equal=true;
        if (numbers[0]==numbers[6]){
        equal =true;
        }
        else{
            equal=false;

        }System.out.println(equal);*/
//EX2
       /* int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];}
        double avg = sum / numbers.length;
        System.out.printf("The average of the said array is:.%1F " + avg);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int i = 0; i < numbers.length; i++){
        if (numbers[i] > avg) {
        System.out.print(numbers[i]+" ");}}*/
//EX3
           /* int[] numbers = {20, 30, 40};
            int firstNum = numbers[0];
            int lastNum = numbers[numbers.length - 1];
            int largeValue;
            if (firstNum > lastNum) {
            largeValue = firstNum;}
            else {
            largeValue = lastNum;}
            System.out.println("Larger value between first and last element: " + largeValue);*/
//EX4
           /* int[] num = {20, 30, 40};
            int[] newArray = new int[num.length];
            newArray[0] = num[num.length - 1];
            newArray[num.length - 1] = num[0];
            for (int i = 1; i < num.length - 1; i++) {
            newArray[i] = num[i];}
            System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));*/

//EX5
        /*int[] numbers = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        int Ind = 0;
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 != 0) {
        int temp = numbers[i];
        numbers[i] = numbers[Ind];
        numbers[Ind] = temp;
        Ind++;}}
        System.out.print("[");
        for (int num : numbers) {
        System.out.print(num + ",");}
        System.out.println("]");*/

//EX6
                int[] Arr1 = {2, 3, 6, 6, 4};
                int[] Arr2 = {2, 3, 6, 6, 4};
                boolean areEqual = true;
                if (Arr1.length != Arr2.length) {
                areEqual = false;
                } else {
                for (int i = 0; i < Arr1.length; i++) {
                if (Arr1[i] != Arr2[i]) {
                areEqual = false;
                break;}}}
                System.out.println(areEqual);
            }
        }












