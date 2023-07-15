public class MissingNumber {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,6,7,8};
        int n = arr.length+1;
        int len=arr.length;
        n = (n*(n+1))/2;
        int sum=0;
        int res =0;
        System.out.println("Number" + n);
        for (int i=0;i< len;i++){
            sum = sum+arr[i];
        }
        res = n-sum;
        System.out.println("Missing number is :" + res);

    }
}
