package Arrays2D;

public class Demo2DArray {

    public static void main(String[] args) {

        String [][] stNames = new String[4][3];

        stNames[0][0]="FirstName";
        stNames[0][1]="LastName";
        stNames[1][0]="Fahim";
        stNames[1][1]="Pranta";


        for(String[] name : stNames){
            //convert 2d to 1d

            for(String eachname : name){
                //get value from the variable of parent loop
                System.out.print(eachname+" ");
            }
            System.out.println();


        }








    }




}
