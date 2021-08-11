package lect08;

public class Animal {

    protected String colour;

    public Animal() {
        colour = "Blue";
    }

    public void makeSound() {
        System.out.println("??? What animal am I?");
    }

    @Override
    public String toString() {
        String message = "Colour: " + colour;
        return message;
    }
}
