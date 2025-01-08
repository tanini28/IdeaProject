public class CycleMain {

    //Цикли
    public static void main (String [] args) {
        //for (int i = 0; i <= 5; i++)
        //for (float i = 100f; i > 0.5f; i /= 2)
        //    System.out.println("Element is " + i);
       // int i = 100;
      //  while (i >= 10) {
       //     System.out.println("Number is " + i);
       //     i -=10;
       // }

      //  int i = 100;
      //  do {
      //  System.out.println("Number is " + i);
      //     i++;
      //  } while(i < 10);

        for (byte i = 1; i < 10; i++) {
            if (i==8)
                break;

            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }
    }
}
