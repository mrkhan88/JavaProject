package Arrays2D;

public class Demo3DArray {

    public static void main(String[] args) {

        String [][][] stInfo = new String[2][3][3];

        stInfo[0][0][0]="St_Id";
        stInfo[0][0][1]="FirstName";
        stInfo[0][0][2]="LastName";

        stInfo[0][1][0]="101";
        stInfo[0][1][1]="Nahid";
        stInfo[0][1][2]="Rahman";

        for(String[][] names : stInfo){

            for(String [] ename : names ){

                for(String stn : ename){
                    System.out.print(stn+" ");
                }
                System.out.println();
            }


        }







    }





}
