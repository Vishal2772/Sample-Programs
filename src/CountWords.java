import java.util.Scanner;

public class CountWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 = str.split(" ");
        System.out.println("The number of words are::"+str1.length);
    }
}
