import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choose = 1;
        

        while (choose != 4) {

            Scanner scanner = new Scanner(System.in);
            Account1 Account1 = new Account1();

            System.out.println("you currently have " + Account1.bal + " dollars in your account \n would you like to  " +
                    "\n\t 1 - withdraw \n\t 2 deposit \n\t 3 - nothing \n\t 4 - end program");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("insert the amount of money you would like to wihthdraw");
                    // Account1.withdrawMoney(scanner.nextDouble());
                    System.out.println("you now have " + Account1.bal + " dollars in your account");
                    break;
                case 2:
                    System.out.println("insert the amount of money you would like to deposit");
                    Account1.depositMoney(scanner.nextDouble());
                    System.out.println("you now have " + Account1.bal + " dollars in your account");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("please insert 1, 2, 3, or 4");
                    break;
            }
        }
    }

}
