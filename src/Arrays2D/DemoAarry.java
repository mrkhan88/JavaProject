package Arrays2D;

public class DemoAarry {

   static String [] [] stuNames = new String[4][2];

    public static void main(String[] args) {

        DemoAarry.stuNames [0] [0]= "Mamun";
        DemoAarry.stuNames [0] [1]= "Khan";
        DemoAarry.stuNames [1] [0]= "Hasnath";
        DemoAarry.stuNames [1] [1]= "Mamun";
        DemoAarry.stuNames [2] [0]= "Wakil";
        DemoAarry.stuNames [2] [1]= "Chy";
        DemoAarry.stuNames [3] [0]= "Mizan";
        DemoAarry.stuNames [3] [1]= "Ahmed";

//        System.out.println(stuNames[3] [1]);

        for(String[] sName: stuNames){
            //convert to 1D array from 2D

            for(String sn : sName){
                //System.out.println(sn);
                System.out.print(sn+" ");
            }
            System.out.println(); //goto new line
        }





    }



}
