package lect08;

public class Duck extends Animal{  // Duck is a child of Animal

    private boolean canFly;

    public Duck() {
        colour = "Yellow";
    }

    public Duck(String colour, boolean canFly) {
        this.colour = colour;
        this.canFly = canFly;
    }

}
