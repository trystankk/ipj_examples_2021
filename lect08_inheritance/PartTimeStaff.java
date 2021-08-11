package lect08_inheritance;

public class PartTimeStaff extends Staff{

    private int hoursWorked;

    public PartTimeStaff(String name, String staffID, int yearsOfService, int hoursWorked, double hourlyPay) {
        super(name, staffID, yearsOfService, hourlyPay);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * pay;
    }

    @Override
    public String toString() {
        String message = super.toString();  // get info from parent method
        message += "\nHours Worked     : " + hoursWorked;
        //message += "\nHourly Pay       : " + hourlyPay;
        return message;
    }
}
