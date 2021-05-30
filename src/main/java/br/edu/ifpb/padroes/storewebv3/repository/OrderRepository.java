package br.edu.ifpb.padroes.storewebv3.repository;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderRepository {

    private List<Order> orderList = new ArrayList<>();
    private static OrderRepository instance;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void add(Order element) {
        orderList.add(element);
    }

    public void remove(Order product) {
        orderList.remove(product);
    }

    public static OrderRepository getInstance() {
        return (instance.equals(null)) ? new OrderRepository() : instance ;
    }

}
