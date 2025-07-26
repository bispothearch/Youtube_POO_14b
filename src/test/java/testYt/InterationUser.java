package testYt;

import java.util.ArrayList;
import java.util.List;

public class InterationUser {
    private User autor;
    private Video video;
    private List<User> shares;

    public InterationUser() {
        this.shares = new ArrayList<>();
    }

    //Gerencia a ação de comentar
    public void addComments(User autor, Video video, String text){
        Comment newComment = new Comment(autor, text);
        video.recordComments(newComment);

        System.out.println("Vídeo: "+ '\''+ video.getTitulo() + '\'');
        System.out.println(autor.getNome() + " comentou: " + text);
        System.out.println();
    }

    public void shareVd(User receiver){

    }
}
