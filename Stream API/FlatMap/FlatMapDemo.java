package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
  public static void main(String[] args) {
    List<Order> orderList = getOrderList();
    System.out.println("Item count with Map " + orderList.stream().map (order -> ((Collection<Order>) order.getItems()).stream()).count());
    System.out.println("Item count with FlatMap " + orderList.stream().flatMap (order -> ((Collection<Order>) order.getItems()).stream()).count());
    // displaying all the items
    Stream<Object> item = orderList.stream().flatMap(order -> ((Collection<Order>) order.getItems()).stream());
    item.forEach(System.out::println);
  }
    
  private static List<Order> getOrderList(){
    List<Order> orderList = new ArrayList<Order>();
    Order order = new Order();
    order.setOrderId("1");
    order.setItems((java.awt.List) Arrays.asList("Item1", "Item2", "Item3"));
    orderList.add(order);
    order = new Order();
    order.setOrderId("2");
    order.setItems((java.awt.List) Arrays.asList("Item3", "Item5"));
    orderList.add(order);
    return orderList;
  }
}