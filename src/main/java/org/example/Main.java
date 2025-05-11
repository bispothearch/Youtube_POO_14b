package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       ArrayList<User> user = new ArrayList<>();
       user.add(new User("Samuel",18,'M',"sadam777"));
       user.add(new User("Yuri",19,'M',"bispo72"));
       user.add(new User("Anna",19,'F',"annabanana"));

        ArrayList<Video> videos = new ArrayList<>();
        videos.add(new Video("Java POO"));
        videos.add(new Video("Abubu Mood XD"));
        videos.add(new Video("BispoTheArch - Ascent"));

        Functions functionsSamuel = new Functions(user.get(0).getNome(), user.get(0).getIdade(), user.get(0).getSexo(),user.get(0).getLogin(),  videos.get(1));

    }
    }