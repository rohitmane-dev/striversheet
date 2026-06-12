import java.util.*;


class ListRep {
    public static void main(String[] args) {
        System.out.println("How many nodes that you want to give as an input ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>>li = new ArrayList<>();

        for(int i=0;i<n+1;i++){
            li.add(new ArrayList<>());
        }

        System.out.println("Enter the nodes in pair of their connection");
        for(int i=0;i<n;i++){
            System.out.println("Enter your "+ (i+1) +" th node pair ");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            if(!li.get(v1).contains(v2))li.get(v1).add(v2); //ensures to add the unique elem as neigbour
            if(!li.get(v2).contains(v1))li.get(v2).add(v1);
           
        }

        for (int i = 0; i < n+1; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : li.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

    }
}
