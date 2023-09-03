import java.util.Scanner;

public class Main {
    static int [] q = new int[10];
    int f =-1, r = -1;
    static Scanner in = new Scanner(System.in);
    void enqueue()
    {
        if(((r+1)%10)==f)
            System.out.println("Queue is full!");
        else {
            System.out.println("Enter the number you want to insert: ");
            int n = in.nextInt();
            if (f == -1 && r == -1) {
                f = r = 0;
            }
            else
            {
                r = (r + 1) % 10;
            }
            q[r] = n;
            System.out.println(n+" inserted successfully!");
        }
    }
    void dequeue()
    {
        if(f ==-1 && r == -1)
            System.out.println("Queue is empty!");
        else
        {
            System.out.println(q[f]+" deleted successfully!");
            if(f==r)
                f=r=-1;
            else
                f = (f+1)%10;
        }
    }
    void display()
    {
        if(f ==-1 && r == -1)
            System.out.println("Queue is empty!");
        else {
            int i = f;
            while(i!=r) {
                System.out.print(q[i] + "\t");
                i = (i+1)%10;
            }
            System.out.println(q[r]);
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int ch,n;
        System.out.println("1. Add\n2. Delete\n3. Display\n4. Exit");
        do {
            System.out.println("Enter your choice: ");
            ch=in.nextInt();
            switch (ch) {
                case 1 -> obj.enqueue();
                case 2 -> obj.dequeue();
                case 3 -> obj.display();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please enter again!");
            }
        }while(true);
    }
}