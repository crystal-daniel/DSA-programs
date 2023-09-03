import java.util.Scanner;

public class LinkedList {
    Node temp, head, temp2, head1;
    Node create(int data) {
        Node newnode = new Node();
        newnode.prev = null;
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
            while (temp != null) {
                System.out.print(" -> "+temp.data);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    void insert_at_beg(int data) {
        temp = create(data);

        if (head != null) {
            temp.next = head;
            temp.prev = null;
        }
        head = temp;
    }
    void insert_at_end(int data) {
        temp = create(data);
        if (head == null) {
            head = temp;
        } else {
            temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
            temp.prev = temp2;
        }
    }
    void insert_at_pos(int pos, int data) {
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
            temp2.next.prev = temp;
            temp2.next = temp;
            temp.prev = temp2;
        }
    }
    void delete_at_beg() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.next == null)
            head = null;
        else {
            head = head.next;
            head.prev = null;
        }
    }
    void delete_at_end() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.next == null)
            head = null;
        else {
            temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }
    void delete_at_pos(int pos) {
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
            temp.next.prev = temp2;
            temp = null;
        }
    }
    void search(int data) {
        temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Data is found in the list");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data is not found in the list");
    }
    void concatenate()
    {
        Scanner in = new Scanner(System.in);
        int n;
        temp = head;
        System.out.println("Enter the number of elements in second DLL: ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data: ");
            int data = in.nextInt();
            if(head1 == null)
            {
                head1=create(data);
            }
            else
            {
                temp2 = head1;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }
                temp2.next = create(data);
                temp2.next.prev = temp2;
            }
        }
        temp2 = head1;
        System.out.println("DLL 2: ");
        while(temp2!=null)
        {
            System.out.print(temp2.data+"\t");
            temp2 = temp2.next;
        }
        System.out.println();
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = head1;
        head1.prev = temp;
        System.out.println("linked lists concatenated successfully!");
    }
}
