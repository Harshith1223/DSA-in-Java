public class Length {
    public static void main(String[] args) {
        int n = 1234;
        // int count =0;
        // while(n!=0){
        //     count++;
        //     n/=10;
        // }
        // System.out.println(count);

        //summation

        int sum =0;
        while(n!=0){
            int a = n%10;
            sum+=a;
            n/=10;
        }
        System.out.println(sum);

        // int mul =1;
        // while(n!=0){
        //     int n1=n%10;
        //     mul*=n1;
        //     n/=10;
        // }
        // System.out.println(mul);
    }
}
