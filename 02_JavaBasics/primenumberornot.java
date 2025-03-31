import java.util.Scanner;

public class primenumberornot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean flag = true;

        for(int i = 2;i<input;i++){
            if(input%i==0){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println(input+" Number is prime");
        }
        else{
            System.out.println("Its not a prime Number");
        }
    }

    //can also write Range of prime numbers and also prime numbers which are even etc
}