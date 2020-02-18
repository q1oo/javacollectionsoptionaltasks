import java.util.LinkedList;
import java.util.List;

public class FifthTask {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(-50 + (int)(Math.random()*100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                ((LinkedList<Integer>) list).addFirst(list.get(i));
                list.remove(i + 1);
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
