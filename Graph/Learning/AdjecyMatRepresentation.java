import java.util.*;
// Graph is mainly represented using 2 ways 
// 1. Adjency Matrix 
// 2. ArrayList<ArrayList<Integer>>
//lets implement a matrix technique for undireacted graph...

class AdjecyMatRepresentation{
    public static void main(String[] args) {
        System.out.println("How many nodes that you want to give as an input ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]mat = new int[n+1][n+1];

        System.out.println("Enter the nodes in pair of their connection");
        for(int i=0;i<n;i++){
            System.out.println("Enter your "+ (i+1) +" th node pair ");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            mat[v1][v2]=1;
            mat[v2][v1]=1;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
        }

       // System.out.println(mat);
    }
}