import java.util.Scanner;

public class ReadDisplayDataTypes {
    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("The Name is " + name);
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println("The Number is " + num);
        double deci;
        Scanner sc = new Scanner(System.in);
        deci = sc.nextDouble();
        System.out.println("The decimal is " + deci);

    }
}
