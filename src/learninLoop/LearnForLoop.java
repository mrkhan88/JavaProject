package learninLoop;

import java.sql.SQLOutput;

public class LearnForLoop {

    public static void main(String[] args) {

        for (int i=0; i<3; i++){
            System.out.println("I am an Automation Engineer "+i);

            for (int j=0; j<2; j++){
                System.out.println("I m inside nested for loop "+j);
            }

        }

        /*for (int i=2; i<=8; i++){
            // Parent Loop
            System.out.println("We love to eat Pizza");

            for (int j= 5; j<=7; j++){
                // child Loop/ Nested Loop
                System.out.println("We also love to drink Coffee "+j);
            }
        }*/



    }

}
