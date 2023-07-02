import java.util.*;
public class SelectionSort {
    void selection_sort(int [] a,int n)
    {
        int i,j,temp,index;
        for(i=0;i<n-1;i++)
        {
            index=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[index])
                {
                    index=j;
                }
            }
            if(i!=index)
            {
                temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
        }
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
            a[i]=random.nextInt(100);
        }
        System.out.println("Array before sorting: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        double startTime = System.currentTimeMillis();
        SelectionSort s = new SelectionSort();
        s.selection_sort(a,n);
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
