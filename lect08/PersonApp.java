package lect08;

public class PersonApp {
    public static void main(String[] args) {
        Person p1 = new Person("Jojo");
        Person p2 = new Person("Vivi");
        Person p3 = new Person("Jojo");

        System.out.println("p1 == p2? " + (p1.equals(p2)));
        System.out.println("p1 == p3? " + (p1.equals(p3)));
    }
}
