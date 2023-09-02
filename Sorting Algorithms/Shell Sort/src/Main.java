import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    void shellSort(int [] a, int n)
    {
        for (int gap = n/2; gap > 0; gap/=2) {
            for (int j = gap; j < n; j++) {
                for (int i = j-gap; i >= 0 ; i-=gap) {
                    if(a[i+gap]<a[i])
                    {
                        int temp = a[i+gap];
                        a[i+gap] = a[i];
                        a[i] = temp;
                    }
                    else
                        break;
                }
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
        obj.shellSort(a,n);
        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(a));
    }
}
