package com.imrob.robcommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private OrderStatus status;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
