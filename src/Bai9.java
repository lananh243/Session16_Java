import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của danh sách số nguyên: ");
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] : ", i);
            int number = scanner.nextInt();
            list.add(number);
        }

        ArrayList<Integer> primeNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();

        System.out.println("Danh sách số nguyên là: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            if (isPrime(list.get(i))) {
                primeNumber.add(list.get(i));
            } else {
                if (list.get(i) % 2 == 0) {
                    evenNumber.add(list.get(i));
                } else {
                    oddNumber.add(list.get(i));
                }
            }
        }

        System.out.println("Số nguyên tố: " + primeNumber);
        System.out.println("Số chẵn: " + evenNumber);
        System.out.println("Số lẻ: " + oddNumber);

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}