/*
LINK : https://practice.geeksforgeeks.org/problems/reversal-algorithm/0/?track=SP-Arrays%20and%20Searching

Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

Input:

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements. The third line of each test case contains "d" .

Output:

Corresponding to each test case, in a new line, print the modified array.

Constraints:

1 ≤ T ≤ 200
1 ≤ N ≤ 200
1 ≤ A[i] ≤ 1000

Example:

Input

1
5
1 2 3 4 5
2

Output
3 4 5 1 2

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a;
		int rot,s,temp;
		for(int i=0;i<t;i++){
		    s = sc.nextInt();
		    a = new int[s];
		    for(int k=0;k<s;k++){
		        a[k] = sc.nextInt();
		    }
		    rot = sc.nextInt();
		    for(int k=0;k<rot;k++){
		        temp = a[0];
		        for(int j=0;j<s;j++){
		            if(j==s-1){
		               a[j] = temp; 
		               break;
		            }else{
		            a[j] = a[j+1];
		            }
		        }
		    }
		    for(int k=0;k<s;k++){
		        System.out.print(a[k]);
		        System.out.print(" ");
		    }System.out.println(" ");
		}
	}
}
