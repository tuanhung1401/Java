package controller;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SongModel songModel = new SongModel();
        Song song = songModel.inputSong();
        System.out.println(song.toString());
        // create follower 1
        FollowerModel followerModel = new FollowerModel();
        Follower follower = followerModel.inputFollower(scanner);
        System.out.println(follower.toString());

        //create follower 2
        Follower follower2 = followerModel.inputFollower(scanner);
        System.out.println(follower2.toString());

        //save the follower in arraylist followers
        ArrayList <Follower> followers = new ArrayList<>();
        followers.add(follower);
        followers.add(follower2);
        IdolModel idolModel = new IdolModel();
        Idol idol = idolModel.inputIdol(scanner);
        idol.setFollowers(followers);
        System.out.println(idol);
    }
}