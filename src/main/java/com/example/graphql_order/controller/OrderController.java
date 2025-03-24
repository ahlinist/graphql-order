package com.example.graphql_order.controller;

import com.example.graphql_order.codegen.types.OrderItem;
import com.example.graphql_order.codegen.types.WareHouse;
import com.example.graphql_order.dto.Order;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class OrderController {

    @QueryMapping
    public List<Order> getOrders() {
        return List.of(
                new Order(UUID.randomUUID().toString(), "order 1", List.of(OrderItem.newBuilder().id(UUID.randomUUID().toString()).build()), "warehouse 1"),
                new Order(UUID.randomUUID().toString(), "order 2", List.of(OrderItem.newBuilder().id(UUID.randomUUID().toString()).build()), "warehouse 2")
        );
    }

    @SchemaMapping
    public WareHouse wareHouse(Order order) {
        return WareHouse.newBuilder().id(order.wareHouseId()).build();
    }
}
