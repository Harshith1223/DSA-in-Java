import java.util.Scanner;

public class basicfunctions {

    //printing average
    public static int printavg(int a,int b,int c){
        int d=(a+b+c)/2;
        return d;
    }

    //printing odd numbers
    public static void oddno(int n){
        for (int i=0;i<=n;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }

    //getting greater number of the two
    public static int greaterno(int a,int b){
        if (a>b){
            return a;
        } else if (b>a) {
            return b;
        }
        else
            return 0;
    }

    //circumference of circle
    public static double area(int r){
        double pi=3.142;
        double res=2*pi*r;
        return res;
    }

    //vote eligibility
    public static int voteeligibility(int n){
        if(n<18){
            return 0;
        }
        else
            return 1;
    }

    public static void numberclassifier(int n){
        if(n<0){
            System.out.println("Positive");
        }
        else if (n==0){
            System.out.println("Zero");
        }
        else
            System.out.println("Negative");
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println(printavg(2,3,4));

        //can write other calling functions.
    }
}
