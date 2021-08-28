package com.example.wshop.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@ToString
public class Orders {
    @Id
    @Column(name="order_id")
    private Long id;
    private Long user_id;
    private Integer count; // 주문 수량
    private Integer amount; //주문 가격
    private Integer discount; //할인율 최대 99%
}
