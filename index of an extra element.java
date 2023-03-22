class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int i=0,j=0,index=0;
        while(i<n && j<n-1)
        {
            if(a[i]!=b[j]){
               index=i;
               break;
            }
            i++;
            j++;
        }
        index=i;
        return index;
    }
}