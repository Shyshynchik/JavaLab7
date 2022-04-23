package com.lab7.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "tablet")
public class Tablet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "brand", nullable = false)
    private Brand brand;

    @Column(name = "diagonal", nullable = false)
    private Integer diagonal;

    @Column(name = "ram", nullable = false)
    private Integer ram;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "os", nullable = false)
    private Os os;

    @Column(name = "memory", nullable = false)
    private Integer memory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Ноутбук - "
                + brand +
                ", Диагональ = " + diagonal +
                ", ОЗУ = " + ram +
                ", " + os +
                ", Память = " + memory +
                '\n';
    }
}