class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            if(pos[i]>=cur)
            {
                arr[i]=(pos[i]-cur)*time[i];
            }
            else{
                arr[i]=(cur-pos[i])*time[i];
            }
        }
        int min=arr[0];
        for(int i=0;i<N;i++)
        {
            if(arr[i]<min)
               min=arr[i];
        }
        return min;
    }
}