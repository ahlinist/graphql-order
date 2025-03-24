package com.example.graphql_order.controller;

import com.example.graphql_order.codegen.types.Order;
import com.example.graphql_order.codegen.types.OrderItem;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class OrderController {

    @QueryMapping
    public List<Order> getOrders() {
        return List.of(
                Order.newBuilder()
                        .id(UUID.randomUUID().toString())
                        .name("order 1")
                        .items(
                                List.of(OrderItem.newBuilder().id(UUID.randomUUID().toString()).build())
                        )
                        .build(),
                Order.newBuilder()
                        .id(UUID.randomUUID().toString())
                        .name("order 2")
                        .build()
        );
    }
}
