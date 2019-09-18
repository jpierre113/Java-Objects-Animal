import static org.junit.Assert.*;

public class AnimalTest {

    @org.junit.Test
    public void getnumLegs() {
    Animal animal = new Animal(8,25,false,"Octopus");
    Integer expected = 8;
    Integer actual = 8;
    assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
    }

    @org.junit.Test
    public void getTopSpeed() {
    }

    @org.junit.Test
    public void setisEndangered() {
    }

    @org.junit.Test
    public void getisEndangered() {
    }

    @org.junit.Test
    public void setName() {
    }

    @org.junit.Test
    public void getName() {
    }
}