import java.util.Arrays;
import java.util.HashSet;

public class RemDuplicateArr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int[] arr1 = new int[set.size()];
        int ind =0;
        for(int n:set){
            arr1[ind++]=n;
        }
            System.out.println("Array is:: "+Arrays.toString(arr1));
        System.out.println("Array is:: "+ arr1);
    }
}
