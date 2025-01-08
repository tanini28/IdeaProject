import java.util.Scanner;

public class mainTest {

    //Умовні конструкції
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int user = scan.nextInt();
        char sym = 't';
        if (user == 5 || sym == 't') { // >,<, <=, >=, ==, !=;  && - означає амперсанти (тобто і ); || - озн. 'або
            System.out.println("Number is 5");
            boolean isHappy = false;
            //або коротше if (!isHappy)
            if (isHappy == false)
                System.out.println("Bool is false");
        } else if (user == 60)
            System.out.println("Number is 60");
          else if (user == 70)
            System.out.println("Number is 70");
          else if (user > 100)
            System.out.println("Number is > 100");
          else
         System.out.println("Number is underfined");

    }
}

