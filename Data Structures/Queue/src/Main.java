import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        Scanner input=new Scanner(System.in);
        int ch,n;
        System.out.println("1. Add\n2. Delete\n3. Display\n4. Exit");
        do {
            System.out.println("Enter your choice: ");
            ch=input.nextInt();
            switch (ch) {
                case 1 -> {
                    if (queue.isFull())
                        System.out.println("Queue Overflow!");
                    else {
                        System.out.println("Enter a number to add:");
                        n = input.nextInt();
                        queue.enqueue(n);
                    }
                }
                case 2 -> {
                    if (queue.isEmpty())
                        System.out.println("Queue underflow!");
                    else
                        queue.dequeue();
                }
                case 3 -> {
                    if (queue.isEmpty())
                        System.out.println("Queue is empty!");
                    else
                        queue.display();
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please enter again!");
            }
        }while(true);
    }
}
