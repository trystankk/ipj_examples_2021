package lect08_inheritance;

public class Staff {

    protected String name;      // inherited by the child
    protected String staffID;
    protected int yearsOfService;
    protected double pay;

    public Staff(String name, String staffID, int yearsOfService, double pay) {
        this.name = name;
        this.staffID = staffID;
        this.yearsOfService = yearsOfService;
        this.pay = pay;
    }

    public double calculatePay() {
        return pay;  // there is no way to determine the pay
        // as we do not know whether this is FT or PT Staff
    }

    public String getName() {
        return name;
    }

    public String getStaffID() {
        return staffID;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String message = "Name             : " + name;
        message += "\nStaff ID         : " + staffID;
        message += "\nYears of Service : " + yearsOfService;
        return message;
    }
}
