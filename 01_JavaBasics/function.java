import java.util.Scanner;

public class function {
    //3 rule sto write funation  names
    //1) printmyname
    //2) print_my_name
    //3) printMyName --> also called as camel case( it means mix of upper case and lower case 1st letter should be owercase)
    //
//    public static void printMyName(String a){
//        System.out.println(a);
//    }

//    public static int addTwoNumbers(int a,int b){
//        int c=a+b;
//        return c;
//    }

    public static int mulTwoNumbers(int a,int b){
        int c=a*b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        String name=sc.next();
        int input1= sc.nextInt();
        int input2= sc.nextInt();
        int x=mulTwoNumbers(input1,input2);
        System.out.println(x);
    }
}
