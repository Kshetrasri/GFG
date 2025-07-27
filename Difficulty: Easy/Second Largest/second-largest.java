class Solution {
    public int getSecondLargest(int[] arr)
    {
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        int secondMax = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > secondMax && arr[i] < max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}