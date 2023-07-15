import java.util.Scanner;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args){
        Stack<String> stk = new Stack<>();
        boolean res = stk.empty();
        System.out.println("Is stack is empty?"+res );
        Scanner scan = new Scanner(System.in);
        //String inp = scan.nextLine();
        stk.push("RED");
        stk.push("ORANGE");
        stk.push("BLUE");
        stk.push("YELLOW");
        stk.push("PINK");
        System.out.println("Stack elements are"+ stk);
        System.out.println("Top element of Stack is"+ stk.peek());
        System.out.println("Stack size is"+ stk.size());
        stk.pop();
        stk.pop();
        System.out.println("Stack elements are"+ stk);
    }
}
