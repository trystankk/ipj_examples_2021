package lect03;

public class SelectionExample1 {

    public static void main(String[] args) {
        double price = 200;
        boolean isMember = false;
        double discount = 0;
        if (isMember) {
            System.out.println("Calculating Discount for members...");

            discount = price * 0.1;
            price -= discount;
        }

        System.out.println("Price to pay: $" + price);
    }
}
