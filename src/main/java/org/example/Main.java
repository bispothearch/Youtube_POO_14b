package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario[] user = new Usuario[3];
        Video[] vd = new Video[3];

        user[0] = new Usuario("Abdias", 19, 'M',"jonh555");
        vd[0] = new Video("O FIM DA PICADA ¬_¬");

        System.out.println(user[0]);
        user[0].assistirVideo(vd[0]);
        System.out.println(vd[0].getViews());
        System.out.println(user[0].getExp());
    }
    }