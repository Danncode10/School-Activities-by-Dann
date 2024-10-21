package ATM;

public class main{
    public static void main(String[] args) {
        boolean running = true;
        int choice;
        Bank_Account account = new Bank_Account();
        while (running) {
            choice = account.show_choice();
            if(choice == 4){
                break;
            }
            account.operate(choice);
        }
    }
}
