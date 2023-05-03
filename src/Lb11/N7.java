package Lb11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N7
{
    public static void main(String[] args) {
        int n  = 15;
        List<Integer> list = new ArrayList<>();

        fillList(n, list);
        System.out.println(list);

        josephModel(list);

        System.out.println(joseph(15, 2));
    }

    public static void fillList(int n, List list) {
        for(int i = 0; i < n; i++) {
            list.add(i + 1);
        }
    }

    public static int joseph(int n, int k) {
        if(n > 1)
            return (joseph(n - 1, k) + k - 1) % n + 1;
        else
            return 1;
    }

    public static void josephModel(List list) {
        int count = 0;
        Iterator<Integer> it = list.iterator();
        while(list.size() > 1) {
            if(it.hasNext()) {
                it.next();
                count++;
                if(count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(list);
                }
            }
            else {
                it = list.iterator();
            }
        }
    }
}