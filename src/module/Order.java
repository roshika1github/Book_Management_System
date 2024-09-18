package module;

import java.util.ArrayList;

public class Order {
    int orderid;
    ArrayList<BookOrders> bookOrders;

    public Order(int orderid, ArrayList<BookOrders> bookOrders) {
        this.orderid = orderid;
        this.bookOrders = bookOrders;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public ArrayList<BookOrders> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(ArrayList<BookOrders> bookOrders) {
        this.bookOrders = bookOrders;
    }
}
