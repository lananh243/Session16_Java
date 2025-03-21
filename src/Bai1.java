import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Nguyễn Văn A");
        list.add("Trần Thị B");
        list.add("Nguyễn Văn C");
        list.add("Lê Thị D");
        list.add("Hà Thi E");
    // For
        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(i));
        }
    // For-each
        for (String student : list) {
            System.out.println(student);
        }
    // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }

    }
}
