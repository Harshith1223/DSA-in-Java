public class pattern {
    public static void main(String[] args) {

        int n=5;
        
        // right angle triangle

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------");
        // pyramid star pattern

        for(int i=0;i<n;i++){

            for(int j=n-i;j>1;j--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
