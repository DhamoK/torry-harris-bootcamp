public class Pattern {
    public static void main(String[] args) {
        int m=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++) {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
