package org.example;

public class Funcoes extends Usuario {
    private final Video Video;
    private Video selecVideo;

    public Funcoes(String nome, int idade, char sexo, String login, Video video) {
        super(nome, idade, sexo, login);
        Video = video;
        this.selecVideo = Video;
    }

    public Video getSelecVideo() {
        return selecVideo;
    }

    public void setSelecVideo(Video selecVideo) {
        this.selecVideo = selecVideo;
    }

//=====

    public double CalculoPerCentLikes(){
        if (selecVideo.getViews() == 0){
            return 0; //para evitar divisões por 0
        }
        return (double) selecVideo.getCurtidas()/selecVideo.getViews() * 100;
    }

    public int calculoEstrelas(){
        double perCentLikes = CalculoPerCentLikes();

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
    public void execLike() {
        this.selecVideo.setCurtidas(this.selecVideo.getCurtidas()+1);
        this.selecVideo.setAvaliacao(this.calculoEstrelas());
        System.out.println("👍🏽");
    }

}