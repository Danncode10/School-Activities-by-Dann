public class Duck extends Animal{
    public String beakColor = "yellow";

    public Duck(){
        name = "Duck";
        System.out.println("Duck is Created.\n");
    }
    

    public void swim(){
        System.out.println("The duck is Swimming.");
    }
    public void quack(){
        System.err.println("Quack, quack, quack. Sabi ng Duck");
    }
}
