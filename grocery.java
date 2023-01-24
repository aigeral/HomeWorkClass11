package HW11;

import java.util.Arrays;

public class grocery {
    public static void main(String[] args) {
        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops
    String [] []grocery={{"Carrots","Cucumbers","Tomato","Broccoli"},{"Peach","Apples","Grapes","Mango"},{"Milk","Cereal","eggs","Yogurt"},
            {"Cookies","Cake","Biscuit","Chocolate"}};
    for(int i=0; i<grocery.length;i++){
        for(int j=0;j<grocery[i].length;j++){
            System.out.println(grocery[i][j]+" ");
        }
    }
        System.out.println("*************************");

    for(String [] List:grocery){
        System.out.println(Arrays.toString(List));
    }







            }
        }


















