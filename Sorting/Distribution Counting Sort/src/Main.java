import java.util.Arrays;

public class Main {
    int [] distributionCountingSort(int [] a, int n, int u, int l)
    {
        int [] d = new int [u-l+1],s = new int[n];
        for (int i = 0; i < n; i++) {
            d[a[i]-l]=d[a[i]-l]+1;
        }
        for (int j = 1; j <= u-l; j++) {
            d[j]=d[j-1]+d[j];
        }
        for (int i = n-1; i >=0 ; i--) {
            int j=a[i]-l;
            s[d[j]-1]=a[i];
            d[j]=d[j]-1;
        }
        return s;
    }

    public static void main(String[] args) {
        int [] a = {12,12,13,11,13,12};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(a));
        Main obj = new Main();
        a=obj.distributionCountingSort(a,6,13,11);
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(a));
    }
}
