import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Fee to Pay: " + finalFee);

        sc.close();
    }
}