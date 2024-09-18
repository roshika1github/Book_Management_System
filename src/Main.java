import Books.Books;
import module.Books;
import module.Genre;
import models.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Genre g1 = new Genre("Fiction","Best Fiction");
        Genre g2 = new Genre("Fiction","Good Fiction");
        System.out.println(g1.getDescription());

        g1.setDescription("This is my Fiction");
        System.out.println(g1.getDescription());

        Books book1 = new Books("Mangena","Test Author",12345,g1, false);
        Books book2 = new Books("ABC","Test Author",45678,g2, true);

        BookOrders order1 = new BookOrders(book1,13);
        BookOrders order2 = new BookOrders(book2,88);

        ArrayList<BookOrders> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        Order one = new Order(123 , orders);
        Order two = new Order(345, orders);
    }
}

