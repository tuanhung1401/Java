package controller;

import model.Student;
import model.StudentModel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentModel studentModel = new StudentModel();
        Student student = studentModel.inputStudent();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        Continue();
        int option = sc.nextInt();
        sc.nextLine();
        while (true) {
            if (option == 1) {
                while (true) {
                    student = studentModel.inputStudent();
                    students.add(student);
                    Continue();
                    option = sc.nextInt();
                    sc.nextLine();
                    if (option == 2) {
                        System.out.println(students);
                        break;
                    }
                    if (option != 1 && option !=2) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                        option = sc.nextInt();
                        sc.nextLine();
                    }
                }
                break;
            } else if (option == 2) {
                System.out.println(students);
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                option = sc.nextInt();
                sc.nextLine();
            }
        }
}

    public static void Continue() {
        System.out.println("Bạn có muốn tiếp tục?");
        System.out.println("1.Có");
        System.out.println("2.Không");
    }
}