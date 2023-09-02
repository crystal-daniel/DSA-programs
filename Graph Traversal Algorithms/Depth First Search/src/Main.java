import java.util.Scanner;

public class Main {
    static int [] s;
    static int [][] t;
    static int k = 0;
    void DFS(int [][] a, int source, int n)
    {
        s[source] = 1;
        for (int i = 0; i < n; i++) {
            if(a[source][i]==1 && s[i]!=1)
            {
                t[k][0] = source;
                t[k][1] = i;
                k++;
                DFS(a,i,n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = in.nextInt();
        int [][] a = new int[n][n];
        s = new int[n];
        t = new int[n][2];
        System.out.println("Enter the adjacency matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the source vertex: ");
        int source = in.nextInt();
        Main obj = new Main();
        obj.DFS(a,source,n);
        System.out.println("Path: ");
        for (int i = 0; i < k; i++) {
            System.out.println(t[i][0]+" --> "+t[i][1]);
        }
    }
}
