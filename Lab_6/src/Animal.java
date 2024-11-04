public class Animal {
    public int age;
    public String name;
    public String gender;

    public Animal(){
        name = "Animal";
    }

    public boolean isMammal(){
        if(this instanceof Zebra){
            return true;
        }
        else{
            return false;
        }
    }

    public void mate(){
        System.out.println("The " + name + "s are mating. ");
        
    }

}
