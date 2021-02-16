package LeariningIfElse;

public class SwitchCase2 {

    public static void main(String[] args) {

        int num =7;
        String carModel;

        switch (num){
            case 1:
                carModel="Tesla Model3";
                break;
            case 2:
                carModel="Audi q5";
                break;
            case 3:
                carModel="Bmw x5";
                break;
            case 4:
                carModel="Toyta Avalon";
                break;
            case 5:
                carModel="Acura Mdx";
                break;
            default:
                carModel="Toyota Camry";
                break;
        }
        System.out.println("The selected car Model is "+carModel);


    }

}
