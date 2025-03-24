package com.example.graphql_order.dto;

import com.example.graphql_order.codegen.types.OrderItem;

import java.util.List;

public record Order(String id, String name, List<OrderItem> items, String wareHouseId) {
}
