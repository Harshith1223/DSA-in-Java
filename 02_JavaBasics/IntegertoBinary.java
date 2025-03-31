public class IntegertoBinary {
    public static void main(String[] args) {
        int n = 15;
        String res = "";
        while (n!=0) {
            int rem = n%2;
            res = rem+res;
            n/=2;
        }
        System.out.println(res);
    }
}
