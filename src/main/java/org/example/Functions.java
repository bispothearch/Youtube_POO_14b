package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Functions extends User implements UserActions {
    private Video selecVideo;
    private int expGanha;
    private ArrayList<Video> history;
    private final InterationUser interagent;

    public Functions(String nome, int idade, char sexo, String login){
        super(nome, idade, sexo, login);
        this.interagent = new InterationUser();
    }

    // =====

    protected void viuMaisUm(){
        this.setTotAssistido(getTotAssistido() +1);
    }

    public void assistirVideo(Video titleVd){
        System.out.println("\nO user " + this.getNome() + " acabou de assistir: '" + titleVd.getTitulo() + "'.\n");
        viuMaisUm();
        ganharExp();
        titleVd.setViews(titleVd.getViews()+1);
        history.add(titleVd);
    }

    @Override
    protected void ganharExp() {
        super.ganharExp();
        expGanha += 5;
        this.exp += expGanha;
    }

    @Override
    public void sendVideo(User receiver, Video video) {

    }

    //Comenta no video
    @Override
    public void commentVideo(Video video, String comment) {
        interagent.addComments(this, video, comment);
    }

    @Override
    public void execLike(@NotNull Video selecVideo) {
        selecVideo.setCurtidas(selecVideo.getCurtidas()+1);
        selecVideo.setAvaliacao(calculoEstrelas());
        System.out.println("👍🏽");
    }

    @Override
    public void addToHistory(Video video) {

    }

    @Override
    public void favoriteVideo(Video video) {

    }
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

    public Video getSelecVideo() {
        return selecVideo;
    }

    public void setSelecVideo(Video selecVideo) {
        this.selecVideo = selecVideo;
    }

    @Override
    public String toString() {
        return getNome() + " resume's: " +
                "\nVideos assistidos - " + getTotAssistido() +
                "\n" + "Exp - " + getExp();
    }
}