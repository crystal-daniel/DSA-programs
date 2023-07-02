import java.util.*;
public class QuickSort {
    public void quicksort(int [] a,int low, int high)
    {
        int pi;
        if(low<high)
        {
            pi=partition(a,low,high);
            quicksort(a,low,pi-1);
            quicksort(a,pi+1,high);
        }
    }
    public int partition(int [] a,int low, int high)
    {
        int p=a[high];
        int pi=low;
        for(int j=low;j<high;j++)
        {
            if(a[j]<=p)
            {
                int temp=a[j];
                a[j]=a[pi];
                a[pi]=temp;
                pi++;
            }
        }
        int temp=a[pi];
        a[pi]=a[high];
        a[high]=temp;
        return pi;
    }

    public static void main(String[] args) {
        int i, n;
        int [] a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=in.nextInt();
        a=new int[n];
        Random random=new Random();
        for (i = 0; i < n; i++) {
            a[i]=random.nextInt(1,100);
        }
        System.out.println("Array before sorting: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        double startTime = System.currentTimeMillis();
        QuickSort qs = new QuickSort();
        qs.quicksort(a,0,n-1);
        double stopTime = System.currentTimeMillis();
        double elapsedTime = stopTime - startTime;
        System.out.println("Sorted array: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        System.out.println("Time taken to sort is "+elapsedTime+" milliseconds");
    }
}
