import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double cm = inch*2.54;
        System.out.println(cm);
    }
}
