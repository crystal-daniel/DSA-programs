public class LinkedList {
    Node head, temp, temp2;

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
            while (temp != null) {
                System.out.println(temp.data + "\t");
                temp = temp.next;
            }
        }
    }

    void insert_at_beg(int data) {
        temp = create(data);

        if (head != null) {
            temp.next = head;
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
            temp2.next = temp;
        }
    }

    void delete_at_beg() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.next == null)
            head = null;
        else {
            head = head.next;
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
}
