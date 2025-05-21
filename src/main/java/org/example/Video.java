package org.example;

import java.util.ArrayList;
import java.util.List;

public class Video {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private final List<Comment> commentsVd;

    //Construct
    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(avaliacao);
        this.setViews(0);
        this.setCurtidas(0);
        this.commentsVd = new ArrayList<>();
    }

    //Armazena os comentários gerados pelo user(InterationUser)
    public void recordComments(Comment comment){
        this.commentsVd.add(comment);
    }

    public List<Comment> getCommentsVd() {
        return commentsVd;
    }

    @Override
    public String toString() {
        return "Video: " +
                "Titulo - '" + titulo + '\'' +
                "; Avaliação - " + avaliacao +
                " estrela(s); " + views + " views e "
                + curtidas + " curtidas.";
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}
