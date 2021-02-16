package learning;

public class StaticVariables {

    int num=87689234;
    static String name="Mamun ";

    public static void main(String [] args){
       // Static method can access static instance variable just by calling class name, and directly in sout.

        System.out.println(StaticVariables.name);

        //But Static method needs to create object of that class to access Non-static instance variable.

        StaticVariables n = new StaticVariables();
        //int nn = n.num;
        System.out.println(n.num);

        n.showInfo();
    }

    //Non Static method can access static instance variable and non static instance variable directly.
    public void showInfo(){
        StaticVariables s = new StaticVariables();


        System.out.println("From show method "+num);
        System.out.println("from Show method "+name);
    }



}
