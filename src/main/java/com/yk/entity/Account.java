package com.yk.entity;

public class Account {
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }


}
