package org.example;

import java.util.ArrayList;
import java.util.List;

public class InterationUser {
    private User autor;
    private Video video;
    private List<CommentVd> comments;
    private List<User> shares;

    public InterationUser(User autor, Video video) {
        this.autor = autor;
        this.video = video;
        this.comments = new ArrayList<>();
        this.shares = new ArrayList<>();
    }

    public void addComment(String text){
        CommentVd newComment = new CommentVd(autor, text);
        comments.add(newComment);
    }

    public void shareVd(User receiver){
        shares.add(receiver);
        System.out.println("Video compartilhado com " + receiver.getNome());
    }

    public List<CommentVd> getComments() {
        return comments;
    }
}
