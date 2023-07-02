import java.util.*;
public class MergeSort {
    public void mergesort(int [] a,int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public void merge(int [] a, int low, int mid, int high)
    {
        int i,j,k;
        int n1=mid-low+1;
        int n2=high-mid;
        int [] l = new int[n1];
        int [] r = new int[n2];
        for (i = 0; i < n1; i++) {
            l[i] = a[low+i];
        }
        for (j = 0; j < n2; j++) {
            r[j] = a[mid+1+j];
        }
        i=0;
        j=0;
        k=low;
        while(i<n1 && j<n2)
        {
            if(l[i]<=r[j])
            {
                a[k]=l[i];
                i++;
            }
            else
            {
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=l[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=r[j];
            j++;
            k++;
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
            a[i]=random.nextInt(1,100);
        }
        System.out.println("Array before sorting: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        double startTime = System.currentTimeMillis();
        MergeSort ms = new MergeSort();
        ms.mergesort(a,0,n-1);
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
