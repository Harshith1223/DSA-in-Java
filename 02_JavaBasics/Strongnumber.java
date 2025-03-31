public class Strongnumber {
    public static void main(String[] args) {
        int n =145;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=factorial(rem);
            n/=10;
        }
        System.out.println(sum);
    }

    private static int factorial(int rem) {
        // TODO Auto-generated method stub
        int fact = 1;
        for(int i = rem;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
}
