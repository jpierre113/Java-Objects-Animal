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
        Animal octopus = new Animal (8,25,false,"Olivia");

        String name;
        int topSpeed ;

        //get name and speed values using getters
        name = octopus.getName();
        topSpeed = octopus.getTopSpeed();

        //Print some output
        System.out.println("The " + octopus.getName() + " has a top speed of " + octopus.getTopSpeed() + " mph.");

        //Set new name, speed, and endangered properties values using setters

        octopus.setTopSpeed(12);
        octopus.setisEndangered(true);
        octopus.setName("Oswald");
        //get new values using getters
        octopus.getnumLegs();
        octopus.getTopSpeed();
        octopus.getisEndangered();
        octopus.getName();


        //Print some output
        System.out.println("The amount of legs I have: " + octopus.numLegs + ", My top speed is: " + octopus.topSpeed + ", Am I endangered? " + octopus.isEndangered + ", I am a(n): " + octopus.name);
    }
}