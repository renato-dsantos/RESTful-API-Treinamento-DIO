package me.dio.domain.model;


import jakarta.persistence.GeneratedValues;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@Entity(name = "tb_card")
public abstract class BaseItem {

    @Id
    @GeneratedValues(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String description;;

}