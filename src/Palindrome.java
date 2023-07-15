import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String inp = scan.nextLine();
        String rev = "";
        //int len = inp.length();
        //for(int i=(len-1);i>=0;--i) {
        for(int i =0;i<inp.length();i++){
            rev = inp.charAt(i) +rev;
        }
            System.out.println(rev);
            if(rev.toLowerCase().equals(inp.toLowerCase())){
                System.out.println("It is Palindrome");
            }
            else {
                System.out.println("It is not Palindrome");
            }
    }
}
