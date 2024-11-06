package org.example.lab6.firstpart;
import java.util.Scanner;
import java.util.Arrays;

class BinarySearch{

    public static boolean searchSecondWay(int[] arr , int searchedValue){
        if(Arrays.binarySearch(arr , searchedValue) >= 0 )
            return true;
        else return false;
    }

    public static boolean search(int[] array , int searchedValue){
        boolean result = false;
        int l = 0, r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == searchedValue) {
                result = true;
                break;
            }
            if (array[m] < searchedValue)
                l = m + 1;
            else {
                r = m - 1;
            }
        }
        return result;
    }
}

class Main {

    public static int smallest(int[]array){
        int smallestValue = array[0];
        for (int value : array){
            if (smallestValue > value){
                smallestValue = value;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array){
        int smallestIndex = 0;
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallestNumber){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array , int index){
        int smallestIndex = index;
    int smallestNumber = array[index];
    for (int i = index; i < array.length; i++){
        if (array[i] < smallestNumber){
            smallestIndex = i;
        }
    }
    return smallestIndex;
    }

    public static void swap(int[] array , int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args){
//                                              TASKS 1,2,3,4
//    int[] values = {-1, 6, 9, 8, 12};
//        System.out.println("Smallest: " + smallest(values));
//        System.out.println("Index of the smallest: " + indexOfSmallest(values));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//        System.out.println(Arrays.toString(values));
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));

        int[] array = {-1, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println(result);
        boolean result2 = BinarySearch.searchSecondWay(array, Integer.parseInt(searchedValue));
        System.out.println(result2);
    }

}
