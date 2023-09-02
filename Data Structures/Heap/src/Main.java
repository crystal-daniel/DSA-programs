import java.util.Scanner;

public class Main {
    static int n;
    static Scanner in = new Scanner(System.in);
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

    void display(int [] h)
    {
        if(n==0)
        {
            System.out.println("Heap is empty");
        }
        else {
            System.out.println("Heap: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(h[i] + "\t");
            }
            System.out.println();
        }
    }

    void insert(int [] h)
    {
        if(n==19)
        {
            System.out.println("Heap is full!");
        }
        else {
            System.out.println("Enter the element you want to insert: ");
            h[++n] = in.nextInt();
            System.out.println(h[n]+" inserted successfully!");
            int i = n;
            while(i > 1) {
                int u = i / 2;
                if(h[i] > h[u])
                {
                    int temp = h[i];
                    h[i] = h[u];
                    h[u] = temp;
                    i = u;
                }
                else
                    return;
            }
        }
    }

    void delete(int [] h)
    {
        if(n==0)
        {
            System.out.println("Heap is empty!");
        }
        else
        {
            System.out.println(h[1] + " is deleted successfully!");
            h[1] = h[n--];
            constructHeap(h);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        n = in.nextInt();
        int [] h = new int[20];
        System.out.println("Enter heap elements: ");
        for (int i = 1; i <= n ; i++) {
            h[i] = in.nextInt();
        }
        Main obj = new Main();
        obj.constructHeap(h);
        System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit");
        do {
            System.out.println("Enter your choice: ");
            int ch = in.nextInt();
            switch (ch) {
                case 1 -> obj.insert(h);
                case 2 -> obj.delete(h);
                case 3 -> obj.display(h);
                case 4 -> {
                    System.out.println("Program terminating");
                    System.exit(0);
                }
                case 5 -> {
                    System.out.println("Invalid input! Program terminating.");
                    System.exit(0);
                }
            }
        }while(true);
    }
}
