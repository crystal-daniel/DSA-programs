public class Main {
    void backwardGraph(int [][] c, int n, int k)
    {
        int min;
        int [] cost = new int[n+1];
        int [] d = new int[n+1]; //to store distance
        int [] path = new int[n+1];
        cost[1] = 0;
        for (int j = 2; j <= n ; j++) {
            min = 9999;
            for (int r = j-1; r >= 1 ; r--) {
                if(c[r][j]!=0 && c[r][j]+cost[r]<min)
                {
                    min = c[r][j]+cost[r];
                    d[j] = r;
                }
            }
            cost[j] = min;
        }
        path[1] = 1;
        path[k] = n;
        for (int j = k-1; j >= 2; j--) {
            path[j] = d[path[j+1]];
        }
        System.out.println("Minimum Path: ");
        System.out.print(path[1]);
        for (int i = 2; i <= k ; i++) {
            System.out.print(" --> "+path[i]);
        }
    }

    public static void main(String[] args) {
        int stages = 5;
        int n = 9;
        int [][] cost ={
                {0,0,0,0,0,0,0,0,0,0},
                {0,0,5,2,0,0,0,0,0,0},
                {0,0,0,0,3,0,3,0,0,0},
                {0,0,0,0,6,5,8,0,0,0},
                {0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,6,7,0},
                {0,0,0,0,0,0,0,6,2,0},
                {0,0,0,0,0,0,0,0,0,7},
                {0,0,0,0,0,0,0,0,0,3},
                {0,0,0,0,0,0,0,0,0,0},
        };
        Main obj = new Main();
        obj.backwardGraph(cost, n, stages);
    }
}
