package model;

import java.time.LocalDate;

public class Teacher extends User{
    private int yearOfExperiences;
    private String speciality;

    public Teacher (String id, String name, Gender gender, LocalDate birthDay, String email, String phoneNumber, int yearOfExperiences, String speciality) {
        super(id, name, gender, birthDay, email, phoneNumber);
        this.speciality = speciality;
        this.yearOfExperiences = yearOfExperiences;
    }

    @Override
   public void printInfo() {
        String info = "Teacher: id= "+getId() + " name= " + getName() + " gender= " + getGender() + " birthday= " + getBirthday() +" email= " + getEmail() + " phoneNumber= " + getPhoneNumber() + " yearsOfExp= " + yearOfExperiences + " speciality = " + speciality;
        System.out.println(info);
    }
}
