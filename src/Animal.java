public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    //Put constructor here
    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;

    }
    //Put getters and setters here

    public void setnumLegs(int numLegs){
        this.numLegs = numLegs;
    }
    public int getnumLegs(){
        return this.numLegs;
    }

    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed(){
        return this.topSpeed;
    }

    public void setisEndangered(boolean isEndangered){
        this.isEndangered = isEndangered;
    }
    public boolean getisEndangered(){
        return this.isEndangered;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public static void main(String[] args) {
        System.out.println("Hello, world");
        //Instantiate new Animal
        Animal animal = new Animal (8,25,false,"Octopus");

        String name = animal.getName();
        int topSpeed = animal.getTopSpeed();

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed() ;

        //Print some output
        System.out.println("The " + animal.getName() + " has a top speed of " + animal.getTopSpeed() + " mph.");

        //Set new name, speed, and endangered properties values using setters
         animal = new Animal(8,25,false,"Octopus");
        animal.setnumLegs(4);
        animal.setTopSpeed(12);
        animal.setisEndangered(true);
        animal.setName("Sea Lion");
        //get new values using getters
        animal.getnumLegs();
        animal.getTopSpeed();
        animal.getisEndangered();
        animal.getName();


        //Print some output
        System.out.println("The amount of legs I have: " + animal.numLegs + ", My top speed is: " + animal.topSpeed + ", Am I endangered? " + animal.isEndangered + ", I am a(n): " + animal.name);
    }
}