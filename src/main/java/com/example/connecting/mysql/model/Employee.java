package com.example.connecting.mysql.model;

import jakarta.persistence.*;

@Entity
@Table(name="empKaTable")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
