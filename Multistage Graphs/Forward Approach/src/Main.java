public class Main {
    void forwardApproach(int [][] c, int n, int k)
    {
        int min;
        int [] cost = new int[n+1];
        int [] d = new int[n+1]; //to store distance
        int [] path = new int[n+1];
        cost[n] = 0;
        for (int j = n-1; j >=1 ; j--) {
            min = 9999;
            for (int r = j+1; r <= n ; r++) {
                if(c[j][r]!=0 && c[j][r]+cost[r]<min)
                {
                    min = c[j][r]+cost[r];
                    d[j] = r;
                }
            }
            cost[j] = min;
        }
        path[1] = 1;
        path[k] = n;
        for (int j = 2; j < k; j++) {
            path[j] = d[path[j-1]];
        }
        System.out.println("Minimum Path: ");
        System.out.print(path[1]);
        for (int i = 2; i <= k ; i++) {
            System.out.print(" --> "+path[i]);
        }
    }

    public static void main(String[] args) {
        int stages = 5;
        int [][] cost ={
                {0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,9,7,3,2,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,4,0,1,0,0,0,0},
                {0,0,0,0,0,0,2,7,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,11,0,0,0,0},
                {0,0,0,0,0,0,0,11,8,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,6,5,0,0},
                {0,0,0,0,0,0,0,0,0,4,3,0,0},
                {0,0,0,0,0,0,0,0,0,0,5,6,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,4},
                {0,0,0,0,0,0,0,0,0,0,0,0,2},
                {0,0,0,0,0,0,0,0,0,0,0,0,5},
                {0,0,0,0,0,0,0,0,0,0,0,0,0},
        };
        Main obj = new Main();
        obj.forwardApproach(cost, 12, 5);
    }
}
