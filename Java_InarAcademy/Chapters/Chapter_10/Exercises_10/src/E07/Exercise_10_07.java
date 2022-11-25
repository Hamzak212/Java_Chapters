package E07;
import java.sql.SQLOutput;
import java.util.*;
public class Exercise_10_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account[] accounts = getAccounts(10);
        ATMMachine(accounts, input);


    }
    public static void ATMMachine(Account[] accounts, Scanner input){


        while(true){
            System.out.print("Enter An ID: ");
            int id = input.nextInt();

            while(true){
                displayATM();
                System.out.println("Enter a Choice: ");
                int choice = input.nextInt();
                if(choice == 1){
                    displayBalance(accounts[id]);
                }else if(choice == 2){
                    accounts[id].withdraw(getWithDrawAmount(accounts[id], input));
                    System.out.println();
                }else if(choice == 3){
                    accounts[id].deposit(getDepositAmount(input));
                }else if(choice == 4){
                    break;
                }else{
                    System.out.println("Invalid choice");
                }
            }

            System.out.println("Do you want to check another account? Y/N");
            char c = input.next().toUpperCase().charAt(0);
            if(c == 'N'){
                break;
            }

        }
    }



    public static double getDepositAmount(Scanner input){

        System.out.print("Enter amount to deposit: ");
        double deposit = input.nextDouble();

        return deposit;

    }
    public static double getWithDrawAmount(Account accounts, Scanner input){
        while(true) {
            System.out.print("Enter an amount to withdraw: ");
            double a = input.nextDouble();

            if (a <= accounts.getBalance()) {
                return a;
            } else {
                System.out.println();
                System.out.println("You don't have that much money.");
                System.out.println("Your maximum withdraw amount can be $" + accounts.getBalance());
                System.out.println();
            }
        }

    }
    public static void displayBalance(Account accounts){
        System.out.println("The Balance is " + accounts.getBalance());
    }
    public static void displayATM(){
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
    public static Account[] getAccounts(int j){
        Account[] accounts = new Account[j];

        for(int i = 0; i < j; i++){
            accounts[i] = new Account(i,100);
        }
        return accounts;
    }
}
