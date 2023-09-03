import java.util.Scanner;

public class LinkedList {
    Node head, temp, temp2, head1, last, last1;

    Node create(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        return newnode;
    }

    void display() {
        temp = head;
        if (temp == null)
            System.out.println("List is empty");
        else {
            System.out.print(temp.data);
            temp=temp.next;
            while (temp != head) {
                System.out.print(" -> "+temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void insert_at_beg(int data) {
        temp = create(data);
        if(head==null)
        {
            head = temp;
            temp.next = head;
            last = head;
        }
        else {
            temp.next = head;
            head = temp;
            last.next = head;
        }
        System.out.println("Data inserted successfully!");
    }

    void insert_at_end(int data) {
        temp = create(data);
        if (head == null) {
            head = temp;
            temp.next = head;
            last = head;
        }
        else {
            last.next = temp;
            temp.next = head;
            last = temp;
        }
        System.out.println("Data inserted successfully!");
    }

    void insert_at_pos(int pos, int data) {
        pos--;
        if (pos < 0)
            System.out.println("invalid index");
        else if (pos == 0)
            insert_at_beg(data);
        else {
            temp = create(data);
            temp2 = head;
            for (int i = 0; i < pos - 1; i++) {
                temp2 = temp2.next;
            }
            temp.next = temp2.next;
            temp2.next = temp;
            System.out.println("Data inserted successfully!");
        }
    }

    void delete_at_beg() {
        if (head == null)
            System.out.println("List is empty");
        else {
            if (head.next == head)
                head = null;
            else {
                head = head.next;
            }
            System.out.println("Data deleted successfully!");
        }
    }

    void delete_at_end() {
        if (head == null)
            System.out.println("List is empty");
        else {
            if (head.next == head)
                head = null;
            else {
                temp = head;
                while (temp.next.next != head)
                    temp = temp.next;
                temp.next = head;
                last = temp;
            }
            System.out.println("Data deleted successfully!");
        }
    }

    void delete_at_pos(int pos) {
        pos--;
        if(pos<0) {
            System.out.println("Invalid position!");
            return;
        }
        if (head == null)
            System.out.println("List is empty");
        else if (pos == 0)
            delete_at_beg();
        else {
            temp = temp2 = head;
            while (pos != 0) {
                temp2 = temp;
                temp = temp.next;
                pos--;
            }
            temp2.next = temp.next;
            temp = null;
            System.out.println("Data deleted successfully!");
        }
    }

    void search(int data) {
        temp = head;
        while (temp != last) {
            if (temp.data == data) {
                System.out.println("Data is found in the list");
                return;
            }
            temp = temp.next;
        }
        if(last.data == data)
            System.out.println("Data is found in the list");
        else
            System.out.println("Data is not found in the list");
    }

    void concatenate()
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in second SLL: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data: ");
            int data = in.nextInt();
            if (head1 == null) {
                head1 = create(data);
                head1.next = head1;
                last1 = head1;
            }
            else {
                last1.next = create(data);
                last1.next.next = head1;
                last1 = last1.next;
            }
        }
        temp2 = head1;
        System.out.println("SLL 2: ");
        while(temp2!=last1)
        {
            System.out.print(temp2.data+"\t");
            temp2 = temp2.next;
        }
        System.out.println(last1.data);
        last.next = head1;
        last1.next = head;
        last = last1;
        System.out.println("linked lists concatenated successfully!");
    }
}
