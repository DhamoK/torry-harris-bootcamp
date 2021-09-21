import java.util.Scanner;

public class ReadUserName {
    public static void main(String[] args) {
        String name;
        int num;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        num = scan.nextInt();
        for(int i=1;i<=num;i++) {
            System.out.println(name);
        }
    }
}
