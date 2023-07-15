import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        String arr[] = {"Java","C++","C","Java","Pyton"};
        boolean flag = false;
        for(int i=0;i< arr.length;i++) {
            for (int j=i+1;j < arr.length;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The duplicate array element is::" + arr[i]);
                    flag = true;

                }
            }
        }
                if(flag == false) {
                    System.out.println("No duplicate element");
                }

    }
}
