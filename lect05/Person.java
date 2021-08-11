package lect05;

public class Person {  // class name
    // attributes
    private String name;
    private int age;
    private String passportNumber;

    public Person(String aName, int aAge, String passportNum) {  // Constructor, construct an object
        name = aName;                        // initialize name and age attributes
        age = aAge;                          // Constructor has the same as a class
        passportNumber = passportNum;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getAge() {  // allow reading of age
        return age;
    }

    public void setAge(int aAge) {  // allow modifying of age
        age = aAge;
    }

    public String getDetails() {      // return information about the object
        String message = "Name: " + name;    // return type is a String
        message += ", Age: " + age;
        message += ", Passport No.: " + passportNumber;
        return message;
    }

}
