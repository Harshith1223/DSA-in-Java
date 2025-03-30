import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String rev = "";
        for (int i = input.length()-1; i >= 0; i--) {
            rev+=input.charAt(i);
        }
        System.out.println(rev);
    }
}
