import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid = false;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n",count,i,j,sum);
                    isValid = true;
                    break;
                }
            }
            if (isValid){
                break;
            }
        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d",count,magicNum);
        }
    }
}
