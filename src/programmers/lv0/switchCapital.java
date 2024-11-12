package programmers.lv0;
import java.util.Scanner;

public class switchCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.print((char)(c+32));
            }else
                System.out.print((char)(c-32));
        }
    }
}
