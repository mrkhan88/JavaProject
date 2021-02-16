package LeariningIfElse;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number: ");

        int id = input.nextInt();

        String name;

        switch (id){

            case 1:
                name = "James Gosling";
                break;

            case 2:
                name = "Robinson cruso";
                break;

            case 3:
                name = "Mamun Khan";
                break;

            case 4:
                name="Simon stewart";
                break;

            case 5:
                name= "Henry";
                break;
            default:
                //System.out.println("No matching name found.");
                name="No matching name found.";

        }
        System.out.println("The name is: "+name);

    }


}
