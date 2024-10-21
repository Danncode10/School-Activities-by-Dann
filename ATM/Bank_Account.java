package ATM;
import java.util.Scanner;

public class Bank_Account {
    private int current_balance;

    Scanner scan = new Scanner(System.in);

    public Bank_Account(){
        current_balance = 0;
    }

    public void setBalance(int balance){
        current_balance = balance;
    }
    public int getBalance(){
        return current_balance;
    }

    public int show_choice(){

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Chose Choice: ");
            int choice = scan.nextInt();

            if(choice == 1 || choice == 2 || choice == 3 || choice == 4){
                return choice;
            }
            else{
                System.out.println("Invalid Input");
            }
        }

    }

    public void operate(int choice){
        if(choice == 1){
            deposit();
        }
        else if(choice == 2){
            withdraw();
        }
        else if(choice == 3){
            balance();
        }
        else{
            //Exit
        }
    }

    public void deposit(){
        System.out.print("Enter Amount to Deposit: ");
        int amount = scan.nextInt();
        current_balance += amount;
    }

    public void withdraw(){
        System.out.print("Enter Amount to Withdraw: ");
        int amount = scan.nextInt();
        if(amount > current_balance){
            System.out.println("Exceed amount to WIthdraw");
        }
        else{
            current_balance -= amount;
        }
    }

    public void balance(){
        System.out.printf("Balance: %d\n", current_balance);
    }

}
