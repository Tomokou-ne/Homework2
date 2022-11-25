package pro.sky.java.course1.Objects;
public class Author {
    private String authorLastName;
    private String authorName;
    public Author(String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }

    public String toString() {
        return "автор: " +authorName + " " + authorLastName;
    }
}
