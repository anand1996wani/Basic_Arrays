/**
* Missing in Array
* 
* You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
* This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
* 
* Input: arr[] = [1, 2, 3, 5]
* Output: 4
*
* Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
* Output: 6
*
*/

class Solution {
    int missingNumber(int arr[]) {
        int size = arr.length;
        int n = size + 1;
        
        int ans = 0;
        
        int exp_exor = 0;
        
        for(int i = 0;i < n;i++)
            exp_exor = exp_exor ^ (i+1);
        
        for(int i = 0;i < arr.length;i++){
            ans = ans ^ arr[i];
        }
        
        return ans^exp_exor;
    }
    
    //Sum of Fitst n numbers - sum of array elements
    int missingNumber2(int arr[]) {
        // code here
        
        int size = arr.length;
        int n = size + 1;
        
        long expectedSum = (n * (n + 1)) / 2;
        
        long sum = 0;
        
        for(int c : arr)
            sum = sum + c;
            
        return (int)(expectedSum - sum);
    }
}
