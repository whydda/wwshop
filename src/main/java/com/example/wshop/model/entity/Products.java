package com.example.wshop.model.entity;

import com.example.wshop.model.code.ProductCode;
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
public class Products {
    @Id
    @Column(name="products_id")
    private Long id;
    private String name;
    private Integer amount;
    private ProductCode code;
}
