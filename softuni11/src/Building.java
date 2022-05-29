import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1 ; f--) {
            for (int r = 0; r < 4 ; r++) {
                System.out.printf("%d%d ",f,r);
            }
        }
        System.out.println();
    }
}
