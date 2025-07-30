package me.dio.domain.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

import java.util.List;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValues(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 13, precision = 2)
    private BigDecimal limit;

}
