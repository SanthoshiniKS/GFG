class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int total=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<array.length;i++)
             sum+=array[i];
        return total-sum;
    }
}