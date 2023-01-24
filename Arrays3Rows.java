package HW11;

import java.util.Arrays;

public class Arrays3Rows {
    public static void main(String[] args) {
       //Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        // Print the sum of all numbers.

        int [] []Numbers={{34,53,12},
                {33,322,65},
                {2,43,23}};
           int sum=0;
             for(int i=0;i< Numbers.length;i++){
                 for(int j=0;j< Numbers.length;j++){
                     sum=sum+Numbers[i][j];}}

        System.out.println(sum);
                 }
             }
























