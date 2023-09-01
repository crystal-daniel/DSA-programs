import java.util.*;
public class Main {
    List<Integer> bogoSort(List<Integer> a)
    {
        while(!isListSorted(a))
        {
            Collections.shuffle(a);
        }
        return a;
    }
    private boolean isListSorted(List<Integer> a) {
        for (int i = 0; i < a.size()-1; i++) {
            if(a.get(i)>a.get(i+1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 7; i++) {
            a.add(r.nextInt(100));
        }
        System.out.println("Array before sorting:");
        System.out.println(a);
        Main obj = new Main();
        a=obj.bogoSort(a);
        System.out.println("Array before sorting:");
        System.out.println(a);
    }
}
