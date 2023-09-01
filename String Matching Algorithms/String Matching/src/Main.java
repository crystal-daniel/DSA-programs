import java.util.Scanner;

public class Main {
    boolean stringMatch(String s, String p)
    {
        int n = s.length();
        int m = p.length();
        for (int i = 0; i <= n-m; i++) {
            int j = 0;
            while (j<m && p.charAt(j)==s.charAt(i+j))
                j++;
            if(j==m) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        System.out.println("Enter a pattern to search: ");
        String p = in.next();
        Main obj = new Main();
        if(obj.stringMatch(s,p))
            System.out.println("pattern is present in the string");
        else
            System.out.println("pattern is not present in the string");
    }
}
