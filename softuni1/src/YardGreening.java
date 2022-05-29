import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kvm = Double.parseDouble(scanner.nextLine());
        double kvmPrice = 7.61*kvm;
        double discount = kvmPrice * 0.18;
        double finalPrice=kvmPrice - discount;

        System.out.printf("The final price is: %.2f lv.%n",finalPrice);
        System.out.printf("The discount is: %.2f lv.",discount);


    }
}
