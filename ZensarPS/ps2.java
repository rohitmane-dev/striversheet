class ps2{
    public static void main(String[] args) {
        solution s = new solution();
        String str = "abbbabbbaaa";
        System.out.println(s.Findout(str));
    }
}

class solution{
    static int max = Integer.MIN_VALUE;
    public int Findout(String s){
        max = Integer.MIN_VALUE;
        helper(s,0,s.length()-1,0);
        return max;
    }
    private static void helper(String s,int start,int end, int cnt){
        if(start>=end){
            cnt = cnt+1;
            max = Math.max(max,cnt);
            return;
        }
        if(start == end ){
            max = Math.max(max,cnt);
            return ;
        }

        if(s.charAt(end)==s.charAt(start)){
            
            helper(s,start+1,end-1, cnt+2);
        }else{
            helper(s,start+1,end, cnt);
            helper(s,start,end-1,cnt);
        }
        
    }
    
}