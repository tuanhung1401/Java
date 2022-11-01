package controller;

import model.Employee;
import model.Gender;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("NV01","Nguyễn Tuấn Hưng", LocalDate.of(1997, Month.JANUARY,14), Gender.Male,20.000000);
        Employee employee2 = new Employee("NV02","Nguyễn Minh Hoàng", LocalDate.of(1992, Month.FEBRUARY,15), Gender.Male,40.000000);
        Employee employee3 = new Employee("NV03","Trần Mình Hiếu", LocalDate.of(1983, Month.MAY,24), Gender.Male,70.000000);
        Employee employee4 = new Employee("NV04","Đặng Hương Ly", LocalDate.of(1986, Month.MARCH,4), Gender.Female,10.000000);
        Employee employee5 = new Employee("NV05","Nguyễn Quỳnh Trang", LocalDate.of(2000, Month.DECEMBER,19), Gender.Female,90.000000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        System.out.println("Tìm nhân viên theo id chính xác: ");
        Scanner sc = new Scanner(System.in);
        String idSearch = sc.nextLine();
        for (int i = 0; i < employees.size(); i++){
            Employee employee = employees.get(i);
            if(idSearch.equals(employee.getId())){
                System.out.println(employee);
            }
        }
        System.out.println("Tìm nhân vie theo tên: ");
        String nameSearch = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getName().contains(nameSearch)){
                System.out.println(employee);
            }
        }
        int countMale = 0;
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getGender().equals(Gender.Male)){
                countMale++;
            }
        }
        int countFemale = employees.size() - countMale;
        System.out.println("Số nhân viên nam là: "+countMale);
        System.out.println("Số nhân viên nữ là: "+countFemale);
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (Period.between(employee.getBirthDate(), LocalDate.now()).getYears()>=30){
                System.out.println(employee);
            }
        }
        System.out.println("Xin mời nhập tháng bất kỳ: ");
        int monthSearch = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if(employee.getBirthDate().getMonthValue()==monthSearch){
                System.out.println(employee);
            }
        }
        Comparator <Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary()>o2.getSalary()){
                    return -1;
                }
                if (o1.getSalary()<o2.getSalary()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        Collections.sort(employees, comparator);
        for (int i = 0; i < 3; i++) {
            Employee employee = employees.get(i);
            System.out.println(employee);
        }
    }
}