package me.dio.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

import java.util.List;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValues(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

     @Column(name = "additional_limit", scale = 13, precision = 2)
    private BigDecimal limit;


}