public class Queue {
    int [] q = new int[5];
      int f,r=-1;
      boolean isFull()
      {
          return r == 4;
      }
      boolean isEmpty()
      {
          return f==-1 && r==-1;
      }
      void enqueue(int n)
      {
          if(f==-1 && r==-1)
          {
              f=r=0;
              q[r]=n;
          }
          else
              q[++r]=n;
      }
      void dequeue()
      {
          if(f==r)
              f=r=-1;
          else
              f++;
      }
      void display()
      {
          for (int i = f; i <=r ; i++) {
              System.out.print(q[i] + "\t");
          }
          System.out.println();
      }
}
