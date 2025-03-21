import java.util.ArrayList;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);

        ArrayList<Integer> uniqueNumber = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!uniqueNumber.contains(list.get(i))) {
                uniqueNumber.add(list.get(i));
            }
        }

        System.out.println(uniqueNumber);


    }
}
