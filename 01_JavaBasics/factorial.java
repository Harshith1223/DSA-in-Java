import java.util.Scanner;

public class factorial {
//    public static void printfactorial(int n){
//
//        if (n<0){
//            System.out.println("Invalid number");
//            return;
//        }
//
//        int factorial=1;
//        for (int i=n;i>=1;i--){
//            factorial=factorial*i;
//        }
//        System.out.println(factorial);
//    }

    public static int printfactorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*printfactorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(printfactorial(n));

    }
}
