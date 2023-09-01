import java.util.Scanner;

public class Main {
    void linearSearch(int [] a,int key)
    {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key) {
                System.out.println("Key is found at position " + (i + 1));
                System.exit(0);
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
        obj.linearSearch(a,key);
    }
}