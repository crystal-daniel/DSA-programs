import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        Scanner input=new Scanner(System.in);
        int ch,num;
        System.out.println("1. Push\n2. Pop\n3. Display\n4. Display");
        do {
            System.out.println("Enter your choice: ");
            ch=input.nextInt();
            switch (ch) {
                case 1 -> {
                    if (stack.isFull())
                        System.out.println("Stack Overflow");
                    else {
                        System.out.println("Enter the number you want to push");
                        num = input.nextInt();
                        stack.push(num);
                    }
                }
                case 2 -> {
                    if (stack.isEmpty())
                        System.out.println("Stack Underflow");
                    else
                        stack.pop();
                }
                case 3 -> {
                    if (stack.isEmpty())
                        System.out.println("Stack is empty");
                    else
                        stack.display();
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input. Please enter again!");
            }
        }while(true);
    }
}
