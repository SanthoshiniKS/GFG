class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}