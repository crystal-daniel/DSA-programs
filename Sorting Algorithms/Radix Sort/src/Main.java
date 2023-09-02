import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    int getMax(int [] a, int n)
    {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    void radixSort(int [] a, int n)
    {
        int max = getMax(a,n);
        for (int pos = 1; max/pos > 0; pos = pos*10) {
            int [] count = {0,0,0,0,0,0,0,0,0,0};
            int [] b = new int[n];
            for (int i = 0; i < n; i++) {
                ++count[(a[i]/pos)%10];
            }
            for (int i = 1; i < 10; i++) {
                count[i] = count[i] + count[i-1];
            }
            for (int i = n-1; i >= 0 ; i--) {
                b[--count[(a[i]/pos)%10]] = a[i];
            }
            System.arraycopy(b, 0, a, 0, n); //copies elements of array b to array a
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
        System.out.println(Arrays.toString(a));
        Main obj = new Main();
        obj.radixSort(a,n);
        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(a));
    }
}
