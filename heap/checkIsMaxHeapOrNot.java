public class checkIsMaxHeapOrNot {
    // User function Template for Java

    public static void main(String [] args){
        long [] arr={80,70,60,50,40,30,20,10,5};
        System.out.println("Is it a Max Heap?  \n"+isMaxHeap(arr,9));
        System.out.println("Is it a Min Heap? \n"+isMinHeap(arr,9));
        
    }

    public static boolean isMaxHeap(long arr[], long n) {
        // Your code goes here
        //max heap means the parent have the greater value than its childs 
        // i.e i> 2*i && i>2*i+1
        
        for( int i=0; i<=(n-2)/2;i++){ 
            int left = (2*i)+1;
            int right = (2*i)+2;
            
            //check if left child exixst and valid
            if(left < n && arr[i]<arr[left]){ //parent is smaller
                return false;
            }
            
            //check if right child exixst and valid
            if(right < n && arr[i]<arr[right]){ //parent is smaller
                return false;
            }
        }
        
        return true;
    }

    public static boolean isMinHeap(long arr[], long n) {
        // Your code goes here
        //max heap means the parent have the Smaller value than its childs 
        // i.e i> 2*i && i>2*i+1
        
        for( int i=0; i<=(n-2)/2;i++){ 
            int left = (2*i)+1;
            int right = (2*i)+2;
            
            //check if left child exixst and valid
            if(left < n && arr[i]>arr[left]){ //parent is graeter
                return false;
            }
            
            //check if right child exixst and valid
            if(right < n && arr[i]>arr[right]){ //parent is greater
                return false;
            }
        }
        
        return true;
    }

}
