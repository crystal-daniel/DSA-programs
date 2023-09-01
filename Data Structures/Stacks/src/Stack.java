public class Stack {
    int [] s=new int[5];
    int top=-1;
    boolean isFull()
    {
        return top >= 5-1;
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    void push(int num)
    {
        s[++top]=num;
    }
    void pop()
    {
        top--;
    }
    void display()
    {
        for(int i=top;i>=0;i--)
            System.out.print(s[i]+ "\t");
        System.out.println();
    }
}
