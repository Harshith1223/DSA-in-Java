import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        for(int i =0;i<str.length()-1;i++){
            boolean flag = true;
            for(int j=0;j<str.length()-1;j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(str.charAt(i));
            }
        }
    }
}
