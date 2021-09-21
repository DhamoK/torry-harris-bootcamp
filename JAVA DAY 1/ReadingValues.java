import java.util.Scanner;

public class ReadingValues {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        int number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        System.out.println("Number is "+number);
    }
}
