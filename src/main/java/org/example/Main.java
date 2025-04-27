package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Video> videos = new ArrayList<>();
        videos.add(new Video("Tlou2 - Trailer"));
        videos.add(new Video("Abubu Mood XD"));
        videos.add(new Video("CANSEI DESSE PROJETO :/ ..."));

        ArrayList<Funcoes> user = new ArrayList<>();
        user.add(new Funcoes("Jack",19, 'M',"tomaJack69", videos.get(2)));

        user.getFirst().assistirVideo(videos.get(2));
        System.out.println(videos.getFirst().toString());

        user.getFirst().execLike();

        System.out.println("Curtidas: " + videos.get(2).getCurtidas());
        System.out.println("Avaliação: " + videos.get(2).getAvaliacao());
    }
    }