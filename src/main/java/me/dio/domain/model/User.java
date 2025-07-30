package me.dio.domain.model;

import jakarta.persistence.GeneratedValues;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValues(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Lista<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Account getAccount(){
        return name;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Card card(){
        return card;
    }

    public void setCard(Card card){
        this.card = card;
    }





}