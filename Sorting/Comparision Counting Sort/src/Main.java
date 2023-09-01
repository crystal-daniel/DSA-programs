import java.util.Random;
import java.util.Scanner;

public class Main {
    int [] comparisionCountingSort(int [] a, int n)
    {
        int [] count = new int[n],s=new int[n];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]<a[j])
                {
                    count[j]=count[j]+1;
                }
                else
                {
                    count[i]=count[i]+1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            s[count[i]]=a[i];
        }
        return s;
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
        Main obj = new Main();
        obj.comparisionCountingSort(a,n);
        System.out.println("Sorted array: ");
//        for (i = 0; i < n; i++) {
//            System.out.print(a[i] + "\t");
//        }
    }
}
