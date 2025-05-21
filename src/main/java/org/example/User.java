package org.example;

public class User extends Person implements UserActions {
    private String login;
    private int totAssistido;

    public User(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.setTotAssistido(0);
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

    @Override
    public void addToHistory(Video video) {

    }

    @Override
    public void favoriteVideo(Video video) {

    }

    @Override
    protected void ganharExp() {

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

    @Override
    public String toString() {
        return super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido;
    }
}
