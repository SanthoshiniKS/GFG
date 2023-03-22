class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j=n-1;
            }
            i++;
        }
    }
}