package model;

import java.util.Scanner;

public class SongModel {
    public Song inputSong() {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập id bài hát: ");
        String id = scanner.nextLine();
        System.out.println("Mời bạn nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập ca sỹ: ");
        String singer = scanner.nextLine();
        song.setId(id);
        song.setName(name);
        song.setSinger(singer);
        return song;
    }
}
