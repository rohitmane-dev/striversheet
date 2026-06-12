class Solution{
    public static int Aggressivecows(int []arr , int k){
        int n=arr.length;
        int[] nums =new int[n];
        arr.sort(arr);
        int left= 0;
        int right=n-1;
        int min=Integer.MIN_VALUE;
        loop:
        while(left<=right){
            int mid=(left+right)/2;
            
            if(arr[mid]-arr[left]<min)min=arr[mid]-arr[left];
            else if(arr[right]-arr[mid]<min)min=arr[right]-arr[mid];

            //else if(count<k)jumploop;
        }
    }

}