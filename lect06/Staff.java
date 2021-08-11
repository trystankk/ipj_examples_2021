package lect06;

public class Staff {

    private String staffID;
    private String name;
    private double salary;
    private int yearsOfService;

    public Staff(String staffID, String name) {  // a volunteer
        this.staffID = staffID;
        this.name = name;
        this.salary = 0;
        this.yearsOfService = 0;
    }

    public Staff(String staffID, String name, double salary) { // New staff
        this(staffID, name);   // reuses the constructor at line 10
        this.salary = salary;
        this.yearsOfService = 0;
    }

    public Staff(String staffID, String name, double salary, int yearsOfService) {  // Existing staff
        this(staffID, name, salary);   // reuses constructor at line 17
        this.yearsOfService = yearsOfService;
    }

    public void ratePerformance(char grade) {
        if (grade=='A') {
            raiseSalary(10);  // raise by 10 percent
        } else if (grade=='B') {
            raiseSalary(5);   // raise by 5 percent
        } else if (grade=='C') {
            raiseSalary(3);   // raise by 3 percent
        }
    }

    private void raiseSalary(int i) {  // no other classes shall call this method
        salary *= (100 + i) / 100.0;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String message = "Staff ID: " + staffID;
        message += "\nStaff Name: " + name;
        message += "\nSalary: $" + salary;
        message += "\nYears of Service: " + yearsOfService;
        return message;
    }
}
