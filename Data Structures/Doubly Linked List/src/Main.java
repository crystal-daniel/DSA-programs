import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int ch, data, pos;

        System.out.println("1. Insert at beginning");
        System.out.println("2. Insert at end");
        System.out.println("3. Insert at given position");
        System.out.println("4. Delete at beginning");
        System.out.println("5. Delete at end");
        System.out.println("6. Delete at given position");
        System.out.println("7. Search any data");
        System.out.println("8. Display");
        System.out.println("9. Exit");

        do {
            System.out.println("Enter your choice: ");
            Scanner input = new Scanner(System.in);
            ch = input.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the data you want to insert: ");
                    data = input.nextInt();
                    list.insert_at_beg(data);
                }
                case 2 -> {
                    System.out.println("Enter the data you want to insert: ");
                    data = input.nextInt();
                    list.insert_at_end(data);
                }
                case 3 -> {
                    System.out.println("Enter the data you want to insert: ");
                    data = input.nextInt();
                    System.out.println("Enter the position at which you want to insert: ");
                    pos = input.nextInt();
                    list.insert_at_pos(pos, data);
                }
                case 4 -> list.delete_at_beg();
                case 5 -> list.delete_at_end();
                case 6 -> {
                    System.out.println("Enter the position from which you want to delete: ");
                    pos = input.nextInt();
                    list.delete_at_pos(pos);
                }
                case 7 -> {
                    System.out.println("Enter the data you want to search: ");
                    data = input.nextInt();
                    list.search(data);
                }
                case 8 -> list.display();
                case 9 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please enter again!");
            }
        } while (true);
    }
}