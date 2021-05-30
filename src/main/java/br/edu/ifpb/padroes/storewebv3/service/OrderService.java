package br.edu.ifpb.padroes.storewebv3.service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.OrderItem;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.OrderRepository;
import br.edu.ifpb.padroes.storewebv3.visitor.Discount;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository = OrderRepository.getInstance();

    public void createOrder(Order order){
        order.setProcessed(true);
        orderRepository.add(order);

        for (OrderItem item: order.getItems()) {
            Product product = item.getProduct();
            product.accept(new Discount());
        }

    }
}
