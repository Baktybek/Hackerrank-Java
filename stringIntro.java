import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else if(A.compareTo(B) < 0){
            System.out.println("No");
        }
        else
            System.out.println("Equivalent");
        char a = Character.toUpperCase(A.charAt(0));
        char b = Character.toUpperCase(B.charAt(0));
        System.out.println(A.replace(A.charAt(0), a)+" "+B.replace(B.charAt(0), b));
        
    }
}
