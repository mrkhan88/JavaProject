package oopInhertence;

public class Test {

    public static void main(String[] args) {

//        Vehicles vh = new Vehicles();
//        vh.audi();
//        vh.bmw();
//        vh.tesla();
//
//        Suv sv = new Suv();
//        sv.bmw();
//        sv.tesla();
//        sv.audi();
//        sv.hondaCrv();
//        sv.tesla();

        Vehicles vh1 = new Suv();
        vh1.bmw();
        vh1.tesla();

//
//        Sedan sdn = new Sedan();
//        sdn.ToyotaAvalon();
//        sdn.audi();
//        sdn.tesla();
//        sdn.hondaCrv();
//
//        Suv sv1 = new Sedan();  //classname obj name = new constructor();
//        sv1.tesla();
//        sv1.audi();

        Sedan s = new Sedan();
        s.ToyotaAvalon();








    }



}
//As you can see in the above diagram that when a class has more than one child classes (sub classes) or in other words more than one child classes
// have the same parent class then this type of inheritance is known as hierarchical inheritance.