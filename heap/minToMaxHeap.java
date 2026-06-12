public class minToMaxHeap {
    // User function Template for Java
    public static void main(String[] args) {
        int [] arr= {10,20,30,21,22,31,33,41};
        convertMinToMaxHeap(8, arr);

        for(int num : arr){  //Prints the result
            System.out.println(num);
        }
    }

    static void convertMinToMaxHeap(int N, int arr[]) { //Conversion function
        // code here
        for(int i=(N-2)/2;i>=0;i--){
            maxHeapify(arr , i, N);
        }
    }
    
    static void maxHeapify(int [] arr , int i , int N){ //Do the Heapify process for every change in the array
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i; //Assuming parent as a largets element
        
        if(left<N && arr[left]>arr[largest]){ //left child exist and it have higher value
            largest = left;
        }
        if(right < N && arr[right]>arr[largest]){ //right child exist and have higher value
            largest = right;
        }
        
        if(largest!= i){ //It means the largets eemnt is got a update
            
            int temp = arr[i]; //Swaping the elements within the Array
            arr[i]= arr[largest];
            arr[largest]=temp;
            
            maxHeapify(arr, largest ,N ); //Do the heapify as considering largest as parent and checking for downward..
        }
    }
    


}
