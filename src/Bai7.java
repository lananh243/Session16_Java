import java.util.ArrayList;
import java.util.ListIterator;

public class Bai7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(3);
        list.add(5);
        list.add(7);

        ArrayList<Integer> uniqueElement = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count =0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueElement.add(list.get(i));
            }
        }
        System.out.println(uniqueElement);
    }
}
