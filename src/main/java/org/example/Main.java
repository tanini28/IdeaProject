package org.example;

import org.example.db.*;


public class Main {

   // public Main() {}

    //public static void main(String[] args) {
   //     Car bmw = new Car(200.5f, 2000, "Black", new byte[] {0, 0, 0, 0});
   //     bmw.engine.setValues(false, 200);
   //     bmw.engine.info();

    //    Truck truck = new Truck(130f,5000, "Green", true);
    //    truck.engine.setValues(true, 1);
    //    truck.engine.info();
       // truck.setValues(130f,5000, "Green", new byte[] {0, 0, 0, 0}, true);
        //System.out.println(truck.getValues());


     //   Car flyCar = new Car(200.5f, 2000, "White", new byte[] {0.19.20.0});
     //   @Override
     //     public String getValues() {
     //       return "Fly Car";
      //  }

     //   @Override
     //   public void moveObject() {
     //       System.out.println("object is flying");
      //  }
    //}

   // public static void main(String[] args) {
   //     DB db = new DB();

   //     final int num = 10;
       // num = 11;

    //    Person obji1 = new Person();
    //    Person obji2 = new Person();
    //    Person obji3 = new Person();
    //    Person.GetCount();
       // Person.count = 10;


   //     add(5, 7, 6);
   //     add(5.5f, 7.5f);
   //     add("Hi", "World");
  //  }



 //   public static void add(int a, int b) {
   //    int res = a + b;
   //     System.out.println("Res : " + res);


   // }

  //  public static void add(float a, float b) {
    //    float res = a + b;
   //     System.out.println("Res : " + res);


   // }

  //  public static void add(String a, String  b) {
   //     String res = a + b;
   //     System.out.println("Res : " + res);
//
   //  }

   // public static void add(int a, int b, int y) {
    //    int res = a + b + y;
    //    System.out.println("Res : " + res);

  //  }


    public static void main(String[] args) {
       Car bmw = new Car();
        bmw.lightInfo();
         bmw.setLight(true);
         bmw.lightInfo();

    }
}
