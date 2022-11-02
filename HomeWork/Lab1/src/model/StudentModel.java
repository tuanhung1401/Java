package model;

import java.util.Scanner;

public class StudentModel {
    public Student inputStudent() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã học sinh: ");
        String id = sc.nextLine();
        System.out.println("Mời bạn nhập tên học sinh: ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập địa chỉ học sinh: ");
        String address = sc.nextLine();
        student.setId(id);
        student.setName(name);
        student.setAddress(address);
        return student;
    }
}
