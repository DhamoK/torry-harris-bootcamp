public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println(array[array.length / 2]);
        int add = 0;
        for (int i = 0; i < array.length; i++)
            {
                add = (array[i] + add);
            }
        System.out.println(add/array.length);
    }
}
