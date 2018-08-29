/*
LINK : https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=SP-Arrays%20and%20Searching

Given an integer array, for each element in the array check whether there exist a smaller element on the next immediate position of the array. If it exist print the smaller element. If there is no smaller element on the immediate next to the element then print -1.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains an integer N, where N is the size of array.
The second line of each test case contains N integers sperated with a space which is input for the array arr[ ]

Output:

For each test case, print in a newline the next immediate smaller elements for each element in the array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ arr[i] ≤ 1000

Example:

Input
2
5
4 2 1 5 3
6
5 6 2 3 1 7

Output
2 1 -1 3 -1
-1 2 -1 1 -1 -1

*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    StringBuilder sb;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a;
		int s = 0;
		int t1 = -1;
		for(int i=0;i<t;i++){
		    sb = new StringBuilder();
		    s = sc.nextInt();
		    a = new int[s];
		    for(int k=0;k<s;k++){
		        a[k] = sc.nextInt();
		    }
    	    for(int j=0;j<s-1;j++){
	            if(a[j+1]<a[j]){
	                sb.append(a[j+1]);
	                sb.append(" ");
	                continue;
	            }else{
	                sb.append(t1);
	                sb.append(" ");
	                continue;
	            }
		    }
		    sb.append(t1);
		    System.out.println(sb);
		        
		}
	}
}
