package lect08;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Duck duck = new Duck();
        duck.makeSound();  // makeSound() is inherited from Animal

        Duck duck2 = new Duck("Black", true);
        duck2.makeSound();

    }
}
