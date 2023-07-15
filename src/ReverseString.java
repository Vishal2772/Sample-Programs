import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder rev = new StringBuilder(str);
        //rev.append(str);
        rev.reverse();
        System.out.println(rev);
    }
}
