package lect08_inheritance;

public class FullTimeStaff extends Staff{

    private int declaredMonthsOfBonus;

    public FullTimeStaff(String name, String staffID, int yearsOfService, double salary) {
        super(name, staffID, yearsOfService, salary);  // Staff constructor (parent)
        declaredMonthsOfBonus = 3;
    }

    @Override
    public double calculatePay() {
        double totalPayPackage = (12 + declaredMonthsOfBonus) * pay;
        return totalPayPackage;
    }


    public int getDeclaredMonthsOfBonus() {
        return declaredMonthsOfBonus;
    }

    public void setDeclaredMonthsOfBonus(int declaredMonthsOfBonus) {
        this.declaredMonthsOfBonus = declaredMonthsOfBonus;
    }

    @Override
    public String toString() {  // method overriding (cover the parent's implementation)
        String message = super.toString();  // get parent's toString() information
        //message += "\nSalary           : $" + salary;
        return message;
    }
}
