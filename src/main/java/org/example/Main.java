package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario[] user = new Usuario[3];
        Video[] vd = new Video[3];
        Funcoes[] func = new Funcoes[3];

        func[0] = new Funcoes("Sisi", 23, 'F', "roseSisx0", vd[0]);

        vd[0] = new Video("O FIM DA PICADA ¬_¬");
        vd[1] = new Video("ABUBU MOOD xD");
        vd[2] = new Video("CANSEI DESSE PROJETO :/");

        func[0].assistirVideo(vd[0]);
        func[0].execLike();

        /*
        System.out.println(vd[0].getCurtidas());
        System.out.println(vd[0].getAvaliacao());
         */
    }
    }