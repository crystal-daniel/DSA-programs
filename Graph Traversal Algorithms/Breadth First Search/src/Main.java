import java.util.Scanner;

public class Main {
    void BFS(int [][] a,int n, int source)
    {
        int [] s = new int[n], q = new int[n];
        int r = 0, f = 0, k = 0;
        int [][] t = new int[n][2];
        s[source] = 1;
        q[r]=source;
        r++;
        int u;
        while(f<r)
        {
            u=q[f];
            f++;
            for (int i = 0; i < n; i++) {
                if(a[u][i]==1 && s[i]!=1)
                {
                    s[i]=1;
                    q[r]=i;
                    r++;
                    t[k][0]=u;
                    t[k][1]=i;
                    k++;
                }
            }
        }
        System.out.println("Path: ");
        for (int i = 0; i < k; i++) {
            System.out.println(t[i][0]+" --> "+t[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = in.nextInt();
        int [][] a = new int[n][n];
        System.out.println("Enter the adjacency matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the source vertex: ");
        int source = in.nextInt();
        Main obj = new Main();
        obj.BFS(a,n,source);
    }
}
