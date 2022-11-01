package model;

import java.time.LocalDate;

public class Student extends User {
    private boolean isOnline;
    private String background;

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Student() {
        //super();
       System.out.println("student here");
    }

    @Override
    public void printInfo() {
        String info = "Student: id= "+getId() + " name= " + getName() + " gender= " + getGender() + " birthday= " + getBirthday() +" email= " + getEmail() + " phoneNumber= " + getPhoneNumber() + "status= " + isOnline + "background = " + background;
        System.out.println(info);
    }

    public Student(String id, String name, LocalDate birthDay, String email, Gender gender, String phoneNumber, String background, boolean isOnline ) {
        super(id, name,gender, birthDay, email, phoneNumber);
        this.background = background;
        this.isOnline = isOnline;
    }

    @Override
    public String toString() {
        return "Student{ " + super.toString() +
                " isOnline= " + isOnline +
                ", background= " + background + '\'' +
                '}' ;
    }
}
