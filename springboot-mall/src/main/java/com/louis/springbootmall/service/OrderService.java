package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.CreateOrderRequest;
import com.louis.springbootmall.dto.OrderQueryParams;
import com.louis.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
