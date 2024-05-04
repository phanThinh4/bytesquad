package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Order;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Integer id);

}
