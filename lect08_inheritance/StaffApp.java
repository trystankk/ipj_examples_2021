package lect08_inheritance;

public class StaffApp {

    public static void main(String[] args) {

        Staff[] staffArray = new Staff[10];
        FullTimeStaff fullTimeStaff = new FullTimeStaff("Rachel", "ST123456", 5, 4500);
        PartTimeStaff partTimeStaff = new PartTimeStaff("Bozo", "PT898989", 3, 150, 15);
        FullTimeStaff fullTimeStaff2 = new FullTimeStaff("Vicky", "ST139301", 10, 7500);
        fullTimeStaff2.setDeclaredMonthsOfBonus(8);
        PartTimeStaff partTimeStaff2 = new PartTimeStaff("Norman", "PT991919", 2, 200, 20);

        staffArray[0] = fullTimeStaff;   // staffArray is the polymorphic reference
        staffArray[2] = partTimeStaff;
        staffArray[5] = partTimeStaff2;
        staffArray[6] = fullTimeStaff2;

        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i] != null) {
                System.out.println(staffArray[i].calculatePay());  // polymorphism in action
                // staff.calculatePay()  // if underlying is FTStaff... FTStaff.calculatePay()
            }
        }

    }
}
