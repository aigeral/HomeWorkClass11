package HW11;

import java.util.Arrays;

public class cars {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String [] []Cars= {{"American", "German", "Korean", "Italian"},
                {"Ford","Mercedes","Hyundai","Lamborghini"}};
        for(int i=0;i<Cars.length;i++){
            for(int j=0;j<Cars[i].length;j++){
                System.out.println(Cars[i][j]+ " ");
            }}
        System.out.println("***********************");


        for(String []CountryBrands:Cars){
            System.out.println(Arrays.toString(CountryBrands));
        }



            }
        }


















