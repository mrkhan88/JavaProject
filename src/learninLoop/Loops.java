package learninLoop;

public class Loops {
    public static void main(String[] args) {

        for (int i=10; i>0; i--){
            System.out.println("i value is "+i);
        }

        System.out.println("*************************");

        int[] id = new int[10];
        id[0]=101;
        id[1]=102;
        id[2]=103;
        id[3]=104;
        id[4]=105;
        id[5]=106;
        id[6]=107;
        id[7]=108;
        id[8]=109;
        id[9]=110;

        for(int i=0; i<id.length; i++){
            System.out.println("The id's are "+id[i]);
        }
        System.out.println("************************");

        for (int obj : id){
            System.out.println("The id's are "+obj);
        }


    }



}
