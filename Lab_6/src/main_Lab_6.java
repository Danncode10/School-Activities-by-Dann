import java.util.Scanner;
public class main_Lab_6 {
    public static Animal createAnimal(Animal x, int choice){
        Scanner scan = new Scanner(System.in);

        if(choice == 1){
            x = new Duck();
        }
        if(choice == 2){
            System.out.print("Enter Fish Size in Ft: ");
            int ft = scan.nextInt();
            x = new Fish(ft);
        }
        if (choice == 3){
            x = new Zebra();
        }

        return x;
    }

    public static int chooseAnimal(){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(!(choice > 0 && choice < 4)){
            System.out.println("\n1 - Duck\n2 - Fish\n3 - Zebra\n");
            System.out.print("What Animal You want to Create: ");
            choice = scan.nextInt();
            if(!(choice > 0 && choice < 4)){
                System.out.println("Invalid Input");
            }
        }
        return choice;
    }

    public static int showAccessibleFunctions(Animal x){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        //Duck functions
        System.out.println("List of accessible functions for " + x.name + "\n");
        while(!(choice > 0 && choice <= 4) && x instanceof Duck){
                System.out.println("1 - isMammal()");
                System.out.println("2 - mate()");
                System.out.println("3 - swim()");
                System.out.println("4 - quack()");
                System.out.print("\nEnter Choice: ");
                choice = scan.nextInt();
            if(!(choice > 0 && choice <= 4)){
                System.out.println("Invalid Input!");
            }
        }
        //Fish Fun
        while(!(choice > 0 && choice <= 2) && x instanceof Fish){
            System.out.println("1 - isMammal()");
            System.out.println("2 - mate()");
            System.out.println("swim() is not accessible. It is private");
            System.out.print("\nEnter Choice: ");
            choice = scan.nextInt();
        if(!(choice > 0 && choice <= 2)){
            System.out.println("Invalid Input!");
            }
        }

        while(!(choice > 0 && choice <= 3) && x instanceof Zebra){
            System.out.println("1 - isMammal()");
            System.out.println("2 - mate()");
            System.out.println("3 - run()");
            System.out.print("\nEnter Choice: ");
            choice = scan.nextInt();
        if(!(choice > 0 && choice <= 3)){
            System.out.println("Invalid Input!");
            }
        }

        return choice;
    }

    public static boolean setCreateAnimal(){
        Scanner scan = new Scanner(System.in);
        String ch = "";
        while(!ch.equals("y") && !ch.equals("n")){
            System.out.print("Create another animal or not ('y' or 'n'): ");
            ch = scan.next();
            if(!ch.equals("y") && !ch.equals("n")){
                System.out.println("invalid Input.");
            }
        }
        if (ch.equals("y")){
            return true;
        }
        else{
            return false;
        }

    }

    public static void runFunctions(Animal x, int fun){
        if(fun == 1){
            System.out.println(x.isMammal());
        }
        if(fun == 2){
            x.mate();
        }
        if(x instanceof Duck){
            if(fun == 3){
                ((Duck)x).swim();
            }
            if(fun == 4){
                ((Duck)x).quack();
            }
        }

        //Walang public class ang Fish'

        if(x instanceof Zebra){
            if(fun == 3){
                //Cast Animal to Zebra ---- > IMPORTANT (Kase ung Animal x is Animal Type, wla siang run function)
                ((Zebra)x).run();
            }
        }
    }

    public static boolean quit(){
        Scanner scan = new Scanner(System.in);
        String ch = "";
        while(!ch.equals("y") && !ch.equals("n")){
            System.out.print("Would you like to quit ('y' or 'n'): ");
            ch = scan.next();
            if(!ch.equals("y") && !ch.equals("n")){
                System.out.println("invalid Input.");
            }
        }
        if (ch.equals("y")){
            return false; //running = false means terminate
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
       Animal x = new Animal();
       int choice;
       boolean running = true;
       boolean createAnimal = true;
       while(running){
        
        if(createAnimal){
            choice = chooseAnimal();
            x = createAnimal(x,choice);
        }

        int fun_choice = showAccessibleFunctions(x);
        runFunctions(x, fun_choice);
        createAnimal = setCreateAnimal();
        if(createAnimal == false){
            running = quit();
        }
       }
    }
}
