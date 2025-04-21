package org.example;

public class Funcoes extends Usuario {
    private Video selecVideo;
    private Video curtidasF;
    private Video viewsF;

    public Funcoes(String nome, int idade, char sexo, String login, Video selecVideo) {
        super(nome, idade, sexo, login);
        this.selecVideo = selecVideo;
    }

    public double CalculoPerCentLikes(){
        if (this.viewsF.getViews() == 0){
            return 0; //para evitar divisões por 0
        }
        return (double) this.curtidasF.getCurtidas()/this.viewsF.getViews() * 100;
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

    public Video getSelecVideo() {
        return selecVideo;
    }

    public void setSelecVideo(Video selecVideo) {
        this.selecVideo = selecVideo;
    }

    public Video getCurtidasF() {
        return curtidasF;
    }

    public void setCurtidasF(Video curtidasF) {
        this.curtidasF = curtidasF;
    }

    public Video getViewsF() {
        return viewsF;
    }

    public void setViewsF(Video viewsF) {
        this.viewsF = viewsF;
    }

}