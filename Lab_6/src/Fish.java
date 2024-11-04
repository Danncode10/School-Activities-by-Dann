public class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    public Fish(int sizeInFt) {
        name = "Fish";
        this.sizeInFt = sizeInFt;
        canEat = true;
        System.out.println("Fish is Created.\n");

    }
    

    //Get and Set
    public void setsizeInFt(int ft){
        sizeInFt = ft;
    }
    public int getsizeInFt(){
        return sizeInFt;
    }

    public void setCanEat(boolean canEat){
        this.canEat = canEat;
    }

    //Functions
    private void swim(){
        System.out.println("The Fish is Swimming.");
    }

}
