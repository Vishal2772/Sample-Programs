import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Strings ::");
        String str1 = scanner.next().toLowerCase();
        String str2 = scanner.next().toLowerCase();
        if(str1.length() == str2.length()){
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean res = Arrays.equals(ch1,ch2);
            if(res){
                System.out.println("It is Anagram");
            }
            else{
                System.out.println("It is not Anagram");
            }
        }
        else{
            System.out.println("String are not same");
        }
    }
}
