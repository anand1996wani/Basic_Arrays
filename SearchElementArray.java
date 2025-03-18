/**

Search an element in an array
You are given an array 
A
A of size 
N
N and an element 
X
X. Your task is to find whether the array 
A
A contains the element 
X
X or not.

Input Format
The first line contains two space-separated integers 
N
N and 
X
X — the size of array and the element to be searched.
The second line contains all the elements of array 
A
A
Output Format
Output "YES" if the element 
X
X is present in 
A
A, otherwise output "NO".


*/

import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int X = scanner.nextInt();
        
        int a = 0;
        
        for(int i = 0;i < N;i++){
            a = scanner.nextInt();
            if(a == X){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
	}
}
