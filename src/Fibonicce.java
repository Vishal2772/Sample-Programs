import java.util.Scanner;

public class Fibonicce {
    public static int fib(int n){
        if(n<=1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements ::");
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(fib(i));
        }
    }
}
