package HW11;

public class PhoneTester {
    public static void main(String[] args) {

        // Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.


        Phone iphone=new Phone();
        iphone.name = "Iphone";
        iphone.OSystem = "iOS16";
        iphone.memory = "8GB-256GB";
        iphone.price = 799;
        iphone. display = 6;
        iphone.pixel = "460ppi";

        System.out.println(iphone.name);
        iphone.camera();

        System.out.println("-------------------------------------");

        Phone samsung = new Phone();
        samsung.name = "Samsung";
        samsung.OSystem = "Android";
        samsung.memory = "8GB-256BG";
        samsung.price = 900;
        samsung.display = 6;
        samsung.pixel = "425ppi";

        System.out.println(samsung.name);
        samsung.directory();

        System.out.println("--------------------------------------");

        Phone pixel =new Phone();
        pixel.name = "Pixel";
        pixel.OSystem = "Pixel";
        pixel.memory = "8GB-128GB";
        pixel.price = 569;
        pixel.display = 6;
        pixel.pixel = "416ppi";

        System.out.println(pixel.name);
        pixel.internet();

    }


}