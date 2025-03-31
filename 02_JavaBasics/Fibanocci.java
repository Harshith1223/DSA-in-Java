import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        int fib1=0;
        int fib2=1;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        System.out.print(fib1 + " " + fib2 + " ");
        for (int i = 0; i < input; i++) {
            int fib3 = fib1+fib2;
            System.out.print(fib3+" ");
            fib1=fib2;
            fib2 = fib3;
        }
    }
}
