package singleTonClass;

public class College {
    String collegeName="City College";

    private College(){

    }

    public static College finstance = new College();

    public static College getfInstance(){
        return finstance;
    }

    public static void main(String[] args) {
        College bb = new College();
    }





}
