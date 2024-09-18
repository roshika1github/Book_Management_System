import module.Genre;

Package  module;

public class Books {
    String bookname;
    String author;
    Integer price;
    Genre genre;
    boolean isdiscounted;

    public Books(String bookname, String author, Integer price, Genre genre, boolean isdiscounted) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.isdiscounted = isdiscounted;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isIsdiscounted() {
        return isdiscounted;
    }

    public void setIsdiscounted(boolean isdiscounted) {
        this.isdiscounted = isdiscounted;
    }
}

