package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.menu();
    }

//    public static int[] getIntegers(){
//        Scanner in = new Scanner(System.in);
//        int[] array = new int[5];
//        for(int i = 0; i < array.length; i++){
//            array[i] = in.nextInt();
//        }
//        in.close();
//        return array;
//    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//    }
//
//    public static void swap(int[] array, int index){
//        int temp = array[index - 1];
//        array[index - 1] = array[index];
//        array[index] = temp;
//    }
//
//    public static int[] sortArray(int[] array){
//        boolean swapCalled = true;
//        while(swapCalled){
//            swapCalled = false;
//            for(int i = 1; i < array.length; i++) {
//                if (array[i] > array[i - 1]) {
//                    swap(array,i);
//                    swapCalled = true;
//                }
//            }
//        }
//        return array;
 //   }
}
