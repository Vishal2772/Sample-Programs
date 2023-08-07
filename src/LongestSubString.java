import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// To find the lenght of longest Substring without repeating characters.
public class LongestSubString {
    public static int longestSubStr(String s){
        // Two pointers left and right
        int left = 0, right = 0;
        int n = s.length();
        int maxLength = 0;
        // Hashset to keep the track of the unique chars.
        Set<Character> set = new HashSet<>();
        // Checking the characters from one end to putting into the hashset
        while(left<n && right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                // maxlen will store and declare the max lenght of substring
                maxLength = Math.max(maxLength,set.size());
            }
            else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scan.next();
        longestSubStr(str);
        System.out.println(longestSubStr(str));

    }
}
