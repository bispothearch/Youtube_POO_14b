package org.example;

public interface UserActions {
    public abstract void sendVideo(User receiver, Video video);
    public abstract void commentVideo(Video video, String comment);
    public abstract void execLike(Video video);
}
