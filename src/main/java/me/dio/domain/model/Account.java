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

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

     @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public Long setId(Long id){
        this.id = id;
    }

    public void getId(){
        rertun id;
    }

    public String setNumber(String number){
        this.number = number;
    }
    public void getNumber(){
        return number;
    }

    public String setAgency(String agency){
        this.agency = agency;
    }
    public void getAgency(){
        return agency;
    }

    public BigDescimal setBalance(BigDescimal balance){
        this.balance = balance;
    }
    
    public void getBalance(){
        return balance;
    }

    public BigDescimal setLimit(BigDescimal limit){
        this.limit = limit;
    }
    
    public void getLimiti(){
        return limit;
    }    


}
