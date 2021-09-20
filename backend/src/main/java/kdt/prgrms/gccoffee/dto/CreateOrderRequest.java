package kdt.prgrms.gccoffee.dto;

import kdt.prgrms.gccoffee.model.OrderItem;

import java.util.List;

public record CreateOrderRequest(
        String email, String address, String postcode, List<OrderItem> orderItems
) {
}
