import static org.junit.Assert.*;

public class AnimalTest {
    @org.junit.Test
    public void setnumLegs() {
        Animal animal = new Animal(8,25,false,"Octopus");
        Integer expected = 8;
        Integer actual = 8;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getnumLegs() {
    Animal animal = new Animal(8,25,false,"Octopus");
    Integer expected = 8;
    Integer actual = 8;
    assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
        Animal animal = new Animal(4,12,true,"Turtle");
        Integer expected = 12;
        Integer actual = 12;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getTopSpeed() {
        Animal animal = new Animal(2,44,true,"Kangaroo");
        Integer expected = 44;
        Integer actual = 44;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setisEndangered() {
        Animal animal = new Animal(2,44,true,"Kangaroo");
        Boolean expected = true;
        Boolean actual = true;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getisEndangered() {
        Animal animal = new Animal(2,44,true,"Octopus");
        Boolean expected = false;
        Boolean actual = false;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setName() {
        Animal animal = new Animal(2,44,true,"Octopus");
        String expected = "Octopus";
        String actual = "Octopus";
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getName() {
        Animal animal = new Animal(2,44,true,"Kangaroo");
        String expected = "Kangaroo";
        String actual = "Kangaroo";
        assertEquals(expected,actual);
    }
}