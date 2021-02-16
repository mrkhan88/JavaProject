package learning;

public class LearningExceptionHandling {

    public static int division(int num1, int num2){
        int result=0;

        try {
           result =  num1/num2;

        }
        catch (Exception excep){
            //excep.printStackTrace();
            System.out.println("Exception found");
        }
        finally {
            System.out.println("Finally block must be executed");
        }
        return result;
    }


    public static void main(String[] args) {
        //LearningExceptionHandling.division(100,0);
        System.out.println(LearningExceptionHandling.division(100,6));
    }


}
