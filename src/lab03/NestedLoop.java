package lab03;

public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i ++){
            System.out.println();
            for(int j = 1; j <= i; j ++){
                System.out.print(j);
            }
        }
        for(int i = 5; i >= 1; i --) {
            System.out.println();
            for (int j = 1; j <= i; j ++) {
                System.out.print(j);
            }
        }
    }
}
