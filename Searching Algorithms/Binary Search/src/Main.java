import java.util.Scanner;

public class Main {
    void binarySearch(int [] a,int key)
    {
        int low=0;
        int high=a.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (a[mid]==key)
            {
                System.out.println("key is found at position "+(mid+1));
                System.exit(0);
            } else if (key<a[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        System.out.println("key is not found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = in.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the key to be searched: ");
        int key = in.nextInt();
        Main obj = new Main();
        obj.binarySearch(a,key);
    }
}