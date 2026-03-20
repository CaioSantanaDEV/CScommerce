package com.devsuperior.cscommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;


@Entity
    @Table(name = "tb_order_item")
    public class OrderItem {
        @EmbeddedId
        private OrderItemPK id = new OrderItemPK();
        private Integer quantity;
        private Double price;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof OrderItem orderItem)) return false;

        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public OrderItem() {
        }

        public OrderItem(Order order, Product product, Integer quantity, Double price) {
            id.setOrder(order);
            id.setProduct(product);
            this.quantity = quantity;
            this.price = price;
        }

        public Order getOrder() {
            return id.getOrder();
        }

        public void setOrder(Order order) {
            id.setOrder(order);
        }
    }
