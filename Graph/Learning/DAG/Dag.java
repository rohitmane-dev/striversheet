class Dag{

    public static void main(String[] args) {
        System.out.println("Hello World");


        Solution s = new Solution();
        int [][]mat = {{-1,4,-1,-1,-1,2},
                        {-1,-1,3,-1,-1,-1},
                        {-1,-1,-1,6,-1,-1},
                        {-1,-1,-1,-1,-1,-1},
                        {9,-1,-1,8,-1,4},
                        {-1,-1,1,-1,-1,-1}};
        int []res = s.minCost(mat);
        for(int i:res){

            // i== Integer.MAX_VALUE ? System.out.print("INF ") : System.out.print(i+" ");
            System.out.print(i+" ");
        }
    }


}

class Solution{
    public int[] minCost(int [][]mat ){
        int m = mat.length;
        int n = mat[0].length;
        int []cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i] = Integer.MAX_VALUE;
        }
        
        cost[0] = 0;
        solve(mat,0,cost);
        return cost;
    }

    private void solve(int [][]mat, int i, int []cost){
        for(int j=0;j<mat.length;j++){

            if(mat[i][j] != -1 ){

                cost[j] = Math.min(
                    cost[j],
                    cost[i] + mat[i][j]
                );

                solve(mat,j,cost);
            }
        }
    }
    
}
