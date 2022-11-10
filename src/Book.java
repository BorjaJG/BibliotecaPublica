public class Book {
    /**
     * caracteristicas del usuario
     */

    private static String title;
    private static Integer isbn;
    private static String author;
    private static String genre;
    private static Integer publication_date;

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Book.title = title;
    }

    public static Integer getIsbn() {
        return isbn;
    }

    public static void setIsbn(Integer isbn) {
        Book.isbn = isbn;
    }

    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        Book.author = author;
    }

    public static String getGenre() {
        return genre;
    }

    public static void setGenre(String genre) {
        Book.genre = genre;
    }

    public static Integer getPublication_date() {
        return publication_date;
    }

    public static void setPublication_date(Integer publication_date) {
        Book.publication_date = publication_date;
    }
}
