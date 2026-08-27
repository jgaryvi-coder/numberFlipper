import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number larger then 0: ");
        int num = input.nextInt();
        int numrev = 0;
        while (num > 0) {
            numrev = numrev * 10 + (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse: " + numrev);

    }
}