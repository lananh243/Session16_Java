import java.util.ArrayList;

public class Bai4 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(6);
        listNumber.add(7);

        int sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i);
        }

        System.out.println("Tổng của tất cả các phần tử trong danh sách: " + sum);

    }
}
