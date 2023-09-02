import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    void insertionSort(int [] a, int n)
    {
        int j, temp;
        for (int i = 1; i < n; i++) {
            j = i;
            while(j>0 && a[j-1]>a[j])
            {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    j--;
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
        System.out.println(Arrays.toString(a));
        Main obj = new Main();
        obj.insertionSort(a,n);
        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(a));
    }
}
