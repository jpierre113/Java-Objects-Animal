import org.junit.Before;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal octopus;

    @Before
    public void initializeAnimal() {
        octopus = new Animal(8,25,false, "Oliva");
    }
    @org.junit.Test
    public void setNumLegs() {
        Integer expected = 8;
        octopus.setNumLegs(8);
        Integer actual = octopus.getNumLegs();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getNumLegs() {
        Animal octopus = new Animal(8,25,false,"Oliva");
        Integer expected = 8;
        Integer actual = octopus.getNumLegs();
    assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
        Animal turtle = new Animal(4,12,true,"Turtle");
        turtle.setTopSpeed(20);
        Integer expected = 20;
        Integer actual = turtle.getTopSpeed();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getTopSpeed() {
        Animal kangaroo = new Animal(2,44,true,"Kangaroo");
        Integer expected = 44;
        Integer actual = kangaroo.getTopSpeed();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setisEndangered() {
        Animal kangaroo = new Animal(2,44,true,"Kangaroo");
        kangaroo.setisEndangered(false);
        Boolean expected = false;
        Boolean actual = kangaroo.getisEndangered();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getisEndangered() {
        Animal octopus = new Animal(2,44,false,"Octopus");
        Boolean expected = false;
        Boolean actual = octopus.getisEndangered();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setName() {
        Animal animal = new Animal(2,44,true,"Octopus");
        octopus.setName("Oswald");
        String expected = "Oswald";
        String actual = octopus.getName();
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getName() {
        Animal kangaroo = new Animal(2,44,true,"Kangaroo");
        String expected = "Kangaroo";
        String actual = kangaroo.getName();
        assertEquals(expected,actual);
    }
}