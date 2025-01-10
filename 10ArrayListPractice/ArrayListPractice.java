import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class ArrayListPractice {
    public static void main(String[] args) {

        // Array list
        List<Integer> list = new LinkedList<Integer>();

        list.add(445);
        list.add(533);
        list.add(224);

        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);

        System.out.println(list);
    }
}