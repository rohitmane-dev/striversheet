import java.util.*;

class maxMinHeap{

    static int [] heap;
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input array");
        //int n = sc.nextInt();

        int n = 7;

         int [] arr = {10,15,16,20,30,50,8};
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }/


        makeMinHeap(arr);

        System.err.println("Expected Heap is look like: ");
        for(int num : heap){
            System.out.println(num);
        }
    }

    private static void makeMinHeap(int [] arr){
        int n = arr.length;
        heap = new int [n];
        System.out.println("Which type of heap you want ?");
        System.out.println("OPtion 1 : Max Heap option 2: Min Heap ");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
 
        for(int i=0;i<n;i++){
            heap[i]=arr[i];
            heapifyUp(i ,type );

        }
    }

    private static void heapifyUp(int a,  int type){
        if(type==1){
            if(a>0 && heap[a]>heap[parentOf(a)]){
            swap(a,parentOf(a));    
            heapifyUp(parentOf(a),type);
            }
        }else if(type==2){
            if(a>0 && heap[a]<heap[parentOf(a)]){
            swap(a,parentOf(a));    
            heapifyUp(parentOf(a),type);
            }
        }
        

    }

    private static int parentOf(int i){ return (i-1)/2;}
    private static int leftChild(int i){ return 2*i+ 1;}
    private static int rightChild(int i){ return 2*i+2;}
    private static void swap(int i1 , int i2){
        int temp = heap[i1];
        heap[i1]=heap[i2];
        heap[i2]=temp;
    }

}