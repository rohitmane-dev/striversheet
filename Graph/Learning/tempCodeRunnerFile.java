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