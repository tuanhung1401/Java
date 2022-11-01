package model;

import java.util.Scanner;

public class IdolModel {
    public Idol inputIdol(Scanner scanner){
        Idol idol = new Idol();
        System.out.println("Mời bạn nhập id idol: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên idol: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập email idol: ");
        String email = scanner.nextLine();

        idol.setName(name);
        idol.setId(id);
        idol.setEmail(email);
        return idol;
    }
}
