import java.util.*;
class ps3{
    public static void main(String[] args) {
        
        solution s = new solution();
        List<List<Integer>>li = new ArrayList<>();
        li.add(Arrays.asList(0,1,0));
        li.add(Arrays.asList(0,0,0));
        li.add(Arrays.asList(0,1,0));
        System.out.println(s.sol(li));
    }
}

class solution{
    public int sol(List<List<Integer>>li){
        int n= li.size();
        // int celebrity=-1;

        for(int i=0;i<n;i++){
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(i==j)continue;

                if(li.get(i).get(j)==0 && li.get(j).get(i)==1)flag = true;
                if(!flag)break;
            }
            if(flag)return i;
            
        }

        return -1;
    }
}