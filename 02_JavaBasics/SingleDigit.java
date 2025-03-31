import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input>=9) {
            input = add(input);
        }
        System.out.println(input);
    }

    private static int add(int input) {
        // TODO Auto-generated method stub
        int sum =0;
        while(input!=0){
            int rem = input%10;
            sum+=rem;
            input/=10;
        }
        return sum;
    }
}
