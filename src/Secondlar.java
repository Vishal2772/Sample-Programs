import java.util.Arrays;

public class Secondlar {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,121,8,9,15,78,234};
        int max = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[n-2];
            }
        }
        System.out.println("Maximum Element ::"+ max);
    }
}
