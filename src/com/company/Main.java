package com.company;
//9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
//Write a program that will print out all matching pairs from arrays 1 and 2.
//Expected output:
//(7,7) and (6,6)


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array1 = {1,7,6,5,9};
        int[] array2 = {2,7,6,3,4};

        //use nested for loops
        for(int counter=0; counter<array1.length; counter ++ ){
            for(int count=0; count<array2.length; count++){
                if (array1[counter]==array2[count]){
                    System.out.println(array1[counter] + "," + array2[count]);
                }
            }
        }
    }
}
