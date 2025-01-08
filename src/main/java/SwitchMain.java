import java.util.Scanner;

public class SwitchMain {

    //Switch casе
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int user = scan.nextInt();

        switch (user) {
            case 5:
                System.out.println("Number is 5");
                break; //обовязково в кінці
            case 50:
                System.out.println("Number is 50");
                break;
            case 7:
                System.out.println("Number is 7");
                break;
            default:
                System.out.println("Number is undefined");
        }
    }

}
