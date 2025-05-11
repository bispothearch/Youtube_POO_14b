package org.example;

public class User extends Person implements UserActions {
    private String login;
    private int totAssistido;
    private int expGanha;

    public User(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.setTotAssistido(0);
    }

    @Override
    protected void ganharExp() {
        expGanha += 5;
        this.exp += expGanha;
    }

    protected void viuMaisUm(){
        this.totAssistido++;
    }

    public void assistirVideo(Video titleVd){
        System.out.println("\nO user " + User.super.getNome() + " acabou de assistir: '" + titleVd.getTitulo() + "'.\n");
        viuMaisUm();
        ganharExp();
        titleVd.setViews(titleVd.getViews()+1);
    }

    @Override
    public void sendVideo(User receiver, Video video) {

    }

    @Override
    public void commentVideo(Video video, String comment) {

    }

    @Override
    public void execLike(Video selecVideo) {

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public int getExpGanha() {
        return expGanha;
    }

    public void setExpGanha(int expGanha) {
        this.expGanha = expGanha;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido;
    }
}
