package org.example;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Video.play...");;
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Video.pause...");
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
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //Construct
    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao(avaliacao);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public String toString() {
        return "Video: " +
                "Titulo - '" + titulo + '\'' +
                "; Avaliação - " + avaliacao +
                " estrela(s); " + views + " views e "
                + curtidas + " curtidas" +
                "; Status de execução: " + reproduzindo +
                ".";
    }
}
