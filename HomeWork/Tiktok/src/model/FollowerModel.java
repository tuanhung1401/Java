package model;

import java.util.Scanner;

public class FollowerModel {
    public Follower inputFollower(Scanner scanner) {
        Follower follower = new Follower();
        System.out.println("Mời bạn nhập id follower:");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên follower: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập email follower: ");
        String email = scanner.nextLine();
        System.out.println("Mời bạn nhập số lượt like: ");
        int numberOfLike = scanner.nextInt();
        scanner.nextLine();
        follower.setId(id);
        follower.setName(name);
        follower.setEmail(email);
        follower.setNumberOfLike(numberOfLike);
        return follower;
    }
}
