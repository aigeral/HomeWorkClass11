package HW11;

public class Arrays4Columns {
    public static void main(String[] args) {
       //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    //Develop a program which will identify /print the even numbers only.

     int [] [] Numbers={{3,6,89},
             {45,63,88,22},
             {23,66,98,45}};

     for(int i=0;i< Numbers.length;i++){
         for(int j=0;j< Numbers[i].length;j++){
             if(Numbers[i][j]%2==0){
                 System.out.println(Numbers[i][j] + " ");
             }

             }
         }
     }







    }


























