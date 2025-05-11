package org.example;

import org.jetbrains.annotations.NotNull;

public class Functions extends User implements UserActions {
    private Video selecVideo;

    public Functions(String nome, int idade, char sexo, String login, Video video) {
        super(nome, idade, sexo, login);
        this.selecVideo = video;
    }

    public Video getSelecVideo() {
        return selecVideo;
    }

    public void setSelecVideo(Video selecVideo) {
        this.selecVideo = selecVideo;
    }

//=====

    public double calcPerCentLikes(){
        if (selecVideo.getViews() == 0){
            return 0; //para evitar divisões por 0
        }
        return (double) selecVideo.getCurtidas()/selecVideo.getViews() * 100;
    }

    public int calculoEstrelas(){
        double perCentLikes = calcPerCentLikes();

        if (perCentLikes >= 80){
            return 5;
        } else if (perCentLikes >= 60){
            return  4;
        } else if (perCentLikes >=40) {
            return 3;
        } else if (perCentLikes >= 20) {
            return 2;
        } else if (perCentLikes > 0) {
            return 1;
        } else {
            return 0;//Sem curtidas
        }
    }

    @Override
    public void sendVideo(User receiver, Video video) {
        InterationUser interation = new InterationUser(this, video);
        interation.shareVd(receiver);
    }

    @Override
    public void commentVideo(Video video, String comment) {
        InterationUser interation = new InterationUser(this, video);
        interation.addComment(comment);
    }

    @Override
    public void execLike(@NotNull Video selecVideo) {
        selecVideo.setCurtidas(selecVideo.getCurtidas()+1);
        selecVideo.setAvaliacao(calculoEstrelas());
        System.out.println("👍🏽");
    }
}