package Bai10;

public class Student {
    private int id;
    private String name;
    private double gpa;


    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String toString() {
        return "Mã sinh viên: " +id+ " - Tên sinh viên: "+name+ " - Điểm trung bình: "+gpa+"\n";
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }
}
