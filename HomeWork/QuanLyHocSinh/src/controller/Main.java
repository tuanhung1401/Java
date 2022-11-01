package controller;

import model.ClassInfo;
import model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số lượng học sinh: ");
        int numberOfStudent = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Mời bạn nhập tên học sinh: ");
            String name = sc.nextLine();
            System.out.println("Mời bạn nhập ngày sinh của học sinh: ");
            String abc = sc.nextLine();
            System.out.println("Mời bạn nhập nơi sinh của học sinh: ");
            String placeOfOrigin = sc.nextLine();
            System.out.println("Mời bạn nhập lớp của học sinh: ");
            String classInfo = sc.nextLine();
            System.out.println("Mời bạn nhập khóa học: ");
            String period = sc.nextLine();
            System.out.println("Mời bạn nhập kỳ học");
            int semester = sc.nextInt();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate birthDateconverted = LocalDate.parse(abc,formatter);
            sc.nextLine();
            Student student = new Student();
            student.setName(name);
            student.setBirthDate(birthDateconverted);
            student.setPlaceOfOrigin(placeOfOrigin);
            students.add(student);
        }
    }
}