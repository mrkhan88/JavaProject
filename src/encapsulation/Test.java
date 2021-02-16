package encapsulation;

public class Test {


    public static void main(String[] args) {

        //First we need to use set method and then get mehod to print/ or obtain value.

        Mobile model = new Mobile();
        model.setMobileModel("Iphone 12pro max");    //setter method
        System.out.println(model.getMobileModel());   //getter method

        Car carmodel = new Car();
        carmodel.setCarModel("Honda C-rv");
        System.out.println(carmodel.getCarModel());

        Car modelYear = new Car();
        modelYear.setModelYear(2021);
        System.out.println("Car Model Year: "+modelYear.getModelYear());

        Car color = new Car();
        color.setColor("Black");
        String carcolor=color.getColor();
        System.out.println("Color of the car: "+carcolor);

        Car.trims();


    }
}
