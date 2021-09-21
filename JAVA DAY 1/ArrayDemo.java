import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i]=scan.nextInt();
        }
        for (int val:array) {
            System.out.println(val*val);
        }

    }
}
