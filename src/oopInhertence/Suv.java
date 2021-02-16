package oopInhertence;

public class Suv extends Vehicles {    //Child class

    public static int modelYear=2021;

    public void hondaCrv() {
    System.out.println("Honda cr-V Model 2021");
    System.out.println("Form Suv class");
}

    public void tesla(){
        System.out.println("Tesla Model x "+modelYear);
        System.out.println("Form Suv class");
    }

//when u have inheritence and same Method name with same Mehtod signature:
   // Method overRiding will happen


}
