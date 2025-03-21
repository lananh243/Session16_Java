import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(6);
        list.add(17);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Danh sách trước khi xóa các số chia hết cho 3");
        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("Danh sách sau khi xóa các số chia hết cho 3");
        for (Integer integer : list) {
            if (integer % 3 == 0) {
                System.out.println(integer);
            }
        }
    }
}
