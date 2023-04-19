package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.CreateOrderRequest;
import com.louis.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
