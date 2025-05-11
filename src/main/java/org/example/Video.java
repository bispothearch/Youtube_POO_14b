package org.example;

public class Video {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;

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

    //Construct
    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(avaliacao);
        this.setViews(0);
        this.setCurtidas(0);
    }

    @Override
    public String toString() {
        return "Video: " +
                "Titulo - '" + titulo + '\'' +
                "; Avaliação - " + avaliacao +
                " estrela(s); " + views + " views e "
                + curtidas + " curtidas.";
    }
}
