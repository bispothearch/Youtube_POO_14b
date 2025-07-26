package testYt;

public class Comment {
    private User autor;
    private String text;
    private String date;

    public Comment(User autor, String text) {
        this.autor = autor;
        this.text = text;
        this.date = java.time.LocalDateTime.now().toString();
    }

    public User getAutor() {
        return autor;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "Usuário: " + autor +
                "\n" + text +
                "\nData: " + date + '\'' +
                '}';
    }
}

