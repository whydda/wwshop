package com.example.wshop.model.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@ToString
public class ProductIOrders {
    @Id
    private Long id;
    @NotNull
    private Long orderId;
    @NotNull
    private Long product_id;
    @NotNull
    private Integer count;
    @NotNull
    private Integer amount;
    private boolean isPayment;
    private boolean isDelivery;
    private boolean isCancel;
}
