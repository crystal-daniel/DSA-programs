import java.util.*;
public class Knapsack {
    static void display(float [] w, float [] p, float [] ratio, int n)
    {
        System.out.println("ITEM\tWEIGHT\tPROFIT\tRATIO");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"\t"+w[i]+"\t"+p[i]+"\t"+ratio[i]);
        }
    }
    static void sort(float [] w, float [] p, float [] ratio, int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=n-i-1;j++)
            {
                if(ratio[j]<ratio[j+1])
                {
                    float temp=ratio[j];
                    ratio[j]=ratio[j+1];
                    ratio[j+1]=temp;
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
    }
    static void knapsack (int u, int n,float [] w, float [] p)
    {
        float [] x= new float[n+1];
        float tp=0;
        int i;
        for(i=0;i<=n;i++)
        {
            x[i]=0;
        }
        for(i=1;i<=n;i++)
        {
            if(w[i]>u)
            {
                break;
            }
            else
            {
                x[i]=1;
                tp=tp+p[i];
                u=(int)(u-w[i]);
            }
        }
        if(i<n)
        {
            x[i]=u/w[i];
            tp=tp+(x[i]*p[i]);
        }
        System.out.println("The result is: ");
        for(i=1;i<=n;i++)
        {
            System.out.print(x[i]+"\t");
        }
        System.out.println("\nMaximum profit is: "+tp);
    }
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("**************KNAPSACK PROBLEM**************");
        System.out.println("Enter the number of items: ");
        int n=in.nextInt();
        float [] w=new float[n+1];
        float [] p=new float[n+1];
        float [] ratio=new float[n+1];
        System.out.println("Enter the weight and corresponding profit of every item: ");
        for(int i=1;i<=n;i++)
        {
            w[i]=in.nextInt();
            p[i]=in.nextInt();
            ratio[i]=p[i]/w[i];
        }
        System.out.println("Enter the capacity: ");
        int u=in.nextInt();
        System.out.println("Information about Knapsack problem are: ");
        display(w,p,ratio,n);
        sort(w,p,ratio,n);
        System.out.println("Details after sorting items based on profit/weight ratio in descending order: ");
        display(w,p,ratio,n);
        knapsack(u,n,w,p);
    }
}
