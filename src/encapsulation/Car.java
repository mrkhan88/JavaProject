package encapsulation;

public class Car {          //Encapsulation means data hiding.
    private String carModel;
    private int modelYear;
    private String color;
    public static String trim;

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarModel(){
        return carModel;
    }
    public void setCarModel(String carModel){
        this.carModel=carModel;
    }

    public static void trims(){
        Car.trim="Xle";
        System.out.println("Choosen trim is: "+Car.trim);
    }






}
