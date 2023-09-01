import java.util.HashMap;
import java.util.Scanner;

public class Main {
    HashMap<Character,Integer> shiftTable(String p)
    {
        HashMap<Character,Integer> table = new HashMap<>();
        int m=p.length();
        table.put('a',m);
        table.put('b',m);
        table.put('c',m);
        table.put('d',m);
        table.put('e',m);
        table.put('f',m);
        table.put('g',m);
        table.put('h',m);
        table.put('i',m);
        table.put('j',m);
        table.put('k',m);
        table.put('l',m);
        table.put('m',m);
        table.put('n',m);
        table.put('o',m);
        table.put('p',m);
        table.put('q',m);
        table.put('r',m);
        table.put('s',m);
        table.put('t',m);
        table.put('u',m);
        table.put('v',m);
        table.put('w',m);
        table.put('x',m);
        table.put('y',m);
        table.put('z',m);
        table.put(' ',m);
        for (int i = 0; i < m-1; i++) {
            table.put(p.charAt(i), (m-1-i));
        }
        return table;
    }
    boolean horspool(String s, String p)
    {
        HashMap<Character,Integer> table = shiftTable(p);
        int m = p.length();
        int n = s.length();
        int i = m-1;
        while (i<=n-1)
        {
            int k=0;
            while(k<=m-1 && p.charAt(m-1-k)==s.charAt(i-k))
            {
                k++;
            }
            if (k==m)
                return true;
            else
                i = i + table.get(s.charAt(i));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = in.nextLine();
        s=s.toLowerCase();
        System.out.println("Enter a pattern to search: ");
        String p = in.next();
        p=p.toLowerCase();
        Main obj = new Main();
        if(obj.horspool(s,p))
            System.out.println("pattern is present in the string");
        else
            System.out.println("pattern is not present in the string");
    }
}
