package controller;

import model.Gender;
import model.Student;
import model.Teacher;
import model.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("t1", "Hung", Gender.Male, LocalDate.of(1997,Month.JANUARY,14), "tuanhung1401@gmail.com","0982914197", 2, "English");
        Teacher teacher2 = new Teacher("t2", "Ly", Gender.Female, LocalDate.of(1997,Month.JULY,13), "danghuongly13@gmail.com", "0395104521", 1, "Math");
        Student student1 = new Student("s1", "Hieu", LocalDate.of(1993,Month.OCTOBER,8), "trangminhhieu.pl@gmail.com", Gender.Male, "039234442", "working", true);
        Student student2 = new Student("s2", "Van", LocalDate.of(1992,Month.NOVEMBER,2), "nguyenthivan@gmail.com", Gender.Female, "039234442", "working", true);
        Student student3 = new Student("s3", "Trang", LocalDate.of(1994,Month.FEBRUARY,18), "nguyenthutrang@gmail.com", Gender.Female, "039234442", "working", true);
        Student student4 = new Student("s4", "Hieu", LocalDate.of(1995,Month.MARCH,24), "vuminhduc@gmail.com", Gender.Male, "039234442", "working", true);
        Student student5 = new Student("s5", "Minh", LocalDate.of(1998,Month.MAY,30), "nguyenquangminh@gmail.com", Gender.Male, "039234442", "working", true);
        Student student6 = new Student("s6", "Ha", LocalDate.of(2000,Month.DECEMBER,25), "samhanguyen@gmail,com", Gender.Female, "039234442", "working", true);
        ArrayList <User> users = new ArrayList<>();
        users.add(teacher1);
        users.add(teacher2);
        users.add(student1);
        users.add(student2);
        users.add(student3);
        users.add(student4);
        users.add(student5);
        users.add(student6);
        printUsers(users);

        System.out.println("Mời bạn nhập keyword: ");
        Scanner sc = new Scanner(System.in);
        String keyword = sc.nextLine();
        for (int i = 0; i < users.size(); i++){
            User user = users.get(i);
            if (user.getName().contains(keyword) || user.getPhoneNumber().contains(keyword) || user.getEmail().contains(keyword)){
                user.printInfo();
            }
        }

        Comparator<User> comparatorByName = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(users, comparatorByName);
        System.out.println("Sắp xếp theo tên");
        printUsers(users);

        Comparator<User> comparatorByAge = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getBirthday().isBefore(o2.getBirthday())){
                    return -1;
                }
                if (o1.getBirthday().isAfter(o2.getBirthday())){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        Collections.sort(users, comparatorByAge);
        System.out.println("Sắp xếp theo tuổi: ");
        printUsers(users);
    }

    static void printUsers(ArrayList<User> users) {
        for (int i=0; i <users.size(); i++) {
            User user = users.get(i);
            user.printInfo();
        }
    }
}