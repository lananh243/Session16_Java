import java.util.ArrayList;
import java.util.ListIterator;

public class Bai3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(22);
        list.add(3);
        list.add(14);
        list.add(5);
        list.add(26);


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        ListIterator<Integer> numbers = list.listIterator();
        while (numbers.hasNext()) {
            int currentNum =  numbers.next();
            if (currentNum > max) {
                max = currentNum;
            }

            if (currentNum < min) {
                min = currentNum;
            }
        }

        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);

    }
}
