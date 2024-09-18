package module;

public class BookOrders {
    Books book;
    int quantity;

    public BookOrders(Books book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}