package Arrays2D;

public class ArrayDemo {

    public static void main(String[] args) {
        String[] stnames = new String[3];    //   3-1=2

        stnames[0]="Fahim";
        stnames[1]="Zima";
        stnames[2]="Nahid";

        //System.out.println(stnames[2]);

        for(int i=0; i<stnames.length; i++){
            System.out.println("Names are: "+stnames[i]);
        }

        for(String eachName : stnames){
            System.out.println(eachName);
        }









    }





}
