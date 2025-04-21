package org.example;

public class Usuario extends Pessoa implements AcoesUsuario{
    private String login;
    private int totAssistido;
    private int expGanha;
    private String comments;
    private Usuario send;
    private Usuario receiver;

    public Usuario(String nome, int idade, char sexo, String login) {
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
        System.out.println("\nO user " + Usuario.super.getNome() + " acabou de assistir: '" + titleVd.getTitulo() + "'.\n");
        viuMaisUm();
        ganharExp();
        titleVd.setViews(titleVd.getViews()+1);
    }

    @Override
    public void sendVideo() {

    }
    @Override
    public void comentar() {

    }

    @Override
    public void execLike() {

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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Usuario getSend() {
        return send;
    }

    public void setSend(Usuario send) {
        this.send = send;
    }

    public Usuario getReceiver() {
        return receiver;
    }

    public void setReceiver(Usuario receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido;
    }
}
