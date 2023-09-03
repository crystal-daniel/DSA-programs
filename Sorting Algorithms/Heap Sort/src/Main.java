import java.util.Random;
import java.util.Scanner;
public class Main {
    static int n;
    void maxHeapify(int [] h, int i)
    {
        int largest = i;
        int l = (2*i);
        int r = (2*i)+1;
        if(l<=n && h[l]>h[largest])
            largest = l;
        if(r<=n && h[r]>h[largest])
            largest = r;
        if(largest!=i)
        {
            int temp = h[largest];
            h[largest] = h[i];
            h[i] = temp;
            maxHeapify(h, largest);
        }
    }
    void heapSort(int [] h)
    {
        for (int i = n/2; i >= 1 ; i--) {
            maxHeapify(h,i);
        }
        int temp;
        for(int i = n; i>=1;i--)
        {
            temp = h[1];
            h[1] = h[i];
            h[i] = temp;
            n--;
            maxHeapify(h,1);
        }
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
        obj.heapSort(h);
        System.out.println("Array after sorting: ");
        for (int i = 1; i <= len; i++) {
            System.out.print(h[i]+"\t");
        }
    }
}