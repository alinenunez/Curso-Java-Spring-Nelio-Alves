package com.devsuperior.entities;

public class Order {

    private int codigo;
    private double valorBase;
    private double desconto;

    public Order() {

    }

    public Order(int codigo, double valorBase, double desconto) {
        this.codigo = codigo;
        this.valorBase = valorBase;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
