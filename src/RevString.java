import java.util.Scanner;

public class RevString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String rev = "";
        for(int i=0;i<str.length();i++){
             rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
