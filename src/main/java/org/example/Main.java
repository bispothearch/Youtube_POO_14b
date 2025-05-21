package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       ArrayList<User> user = new ArrayList<>();
       user.add(new User("Samuel",18,'M',"sadam777"));
       user.add(new User("Yuri",19,'M',"bispo72"));
       user.add(new User("Anna",19,'F',"annabanana"));

        ArrayList<Video> videos = new ArrayList<>();
        videos.add(new Video("Mt longe do fim..."));
        videos.add(new Video("CLT DELETE???"));
        videos.add(new Video("2025.2 - Logo ali. OQ VC JÁ FEZ?"));

        Functions functionsSamuel = new Functions(user.get(0).getNome(), user.get(0).getIdade(), user.get(0).getSexo(),user.get(0).getLogin());
        Functions functionsAnna = new Functions(user.get(2).getNome(), user.get(2).getIdade(), user.get(2).getSexo(), user.get(2).getLogin());

        //Comentando
        functionsAnna.commentVideo(videos.get(2),"Sinto que estou progredindo bem, vivendo coisas inimagináveis. :D");
        functionsSamuel.commentVideo(videos.get(2),"Focado no progresso, o céu é o limite e Deus é meu guia.");

        functionsSamuel.assistirVideo(videos.get(2));
        functionsAnna.assistirVideo(videos.get(2));


        System.out.println("\nComentários do Vídeo:");
        videos.get(2).getCommentsVd().forEach(c -> System.out.println(c.getAutor().getNome() + ": " + c.getText() + "\n" + "Data: " + c.getDate() + "\n"));

        System.out.println(functionsAnna.toString());
    }
    }