import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++, System.out.println()) {
            System.out.println("Hello");

//         Print even numbers
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0)
                    System.out.println(j);
            }

            //Infinite for loop
//            for (;;){
//                System.out.println("Hello");
//            }

            int a = sc.nextInt();
            if (a == 0) {
                System.out.println("Marks dosent matter");
            } else if (a == 1) {
                int marks = sc.nextInt();
                if (marks <= 100) {
                    do {
                        System.out.println("This is good");
                        break;
                    } while (marks >= 90);

                    do {
                        System.out.println("This is also good");
                        break;
                    } while (marks >= 60 && marks <= 90);

                    do {
                        System.out.println("This is Good as well");
                        break;
                    } while (marks >= 0 && marks <= 59);
                }
            }

            int num = sc.nextInt();
            boolean flag = false;
            for (int k = 2; k < num / 2; k++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("It is a prime");
            } else {
                System.out.println("It is not a prime");
            }

        }
    }
}

