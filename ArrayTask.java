package HW11;

public class ArrayTask {
    public static void main(String[] args) {
        //Create a 2D array(shorter way) in which first array will consist
        // of 4 names and second array will contain grades.
        // Then your program should print name of the students
        // that has A and B grade
   String [] [] Grade={{"Michael","Niko","Dastan","Medina"},{"A","B","C","D"}};
   for (int i=0;i < Grade[0].length;i++){
       for(int j=0;j< Grade[1].length;j++){
           if (i==0 & j==2){
               System.out.println(Grade[i][j]+ " "+ "Your grade is A");
           }else if (i==0 &j==3){
               System.out.println(Grade [i][j]+ " "+ "Your grade is B");
           }
            }
        }



    }
}














