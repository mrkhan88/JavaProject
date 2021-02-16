package Arrays2D;

public class Learn3DArray {

    public static void main(String[] args) {

        String [][][] stInfo = new String[2][3][3];
        // dataType [][][] variableName = new datType [size][rowNum][columnNumber];
        //size means how many set of data to be input 

        stInfo[0][0][0]="Sl";
        stInfo[0][0][1]="StFirstName";
        stInfo[0][0][2]="StLastName";

        stInfo[0][1][0]="101";
        stInfo[0][1][1]="Md Mamunur";
        stInfo[0][1][2]="Khan";

        stInfo[0][2][0]="102";
        stInfo[0][2][1]="Syed Hasnath";
        stInfo[0][2][2]="Ali";

        for(String std[][] : stInfo){
            //convrt to 2D from #3D

            for (String st[] : std) {
                //convert to 1D from 2D

                for(String stdetail : st){
                    //get value
                    //System.out.println(stdetail);
                    System.out.print(stdetail+" ");
                }
                System.out.println();

            }
        }



    }








}
