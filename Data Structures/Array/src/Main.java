import java.util.*;
public class Main {
    static int [] a;
    static Scanner in = new Scanner(System.in);
    static int size;
    void display()
    {
        if(size==0)
            System.out.println("Array is empty");
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + "\t");
            }
            System.out.println();
        }
    }
    void insert()
    {
        if(size==20)
            System.out.println("Array size is full");
        else {
            System.out.println("Enter the element you want to insert");
            int n = in.nextInt();
            System.out.println("Enter the position where you want to insert the element");
            int pos = in.nextInt();
            pos--;
            for (int i = size; i > pos; i--) {
                a[i] = a[i - 1];
            }
            a[pos] = n;
            size++;
            System.out.println(n+" is added successfully");
        }
    }
    void delete()
    {
        if(size==0)
            System.out.println("Array is empty");
        else {
            System.out.println("Enter the position from where you want to delete an element");
            int pos= in.nextInt();
            pos--;
            System.out.println(a[pos]+" is deleted successfully");
            for (int i = pos; i < size-1; i++) {
                a[i]=a[i+1];
            }
            size--;
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println("Enter the size of the array");
        size= in.nextInt();
        a = new int [20];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            a[i]= in.nextInt();
        }
        System.out.println("1. Insert an element");
        System.out.println("2. Delete an element");
        System.out.println("3. Display the array");
        System.out.println("4. Exit");
        int ch;
        do {
            System.out.println("Enter your choice: ");
            ch= in.nextInt();
            switch (ch) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.display();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid Input! Enter again");
            }
        }while(true);
    }
}
