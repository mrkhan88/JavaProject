package Arrays2D;

import java.util.Scanner;

public class FindMinwithArray {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int [] numbers ={23, 12, 53, 38, 4, 14};

        //
        /*int [] numbers = new int[5];
        numbers[0]=input.nextInt();
        System.out.println("Please enter a number: ");
        numbers[1]=input.nextInt();

        System.out.println("Please enter a number: ");
        numbers[2]=input.nextInt();

        System.out.println("Please enter a number: ");
        numbers[3]=input.nextInt();

        System.out.println("Please enter a number: ");
        numbers[4]=input.nextInt();*/
        //

        FindMinwithArray.chekMin(numbers);
    }



    public static void chekMin(int num[]){
        int min = num[0];
        for(int i=0; i<num.length; i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("Mininum Number is : "+min);


    }






}
