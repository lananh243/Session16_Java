import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("kiwi");
        list.add("grape");

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length() || (list.get(i).length() == list.get(j).length() && list.get(i).compareTo(list.get(j)) > 0)) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách sau khi sắp xếp:");
        System.out.println(list);
    }
}
