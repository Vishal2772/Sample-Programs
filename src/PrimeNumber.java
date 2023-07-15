import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        // n =29
        // this for loop checks until 29%28==0
        for(int i=2;i<n-1;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number::");
        int N = scanner.nextInt();
        if(isPrime(N)){
            System.out.println(N + " " + "is a prime number");
        }
        else {
            System.out.println(N + " "+"is not a prime number");
        }
    }
}
