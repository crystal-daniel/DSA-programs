import java.util.Scanner;

class Prims {
    void prim(int n, int[][] a) {
        int i, j, k, u, v;
        int sum, min, source;
        int[] p = new int[10];
        int[] d = new int[10];
        int[] s = new int[10];
        int[][] t = new int[10][2];
        min = 9999;
        source = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[i][j] != 0 && a[i][j] <= min) {
                    min = a[i][j];
                    source = i;
                }
            }
        }
        for (i = 0; i < n; i++) {
            d[i] = a[source][i];
            p[i] = source;
            s[i] = 0;
        }
        s[source] = 1;
        sum = 0;
        k = 0;
        for (i = 1; i < n; i++) {
            min = 9999;
            u = -1;
            for (j = 0; j < n; j++) {
                if (s[j] == 0) {
                    if (d[j] < min) {
                        min = d[j];
                        u = j;
                    }
                }
            }
            if (u == -1)
                return;
            t[k][0] = u;
            t[k][1] = p[u];
            k++;
            sum = sum + a[u][p[u]];
            s[u] = 1;
            for (v = 0; v < n; v++) {
                if (s[v] == 0 && a[u][v] < d[v]) {
                    d[v] = a[u][v];
                    p[v] = u;
                }
            }
        }
        if (sum >= 9999) {
            System.out.println("spanning tree does not exists\n");
        }
        else {
            System.out.println("The Spanning Tree Exists and Minimum Spanning Tree is");
            for (i = 0; i < n - 1; i++) {
                System.out.println(t[i][0] + "--->" + t[i][1]);
            }
            System.out.println("The cost of the Spanning Tree = " + sum);
        }
    }

    public static void main(String[] args) {
        int i, j, n;
        Prims p = new Prims();
        int [][] cost = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        n = sc.nextInt();
        System.out.println("Enter the adjacency matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        p.prim(n, cost);
    }
}


