package learninLoop;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int rownumber = input.nextInt();

        for(int i=1; i<=rownumber; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
