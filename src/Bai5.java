import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Bai5 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(2);
        listNumber.add(4);
        listNumber.add(1);
        listNumber.add(5);

        ArrayList<Integer> countNumber = new ArrayList<>();
        ListIterator iterator = listNumber.listIterator();
        while (iterator.hasNext()) {
            int currentNum = (int) iterator.next();
            if (!countNumber.contains(currentNum)) {
                int count = 1;
                while (iterator.hasNext()) {
                    int nextNum = (int) iterator.next();
                    if (nextNum == currentNum) {
                        count++;
                    } else {
                        iterator.previous();
                        break;
                    }
                }
                countNumber.add(currentNum);

                System.out.printf("%d - %d lần\n", currentNum, count);
            }

        }

    }
}
