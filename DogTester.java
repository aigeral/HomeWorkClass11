package HW11;

public class DogTester {
    public static void main(String[] args) {
        //Create a Dog Class and create 3 different objects of it:
        // Husky, Bulldog, Labrador  with specific  attributes and
        // behaviors.

           Dog Husky=new Dog();
           Husky.name="Husky";
           Husky.coat="Dense,double coat";
           Husky.exercise="2 hours";
           Husky.size="medium";
           Husky.breedGroup="Spitz";
           Husky.temperament="friendly,playful,intelligent";

        System.out.println(Husky.name);
        Husky.bark();

        System.out.println("*****************");


           Dog Bulldog=new Dog();
           Bulldog.name="Bulldog";
           Bulldog.coat="short and smooth";
           Bulldog.exercise="30 minutes";
           Bulldog.size="medium";
           Bulldog.breedGroup="Utility";
           Bulldog.temperament="Loyal, friendly, easy-going";

        System.out.println(Bulldog.name);
        Bulldog.food();

        System.out.println("*****************");


        Dog Labrador=new Dog();
        Labrador.name="Labrador";
        Labrador.coat="short and smooth";
        Labrador.exercise="2 hours";
        Labrador.size="large";
        Labrador.breedGroup="GunDog";
        Labrador.temperament="Easy-going, loyal, affectionate";

        System.out.println( Labrador.name);
        Labrador.activities();















    }
}
