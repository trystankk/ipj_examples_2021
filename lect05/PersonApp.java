package lect05;

public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person("Cindy", 21, "EK1234J");  // Create a Person object person1
        String details = person1.getDetails();

        // console environment
        System.out.println(details);   // print attributes name and age

        person1.setAge(33);
        details = person1.getDetails();
        System.out.println(details);   // print attributes name and age

        String passportNumber = person1.getPassportNumber();
        System.out.println("Passport number: " + passportNumber);
    }
}
