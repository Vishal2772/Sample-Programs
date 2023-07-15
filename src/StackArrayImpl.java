public class StackArrayImpl {

        int top;
        int size;
        int arr[];

        StackArrayImpl(int size){
            this.top = -1;
            this.size = size;
            this.arr = new int[size];
        }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == size - 1);
    }

    public void push(int n){
        if(isFull()){
            System.out.println("Stack is empty");
        }
        top++;
        arr[top] = n;
        System.out.println("Pushed Element is:"+ n);
    }

    public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            System.out.println("Popped element is ::"+arr[top--]);
            return arr[top--];

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("The top most element is::"+ arr[top]);
        return arr[top];
    }
    public static void main(String[] args){
        StackArrayImpl stk = new StackArrayImpl(5);
        stk.push(10);
        stk.push(20);
        stk.peek();
        stk.pop();

    }

}
