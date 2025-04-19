package org.example;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public double CalculoPerCentLikes(){
        if (this.views == 0){
            return 0; //para evitar divisões por 0
        }
        return (double) this.curtidas/this.views * 100;
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
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Video.play...");;
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Video.pause...");
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
        System.out.println("Video.like...\n");
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
    public void setAvaliacao() {
        this.avaliacao = calculoEstrelas();
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

    public Video(String titulo) {
        this.titulo = titulo;
        this.setAvaliacao();
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
