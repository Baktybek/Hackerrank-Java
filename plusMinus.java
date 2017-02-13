/*
Given an array of integers, calculate which fraction of its elements are positive, 
which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. 
Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. 
The test cases are scaled to six decimal places, though answers with absolute error of up to 10**(-4) are acceptable.

Input Format

The first line contains an integer,N , denoting the size of the array.
The second line contains N space-separated integers describing an array of numbers .

Output Format

You must print the following 3 lines:

    A decimal representing of the fraction of positive numbers in the array.
    A decimal representing of the fraction of negative numbers in the array.
    A decimal representing of the fraction of zeroes in the array.

Sample Input

6
-4 3 -9 0 4 1         

Sample Output

0.500000
0.333333
0.166667

Explanation

There are 3 positive numbers, 
negative 2 numbers, and 1 zero in the array.
The respective fractions of positive numbers, 
negative numbers and zeroes are , and , respectively.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        //"p"-positive
        float p = 0;
        //"m"-negative
        float m = 0;
        //"e"-equal to 0
        float e = 0;
        
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]>0){
                p+=1;
            }
            else if(arr[i]<0){
                m+=1;
            }
            else if(arr[i]==0){
                e+=1;
            }
        }
        System.out.println(p/n);
        System.out.println(m/n);
        System.out.println(e/n);
    }
}
