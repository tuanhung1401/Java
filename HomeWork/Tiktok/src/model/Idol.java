package model;

import java.util.ArrayList;

public class Idol {
    private String name;
    private String id;
    private String email;

    private ArrayList <Follower> followers;

    public Idol(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Follower follower;

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                '}';
    }
}
