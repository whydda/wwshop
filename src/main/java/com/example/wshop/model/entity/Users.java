package com.example.wshop.model.entity;

import com.sun.istack.NotNull;
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
public class Users {
    @Id
    @Column(name="user_id")
    private Long id;

    @NotNull
    private String email;
}
