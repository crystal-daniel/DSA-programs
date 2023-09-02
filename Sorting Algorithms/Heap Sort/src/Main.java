import java.util.Random;
import java.util.Scanner;

public class Main {
    static int n;
    void constructHeap(int [] h)
    {
        int k,u,j;
        boolean heap;
        for (int i = n/2; i > 0 ; i--) {
            k = i;
            u = h[k]; //parent
            heap = false;
            while(!heap && 2*k<=n)
            {
                j = 2*k;
                if(j<n)
                {
                    if(h[j]<h[j+1])
                    {
                        j++;
                    }
                }
                if(u>=h[j])
                {
                    heap = true;
                }
                else
                {
                    h[k] = h[j];
                    k = j;
                }
                h[k] = u;
            }
        }
    }

    void delete(int [] h)
    {
        int temp = h[1];
        h[1] = h[n];
        h[n] = temp;
        n--;
        constructHeap(h);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = in.nextInt();
        int len = n;
        int [] h = new int[n+1];
        Random r = new Random();
        for (int i = 1; i <= n ; i++) {
            h[i] = r.nextInt(100);
        }
        System.out.println("Array before sorting: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(h[i]+"\t");
        }
        System.out.println();
        Main obj = new Main();
        obj.constructHeap(h);
        while(n>1)
            obj.delete(h);
        System.out.println("Array after sorting: ");
        for (int i = 1; i <= len; i++) {
            System.out.print(h[i]+"\t");
        }
    }
}
