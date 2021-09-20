package kdt.prgrms.gccoffee.service;

import kdt.prgrms.gccoffee.model.Email;
import kdt.prgrms.gccoffee.model.Order;
import kdt.prgrms.gccoffee.model.OrderItem;

import java.util.List;

public interface OrderService {

    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);

}
